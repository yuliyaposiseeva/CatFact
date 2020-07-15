package requests;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public final class PrepareRequest {

    /**
     *
     * @return
     */

    public static RequestSpecification prepareRequest() {
        RestAssured.baseURI = "https://cat-fact.herokuapp.com/";
        return RestAssured.given();
    }
}