package webServicesTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class UserApiTest {

	@Test
	public void VerifyEmailInResponse() {

		// base URL
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		RestAssured.basePath = "users/8";

		// response from GET request & print the email in console
		given().when().get();
		String emailValue = given().contentType(ContentType.JSON).get().then().extract().path("email");
		System.out.println(emailValue);

	}

	@Test
	public void userPost() {
		Response response = given().contentType(ContentType.JSON).when()
				.get("https://jsonplaceholder.typicode.com/posts?userId=4").then().assertThat().statusCode(200)
				.extract().response();
		String responseInString = response.asString();
		System.out.println(responseInString);

		// Using the userID, get the user’s associated posts and
		JsonPath jsonPath = new JsonPath(responseInString);
		String userPosts = jsonPath.getString("userId");
		System.out.println(userPosts);
	}
}
