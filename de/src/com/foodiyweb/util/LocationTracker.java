package com.foodiyweb.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.foodiyweb.models.LatAndLonPacket;
import com.foodiyweb.restcontrollers.RestaurantSearchController;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LocationTracker {

	//public static void main(String[] args) {
	private static Logger logger= (Logger) LogManager.getLogger(LocationTracker.class);

	//	String placeId="ChIJ32ldjNyTyzsR7qB_VeuLaBk";
public LatAndLonPacket getLatitudeAndLongitudeFromPlace(String placeId){
		
		LatAndLonPacket latAndLonPacket=new LatAndLonPacket();
		System.out.println("the data from client is >>>>>>"+placeId);
		Gson gson=new Gson();
		Client client = ClientBuilder.newClient();
		//PropertyReader pr=PropertyReader.getPropertyReaderSingleton();
		String locationJson="";
		try {
		//	pr.load(new FileReader(new File("/de/src/com/foodiyweb/models/foodiyapplication.properties")));
			logger.info("entered the try catch");
			//WebTarget  webTarget=client.target(pr.getProperty(FoodiyConstants.GOOGLE_PLACE_GEOCODE_API)).queryParam("place_id", placeId).queryParam("key", pr.getProperty(FoodiyConstants.GOOGLE_PLACE_GEOCODE_API_KEY));
			WebTarget  webTarget=client.target(FoodiyConstants.GOOGLE_PLACE_GEOCODE_API).queryParam("place_id", placeId).queryParam("key", FoodiyConstants.GOOGLE_PLACE_GEOCODE_API_KEY);

			//Set<String> cityNames=new HashSet<>();
			Response response=webTarget.request().get();
			String listString= response.readEntity(String.class);
			JsonParser parser=new JsonParser();
			JsonObject obj=(JsonObject) parser.parse(listString);
			//JsonArray jArray=obj.get("results").getAsJsonArray();
			JsonElement results=obj.get("results");
  
			JsonArray jsonObjArray=(JsonArray) results;
			System.out.println(jsonObjArray.size());
			//JsonObject geometry=(JsonObject) jsonObj.get("geometry");
			JsonElement jsonElement=jsonObjArray.get(0);
			JsonObject jobj=(JsonObject) jsonElement;
			JsonElement jele= jobj.get("geometry");
			jobj=(JsonObject) jele;
			jsonElement=jobj.get("location");
			jobj=(JsonObject) jsonElement;
			String latitude=String.valueOf(jobj.get("lat"));
			String longitude=String.valueOf(jobj.get("lng"));
			latAndLonPacket.setLatitude(latitude);
			latAndLonPacket.setLongitude(longitude);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return latAndLonPacket;

			
				
	
			
			
}
}
