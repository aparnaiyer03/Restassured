package getRequest;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getData2 {
	@Test
	public void testResponsecode() {

		int code1 = get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
						.getStatusCode();
		System.out.println("Status code is " + code1);
		Assert.assertEquals(code1, 200);

	}

	@Test
	public void testbody() {

		String data = get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
						.asString();
		System.out.println("Data is " + data);
		long time = get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
						.getTime();
		System.out.println("Response time " + time);

	}

}
