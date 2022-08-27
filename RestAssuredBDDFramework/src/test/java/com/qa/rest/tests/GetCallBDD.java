package com.qa.rest.tests;


import static io.restassured.RestAssured.*; //manually do these static imports
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;//manually do these static imports



public class GetCallBDD {

		
		@Test
		public void CircuitTest() {
			
			given().
			 when().
			 	get("http://ergast.com/api/f1/2017/circuits.json").
			 	then().
			assertThat().
			
			statusCode(200).         
			
			and().
			
			header("Content-Length", "4552").
			
			and().
			
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));

}
		
}
