package com.foodiyweb.testing;

import org.springframework.http.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import org.springframework.web.client.RestTemplate;

public class DemoRCApplication {
	
	@GET
	//@Produces(MediaType.APPLICATION_XML)
public void callRestService(){
	
	RestTemplate restTemplate=new RestTemplate();
	Object  obj=restTemplate.getForObject("http://services.groupkt.com/country/get/all", Object.class);
System.out.println(obj);
}
}
