package com.kiranapp.qa.tests;

import java.io.IOException;

import com.kiranapp.qa.configuration.Config;

public class BaseTest {
	protected Config config;

	public void setup() throws IOException {
		this.config = new Config();

	}
}
