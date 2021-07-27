package org.steinko.helloworldaws;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class ViewHelloWorlSteps {
	
	@Given("the HelloWorlsAWS application is runing")
	public void the_hello_worls_aws_application_is_runing() {
	   
	}

	@When("acivating URL {string}")
	public void acivating_url(String url) {
	
	   	   
	   	   given()
	       .when()
	          .get(url)
	       .then()
	         .statusCode(200); 
	}

	@Then("the HelloWorlsAWS application displays {string}")
	public void the_hello_worls_aws_application_displays(String message) {
	    assertEquals(message, "Hello AWS Elastic Beanstalk! From host: ip-172-31-6-15.eu-north-1.compute.internal/172.31.6.15" );
	}

}
