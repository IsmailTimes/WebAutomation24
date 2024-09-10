package org.example.cucumber.runner;

// https://qaautomation.expert/2024/01/18/integration-of-cucumber-with-selenium-and-junit4/

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		//features = "classpath:features/",
		//features = {"src/test/resources/features/LoginPage.feature", "src/test/resources/features/IRSHomePage.feature" },
		features = "src/test/resources/features/",
		glue = {"org.example.cucumber.runner","org.example.definitions"},
		//tags = {"@IRSHomePageLinksTest"},
		monochrome = true
		)

public class CucumberTestRunner {

}