package com.foodiyweb.restcontrollers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpRequest;
//import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.foodiyweb.models.LocationPacket;
import com.foodiyweb.util.FoodiyConstants;
import com.foodiyweb.util.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class CityController {

	private static Logger logger=LogManager.getLogger(CityController.class);
	
		@RequestMapping(value="getCityNames.htm" ,method=RequestMethod.POST )
		
	public @ResponseBody String getCityNamesByKeyword(@RequestBody String data,HttpServletRequest req){
		logger.info("the data from client is >>>>>>"+data);
		Gson gson=new Gson();
		Client client = ClientBuilder.newClient();
		//PropertyReader pr=PropertyReader.getPropertyReaderSingleton();
		String locationListJSON="";
		try {
			//pr.load(new FileReader(new File("/de/src/com/foodiyweb/models/foodiyapplication.properties")));
			Set<LocationPacket> listOfLocationNames=new HashSet<>();
		//	WebTarget  webTarget=client.target(pr.getProperty(FoodiyConstants.GOOGLE_PLACE_AUTOCOMPLETE_API)).
			WebTarget  webTarget=client.target(FoodiyConstants.GOOGLE_PLACE_AUTOCOMPLETE_API).

					queryParam("input", data).
					//queryParam("key", pr.getProperty(FoodiyConstants.GOOGLE_PLACE_AUTOCOMPLETE_API_KEY)).queryParam("radius", "500");
					queryParam("key", FoodiyConstants.GOOGLE_PLACE_AUTOCOMPLETE_API_KEY).queryParam("radius", "500");

			//Set<String> cityNames=new HashSet<>();
			Response response=webTarget.request().get();

			String listString= response.readEntity(String.class);
			JsonParser parser=new JsonParser();
			JsonObject obj=(JsonObject) parser.parse(listString);
			JsonArray jArray=obj.get("predictions").getAsJsonArray();
			
			logger.info(jArray.size());

			for(int i=0;i<jArray.size();i++)
			{
				LocationPacket locationPacket=new LocationPacket();
				JsonElement jsonElement=jArray.get(i);
				JsonObject jsonObject1=(JsonObject) jsonElement;
				JsonObject jsonArray=(JsonObject) jsonObject1.get("structured_formatting");
				logger.info(jsonArray.get("main_text"));
				String country=String.valueOf(jsonArray.get("secondary_text"));
				if(country!="null"  && country.contains("India"))
				
				{
					String place_id=String.valueOf(jsonObject1.get("place_id"));
					String locationName=jsonArray.get("main_text").toString();
					locationPacket.setPlaceId((place_id.subSequence(1, place_id.length()-1)).toString());
					locationPacket.setLocationName((locationName.subSequence(1, locationName.length()-1)).toString());
					listOfLocationNames.add(locationPacket);
				}
			}
			locationListJSON=gson.toJson(listOfLocationNames);

		/*} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("the response is ++++++++"+locationListJSON);
		return locationListJSON;

	}
		@RequestMapping(value="sessionInvalide.htm",method=RequestMethod.GET)
		public ModelAndView invalidateSession(HttpServletRequest req){
			ModelAndView  modelAndView =new ModelAndView();
			HttpSession session=req.getSession(false);
			logger.info("the session invalidator has been called");
			session.invalidate();
			modelAndView.setViewName("logout");
			modelAndView.addObject("logoutMessage", "You have been Successfully Logged Out !");
			return modelAndView; 
			
			
		
		}

}
