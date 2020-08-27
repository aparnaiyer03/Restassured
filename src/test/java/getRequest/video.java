package getRequest;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class video {

	// for posting
//	@Test
//	public void test1() {
//		RequestSpecification request = RestAssured.given();
//		request.header("Content-Type", "application/json");
//		JSONObject json = new JSONObject();
//		json.put("id", "22");
//		json.put("title", "Harry Potter");
//		json.put("author", "JK Rowling");
//
//		request.body(json.toJSONString());
//		Response response = request.post("http://localhost:3000/posts");
//
//		int code = response.getStatusCode();
//		Assert.assertEquals(code, 201);
//
//	}

	// delete
//	@Test
//	public void test2() {
//		RequestSpecification request = RestAssured.given();
//
//		Response response = request.delete("http://localhost:3000/posts/21");
//
//		int code = response.getStatusCode();
//		Assert.assertEquals(code, 200);
//
//	}
//	
	//put
	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("id", "22");
		json.put("title", "Harry Potter");
		json.put("author", "Aparna Iyer");

		request.body(json.toJSONString());
		Response response = request.put("http://localhost:3000/posts/22");

		int code = response.getStatusCode();
		System.out.println("CODE "+code);
		Assert.assertEquals(code, 200);

	}

}
