package com.foodiyweb.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.foodiyweb.models.DataPacket;
import com.foodiyweb.restcontrollers.RestaurantSearchController;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RestaurantTracker {
	private static Logger logger= (Logger) LogManager.getLogger(RestaurantTracker.class);

	public String getRestaurantByName(String latitude, String longitude) {
		
		//String latitude ="17.4474117";
		//String longitude="78.3762304";
		String restaurantListjson="";
		Gson gson=new Gson();
		Client client = ClientBuilder.newClient();
		//PropertyReader pr=PropertyReader.getPropertyReaderSingleton();
		String restaurantListJson="";
	ArrayList<DataPacket> restaurantList=new ArrayList<>();
			try {
			//	pr.load(new FileReader(new File("/de/src/com/foodiyweb/models/foodiyapplication.properties")));
				System.out.println("entered the try catch");
				//WebTarget  webTarget=client.target(pr.getProperty(FoodiyConstants.ZOMATO_RESTAURANT_SEARCH_API)).queryParam("lat", latitude).queryParam("lon",longitude).queryParam("apikey", pr.getProperty(FoodiyConstants.ZOMATO_RESTAURANT_SEARCH_API_KEY));
				WebTarget  webTarget=client.target(FoodiyConstants.ZOMATO_RESTAURANT_SEARCH_API).queryParam("lat", latitude).queryParam("lon",longitude).queryParam("apikey", FoodiyConstants.ZOMATO_RESTAURANT_SEARCH_API_KEY);

				//Set<String> cityNames=new HashSet<>();
				Response response=webTarget.request().get();
				String listString= response.readEntity(String.class);
				JsonParser parser=new JsonParser();
				JsonObject obj=(JsonObject) parser.parse(listString);
				//JsonArray jArray=obj.get("results").getAsJsonArray();
				JsonArray restaurantsList=obj.get("restaurants").getAsJsonArray();
				System.out.println("size if restaurants is"+restaurantsList.size());
				for(int i=0;i<restaurantsList.size();i++){
					DataPacket restaurantDP=new DataPacket();
					JsonElement jele1=restaurantsList.get(i);
					JsonObject jobj1=(JsonObject) jele1;
					JsonElement restaurantelement =jobj1.get("restaurant");
					JsonObject restaurantObj=(JsonObject) restaurantelement;
					String restaurant_id=String.valueOf(restaurantObj.get("id"));//1
					String restaurant_url=String.valueOf(restaurantObj.get("url"));//2

					JsonElement location=restaurantObj.get("location");					
					
					JsonObject jobj2=(JsonObject) location;					
					String location_address=String.valueOf(jobj2.get("address"));//3
					String location_locality=String.valueOf(jobj2.get("locality"));//4
					String location_city=String.valueOf(jobj2.get("city"));//5
					String location_city_id=String.valueOf(jobj2.get("city_id"));//6
					String location_locality_verbose=String.valueOf(jobj2.get("locality_verbose"));//7

					String restaurant_cuisines=String.valueOf(restaurantObj.get("cuisines"));//8
					String restaurant_average_cost_for_two=String.valueOf(restaurantObj.get("average_cost_for_two"));//9
					String restaurant_price_range=String.valueOf(restaurantObj.get("price_range"));//10

					/*JsonArray eventsArray=restaurantObj.get("zomato_events").getAsJsonArray();
					for(int j=0;j<eventsArray.size();j++){
					JsonElement zomato_events_element=eventsArray.get(j);
					JsonObject zomato_events_obj=(JsonObject) zomato_events_element;
				}*/
					String thumb=String.valueOf(restaurantObj.get("thumb"));//11
					JsonElement users_rating_element=restaurantObj.get("user_rating");
					JsonObject users_rating_obj=(JsonObject) users_rating_element;
					String users_rating_aggregate_rating=String.valueOf(users_rating_obj.get("aggregate_rating"));//12
					String users_rating_rating_text=String.valueOf(users_rating_obj.get("rating_text"));//13
					String users_rating_rating_color=String.valueOf(users_rating_obj.get("rating_color"));//14
					String users_rating_votes=String.valueOf(users_rating_obj.get("votes"));//15
					
					String restaurant_photos_url=String.valueOf(restaurantObj.get("photos_url"));//16
					String restaurant_menu_url=String.valueOf(restaurantObj.get("menu_url"));//17
					String restaurant_featured_image=String.valueOf(restaurantObj.get("featured_image"));//18
					String restaurant_has_online_delivery=String.valueOf(restaurantObj.get("has_online_delivery"));//19
					String restaurant_is_delivering_now=String.valueOf(restaurantObj.get("is_delivering_now"));//20
					String restaurant_deeplink=String.valueOf(restaurantObj.get("deeplink"));//21
					String restaurant_has_table_booking=String.valueOf(restaurantObj.get("has_table_booking"));//22
					String restaurant_events_url=String.valueOf(restaurantObj.get("events_url"));//23

					restaurantDP.put("restaurant_id", restaurant_id);
					restaurantDP.put("restaurant_url", restaurant_url);
					restaurantDP.put("location_address", location_address);
					restaurantDP.put("location_locality", location_locality);
					restaurantDP.put("location_city", location_city);
					restaurantDP.put("location_city_id", location_city_id);
					restaurantDP.put("location_locality_verbose", location_locality_verbose);
					restaurantDP.put("restaurant_average_cost_for_two", restaurant_average_cost_for_two);
					restaurantDP.put("restaurant_price_range", restaurant_price_range);
					restaurantDP.put("restaurant_cuisines", restaurant_cuisines);
					restaurantDP.put("thumb", thumb);
					restaurantDP.put("users_rating_aggregate_rating", users_rating_aggregate_rating);
					restaurantDP.put("users_rating_rating_text", users_rating_rating_text);
					restaurantDP.put("users_rating_rating_color", users_rating_rating_color);
					restaurantDP.put("users_rating_votes", users_rating_votes);
					restaurantDP.put("restaurant_photos_url", restaurant_photos_url);
					restaurantDP.put("restaurant_menu_url", restaurant_menu_url);
					restaurantDP.put("restaurant_featured_image", restaurant_featured_image);
					restaurantDP.put("restaurant_has_online_delivery", restaurant_has_online_delivery);
					restaurantDP.put("restaurant_is_delivering_now", restaurant_is_delivering_now);
					restaurantDP.put("restaurant_deeplink", restaurant_deeplink);
					restaurantDP.put("restaurant_has_table_booking", restaurant_has_table_booking);
					restaurantDP.put("restaurant_events_url", restaurant_events_url);
					restaurantDP.put("restaurant_id", restaurant_id);

					restaurantList.add(restaurantDP);
					
					
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(restaurantList.size());
			 restaurantListjson=gson.toJson(restaurantList);
		return  restaurantListjson;
	}

}
