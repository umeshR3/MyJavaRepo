package com.RestEndPointMethods;

import io.restassured.RestAssured;

public class RESTAssuredGetMethod {
    public String baseURI(String response)
    {
        RestAssured.baseURI = ("http://localhost:8081");
        RestAssured.given()
                .auth()
                .preemptive()
                .basic("umeshr3","Umesh@123");
        return response;
    }

}
