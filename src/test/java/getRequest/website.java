package getRequest;

import static io.restassured.RestAssured.get;

import java.util.List;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.Argument;
import io.restassured.specification.RequestSpecification;


public class website {

	// for posting
	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("name", "Anand Iyer");
		json.put("job", "Financial  Analyst");
		json.put("ID", "07");

		request.body(json.toJSONString());
		Response response = request.post("https://reqres.in/api/users");

		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);

	}

	// delete
	@Test
	public void test2() {
		RequestSpecification request = RestAssured.given();

		Response response = request.delete("https://reqres.in/api/users/2");

		int code = response.getStatusCode();
		Assert.assertEquals(code, 204);

	}
	
	//put
	@Test
	public void test3() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("name", "Aparna Iyer");
		json.put("job", "Software Engineer");

		request.body(json.toJSONString());
		Response response = request.put("https://reqres.in/api/users/2");

		int code = response.getStatusCode();
		System.out.println("CODE "+code);
		Assert.assertEquals(code, 200);

	}
	
	//details of all users
	@Test
	public void test4() {

		String data = get(
				"https://reqres.in/api/users?page=2")
						.asString();
		System.out.println("Data is " + data);
		long time = get(
				"https://reqres.in/api/users?page=2")
						.getTime();
		System.out.println("Response time " + time);
		
		

	}
	
	
	//michael
	@Test
	public void test5() {

		String data = get(
				"	https://reqres.in/api/users/7" ).asString();
		System.out.println("Data is " + data);
		long time = get(
				"https://reqres.in/api/users?page=2")
						.getTime();
		System.out.println("Response time " + time);
		
		

	}
	

	
}
