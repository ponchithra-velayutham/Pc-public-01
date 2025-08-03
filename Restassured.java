package com.example.selenium;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.json.JSONObject;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.specification.RequestSpecification;


public class empty {
	
	
	
	private static RequestSpecification request;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GET
		Response r = given()
				.when().
				get("https://reqres.in/api/users/2");
		System.out.print(r.getHeaders());
		System.out.print(r.getBody().asString());
		
		//POST
		JSONObject requestBody = new JSONObject();
        requestBody.put("name", "John Doe");
        requestBody.put("job", "Software Engineer");
        
		
		Response r1 = given().header("Content-Type", "application/json").body("{\"name\":\"John Doe\",\"job\":\"Software Engineer\"}" ).when().post("https://reqres.in/api/users").then().statusCode(201).body("name", equalTo("John Doe")).extract().response();
		System.out.print(r1.getBody().asPrettyString());
		//DELETE
		
		Response r2 = given().log().all().header("Content-Type", "application/json").when().delete("https://reqres.in/api/users/2").then().log().body().extract().response();
		System.out.print(r2.getStatusCode());
		
		RequestSpecification request = given().header("Content-Type", "application/json").baseUri("https://reqres.in/api/users/2");
		String usr = "";
		String pwd = ";";
		
		Response r3 = given().auth().basic(usr, pwd).when().get("https://reqres.in/api/users/2").then().extract().response();
	}
	
	public void request()
	{
		given().spec(request).when().get("https://reqres.in/api/users/2").then().statusCode(200);
	}

}
