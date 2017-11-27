package com.foodiyweb.restcontrollers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodiyweb.util.FoodiyConstants;
import com.foodiyweb.util.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class LocationController {
	private static Logger logger=LogManager.getLogger(LocationController.class);

	@RequestMapping(value="getGeocodesForLocation.htm",method=RequestMethod.POST)
	public String getTheGeoCodeOfLocationName( @RequestParam("cityName")String locationName,HttpServletRequest req){
		
		
		
		System.out.println("the data from client is >>>>>>"+locationName);
		Gson gson=new Gson();
		Client client = ClientBuilder.newClient();
		//PropertyReader pr=PropertyReader.getPropertyReaderSingleton();
		String locationJson="";
		
			try {
			//	pr.load(new FileReader(new File("/de/src/com/foodiyweb/models/foodiyapplication.properties")));

				//WebTarget  webTarget=client.target(pr.getProperty(FoodiyConstants.GOOGLE_PLACE_GEOCODE_API)).
				WebTarget  webTarget=client.target(FoodiyConstants.GOOGLE_PLACE_GEOCODE_API).

						queryParam("address", locationName).
					//	queryParam("key", pr.getProperty(FoodiyConstants.GOOGLE_PLACE_GEOCODE_API_KEY));
						queryParam("key", FoodiyConstants.GOOGLE_PLACE_GEOCODE_API_KEY);

				//Set<String> cityNames=new HashSet<>();
				Response response=webTarget.request().get();
				String listString= response.readEntity(String.class);
				JsonParser parser=new JsonParser();
				JsonObject obj=(JsonObject) parser.parse(listString);
				//JsonArray jArray=obj.get("predictions").getAsJsonArray();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return "success";
	}
	
	
	
	
}
