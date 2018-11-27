package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ProfileController {

    public void profilHappyFlow(String auth) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/profile")
                .when().post("/view")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void profilErrorFlow(String auth) {

        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/profile")
                .when().post("/view")
                .then().statusCode(401);
        response.extract().response().getBody().prettyPrint();
    }
}
