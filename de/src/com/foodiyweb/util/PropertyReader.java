package com.foodiyweb.util;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertyReader  extends Properties{
	
	private static Logger logger=LogManager.getLogger(PropertyReader.class);
	 private static PropertyReader singletonObject=null;

	public static PropertyReader getPropertyReaderSingleton(){
		 if(singletonObject==null){
			 singletonObject=new PropertyReader();
		 }
		 logger.info("the hashcode of PropeertyReader is "+singletonObject.hashCode());
		return singletonObject;
		
	}
	
	private PropertyReader( ){
		
	}
	
	
}
