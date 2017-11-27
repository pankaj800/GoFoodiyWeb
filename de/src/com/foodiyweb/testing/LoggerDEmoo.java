package com.foodiyweb.testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

import org.apache.catalina.WebResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.foodiyweb.models.LatAndLonPacket;
import com.foodiyweb.util.FoodiyConstants;
import com.foodiyweb.util.LocationTracker;
import com.foodiyweb.util.PropertyReader;
import com.foodiyweb.util.RestaurantTracker;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;



public class LoggerDEmoo {
	@Autowired
	static
	LocationTracker locationTracker;
	@Autowired
	static LatAndLonPacket latAndLonPacket;
	
	@Autowired
	static RestaurantTracker restaurantTracker;
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		String data="ChIJ32ldjNyTyzsR7qB_VeuLaBk";
		//JsonParser jsonParser=new JsonParser();
		//JsonObject jsonObject=(JsonObject) jsonParser.parse(data);
		//String placeId=String.valueOf(jsonObject.get("placeId"));
		latAndLonPacket=locationTracker.getLatitudeAndLongitudeFromPlace(data);
		//logger.info("the data is"+data);

		String latitude=latAndLonPacket.getLatitude();
		String longitude=latAndLonPacket.getLongitude();
		
		String restaurantJson=restaurantTracker.getRestaurantByName(latitude, longitude);
		System.out.println(restaurantJson);
			
	}
		

	
	
	
	public void demoMetjod(){
		Client client = ClientBuilder.newClient();
		
		WebTarget  webTarget=client.target("https://maps.googleapis.com/maps/api/place/autocomplete/json").
				queryParam("input", "bang").
				queryParam("key", "AIzaSyAkuobMTU5ZIhfVTlv9NkkBteMhp86ezpw").queryParam("radius", "1000");
		
		Set<String> cityNames=new HashSet<>();
		 Response response=webTarget.request().get();
		 
		// https://maps.googleapis.com/maps/api/place/autocomplete/json?
				//	input=banga&key=AIzaSyAkuobMTU5ZIhfVTlv9NkkBteMhp86ezpw&radius=1000
				
		String listString= response.readEntity(String.class);
		JsonParser parser=new JsonParser();
		JsonObject obj=(JsonObject) parser.parse(listString);
		JsonArray jArray=obj.get("predictions").getAsJsonArray();
		System.out.println(jArray.size());
		
	for(int i=0;i<jArray.size();i++){
		JsonElement jsonElement=jArray.get(i);
		JsonObject jsonObject1=(JsonObject) jsonElement;
		JsonObject jsonArray=(JsonObject) jsonObject1.get("structured_formatting");
	System.out.println(jsonArray.get("main_text"));
	}
		
	}
	
	
	public void propertyRedarMethod(){
PropertyReader pr=PropertyReader.getPropertyReaderSingleton();
		
	//	pr.load(new FileReader(new File("/de/src/foodiyapplication.properties")));
	    System.out.println(pr.getProperty(FoodiyConstants.GOOGLE_PLACE_AUTOCOMPLETE_API_KEY));  
	}
}
