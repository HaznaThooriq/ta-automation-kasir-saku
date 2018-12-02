package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class NotifikasiController {

    public void indexNotifikasi() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/notifikasi")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

}
