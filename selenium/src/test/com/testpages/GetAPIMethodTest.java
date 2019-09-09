
package com.testpages;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

import static io.restassured.RestAssured.given;

public class GetAPIMethodTest {
    Utillclass utillclass;

    @Test
    public void getAPImethodDemo()
    {
        RestAssured.baseURI=("http://localhost:8081");
        RestAssured.given()
                .auth()
                .preemptive().basic("umeshr3","Umesh@123")
                .when()
                .get("/rest/api/2/issue/SCRUM-25")
                .then()
                .assertThat()
                .statusCode(200).log().all();

       /*utillclass=new Utillclass();
        RequestSpecification httpResquest= RestAssured.given().auth()
                .basic("umeshr3","Umesh@123").get("http://localhost:8081/rest/api/2/issue/SCRUM-25").
       // String getAPIRespone=utillclass.getAPIMethod();

        Response response = httpResquest.request(Method.GET, getAPIRespone);
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
*/
        /*given()
                //.auth()
               //.basic("umeshr3", "Umesh@123")
                .get("http://localhost:8081/rest/api/2/issue/SCRUM-25")
                .then()
                //.statusCode(200)
                .log().all();*/

//                .auth()
//                .basic("umeshr3", "Umesh@123")
//                .when()
//                .get("http://localhost:8081/rest/api/2/issue/SCRUM-25");
//


                //.assertThat()
                //.statusCode(401);


    }


}
