package com.foodiyweb.restcontrollers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodiyweb.models.LatAndLonPacket;
import com.foodiyweb.util.LocationTracker;
import com.foodiyweb.util.RestaurantTracker;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RestController
public class RestaurantSearchController {
	
	private static Logger logger= (Logger) LogManager.getLogger(RestaurantSearchController.class);
	
	@RequestMapping(value="getRestaurantByLocationName.htm",method=RequestMethod.POST)
	public  @ResponseBody String fetchRestaurantsByLocationName(@RequestBody String data){
		
		LocationTracker locationTracker=new LocationTracker();
		LatAndLonPacket latAndLonPacket=new LatAndLonPacket();
		
		RestaurantTracker restaurantTracker=new RestaurantTracker();
		JsonParser jsonParser=new JsonParser();
		JsonObject jsonObject=(JsonObject) jsonParser.parse(data);
		String placeId=String.valueOf(jsonObject.get("placeId"));
		placeId=(String) placeId.subSequence(1, placeId.length()-1);
		latAndLonPacket=locationTracker.getLatitudeAndLongitudeFromPlace(placeId);
		logger.info("the data is"+data);

		String latitude=latAndLonPacket.getLatitude();
		String longitude=latAndLonPacket.getLongitude();
		
		String restaurantJson=restaurantTracker.getRestaurantByName(latitude, longitude);
		return restaurantJson;
		
		
	}

}
