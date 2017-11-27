package com.foodiyweb.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.foodiyweb.util.FoodiyConstants;
import com.foodiyweb.util.PropertyReader;

public class APITester {

	public void forAPITesting(String URL,HashMap<String,String> params){
		Client client = ClientBuilder.newClient();
		PropertyReader pr=PropertyReader.getPropertyReaderSingleton();
		String responseJSON="";
		
			
				List<String> listOfCityNames=new ArrayList<>();
				WebTarget  webTarget=client.target(URL);

				webTarget.queryParam("input", "").
						queryParam("key", pr.getProperty(FoodiyConstants.GOOGLE_PLACE_AUTOCOMPLETE_API_KEY)).queryParam("radius", "500");

				Response response=webTarget.request().get();
			
			

	}
	
}
