package com.kiranapp.qa.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Config {
	protected Properties configProperties;

	public Config() throws IOException {
		this.configProperties = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\kiran\\mySchool\\testing-automation\\src\\test\\resources\\datadriven.properties");
		configProperties.load(file);

	}
	
	public String getProperty(String name)
	{
		return configProperties.getProperty(name);
	}

}
