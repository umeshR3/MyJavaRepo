package com.RestAssuredTestMethods;

import org.testng.annotations.Test;
import utilPackage.RESTAPIUtil;

public class RestAssuredPostTest {
    RESTAPIUtil restapiUtil;

    @Test
    public void postMethodDemo()
    {
        restapiUtil=new RESTAPIUtil();
        System.out.println( restapiUtil.getStatuscode("/rest/api/2/issue/SCRUM-25"));

    }
    @Test
    public void postMethod()
    {
        restapiUtil=new RESTAPIUtil();
        restapiUtil.getResponseAPI()
                .given().contentType("application/json")
                .accept("application/json")
                .body("null")
                .when()
                .post("/rest/api/2/issue/bulk");
    }
    @Test
    public void getJsonPath()
    {
        restapiUtil=new RESTAPIUtil();
        System.out.println(java.util.Optional.ofNullable(restapiUtil.getJSONPath("/rest/api/2/issue/SCRUM-25").get("id")));

    }
}
