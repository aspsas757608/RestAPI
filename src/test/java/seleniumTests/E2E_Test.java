package seleniumTests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import Utils.RestAssuredUtils;

public class E2E_Test {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/";
		String res = given()
				.when().get("api/users/2")
				.then().extract().asString();
		System.out.println("Response: " + res);
		String value = RestAssuredUtils.getStringJsonValue(res, "data.email");
		System.out.println("email: " + value);

	}

}
