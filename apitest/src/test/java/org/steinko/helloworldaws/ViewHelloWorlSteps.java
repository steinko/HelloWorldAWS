package org.steinko.helloworldaws;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class ViewHelloWorlSteps {
	
	Response response;
	
	@Given("the HelloWorlsAWS application is runing")
	public void the_hello_worls_aws_application_is_runing() {
	   
	}

	@When("acivating URL {string}")
	public void acivating_url(String url) {
	
		 response =   	   
	   	   given()
	       .when()
	          .get(url)
	       .then()
	         .statusCode(200)
	         .contentType("text/plain")
	       .extract()
		       .response(); 
	}

	@Then("the HelloWorlsAWS application displays {string}")
	public void the_hello_worls_aws_application_displays(String message) {
	    assertEquals(message, response.getBody().asString());
	}

}
