package org.example.cucumber.runner;

// https://qaautomation.expert/2024/01/18/integration-of-cucumber-with-selenium-and-junit4/
// https://qaautomation.expert/2021/05/05/parallel-testing-in-cucumber-with-junit/#step-6-create-the-page-object-model-classes-of-loginpage-and-forgotpasswordpage-feature-files

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		//features = "classpath:features/",
		//features = {"src/test/resources/features/LoginPage.feature", "src/test/resources/features/IRSHomePage.feature" },
		features = "src/test/resources/features/",
		glue = {"org.example.cucumber.runner","org.example.definitions"},
		//tags = "",
		monochrome = true
		)

public class CucumberTestRunner {

}