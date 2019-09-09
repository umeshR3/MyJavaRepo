package utilPackage;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class RESTAPIUtil {
    public RequestSpecification getResponseAPI()
    {
       RequestSpecification baseResponse= RestAssured.given().baseUri("http://localhost:8081")
                .auth()
                .preemptive()
                .basic("umeshr3","Umesh@123");
       return baseResponse;
    }
    public int getStatuscode(String path)
    {
        return getResponseAPI().get(path).statusCode();


    }
    public JsonPath getJSONPath(String path)
    {
        return getResponseAPI().get(path).jsonPath();
    }
}
