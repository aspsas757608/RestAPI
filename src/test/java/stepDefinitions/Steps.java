package stepDefinitions;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class Steps {
	
	
	String res = null;
	@Given("User access the URL")
	public void user_access_the_url() {
		RestAssured.baseURI = "https://reqres.in";
		System.out.println("BaseURI: is https://reqres.in");
	}
	@When("User passes user id as {string}")
	public void user_passes_user_id_as(String userid) {
		res = given()
				.when().get("/api/users/"+ userid)
				.then().extract().asString();
	}
	@Then("Full info user in json format be displayed")
	public void full_info_user_in_json_format_be_displayed() {
		System.out.println("Response: " + res);
	}


}
