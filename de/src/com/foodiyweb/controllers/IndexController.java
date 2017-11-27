package com.foodiyweb.controllers;

import org.apache.logging.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class IndexController {

private  static Logger logger=LogManager.getLogger(IndexController.class);

@RequestMapping(value="index.htm" ,method=RequestMethod.POST)
	public ModelAndView indexDemo(HttpServletRequest req){
		ModelAndView modelAndView=new ModelAndView();
		System.out.println("entered the mapping");
		HttpSession session=req.getSession(false);
		String uname=req.getParameter("username");
		String password=req.getParameter("password");

		logger.info("the user name is >>>>>"+uname);
		if(uname.equalsIgnoreCase("ratnakunj")&&password.equalsIgnoreCase("okjanu123"))
		{
			System.out.println("true");

		session.setAttribute("username", "Pankaj");
		modelAndView.setViewName("main");
		}
		else{
			modelAndView.addObject("errormessage", "Oops !! Login Failed");
			modelAndView.setViewName("errorpage");

		}
		
		
		return modelAndView;
	}
	
	
	@RequestMapping(value="setLocation.htm" ,method=RequestMethod.POST)
	public @ResponseBody String setLocationInSession(@RequestBody String data,HttpServletRequest req){
		JsonObject jobj=new JsonParser().parse(data).getAsJsonObject();
		String location=jobj.get("city").getAsString();
		logger.info("the location is "+location);
		System.out.println("the location is "+location);
		HttpSession session=req.getSession(false);
		session.setAttribute("location", location);
		String locationJson=new Gson().toJson(location);
		return locationJson;
	}
	
	@RequestMapping(value="getMap.htm")
	public String redirectToBusinessLogin(HttpServletRequest req){
		HttpSession session=req.getSession(false);

return "mymap";
	}
 		
}
