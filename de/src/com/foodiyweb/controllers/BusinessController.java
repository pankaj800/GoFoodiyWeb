package com.foodiyweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BusinessController {
	
	@RequestMapping(value="gotobusinesslogin.htm")
	public String redirectToBusinessLogin(){
		
		return "businesslogin";
	}

	
	
	@RequestMapping(value="businessdashboard.htm")
	public String showBusinessDashboard(){
		return "businesscontent";
	}

	
	@RequestMapping(value="extras.htm")
	public String redirect(){
		
		return "extras";
	}
	
	
	@RequestMapping(value="gotoRestaurantDetails.htm")
	public String fetchRestaurantDetails(){
		
		return "restaurantcontent";
	}
}
