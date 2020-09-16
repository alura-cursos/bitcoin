package br.com.alura.resource;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
public class BitcoinResourceTest {
	
	@Test
	public void testarSeStatusCodeDaRequisicaoE200() {
		RestAssured.given().get("/bitcoins").then().statusCode(200);
	}

}
