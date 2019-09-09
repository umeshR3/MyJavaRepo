package com.RestAssuredTestMethods;

import com.RestEndPointMethods.RESTAssuredGetMethod;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAssuredGetTest {
    RESTAssuredGetMethod restAssuredGetMethod;

    @Test
    public void getAPIMethod() {
        // restAssuredGetMethod=new RESTAssuredGetMethod();
        // restAssuredGetMethod.baseURI(response);
//        RestAssured.baseURI="http://localhost:8081";
        String res = RestAssured.given().baseUri("http://localhost:8081")
                .auth()
                .preemptive()
                .basic("umeshr3", "Umesh@123")
                .get("/rest/api/2/issue/SCRUM-25")
                .jsonPath().get("id");

        System.out.println(res);


    }
}
