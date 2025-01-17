package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginController {

    public void loginHappyFlow(String username, String password) {

        ValidatableResponse response = given().header("cache-control", "no-cache")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("username", username).formParam("password", password)
                .basePath("/v1/auth")
                .when().post("/login")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void loginErrorFlow(String username, String password) {

        ValidatableResponse response = given().header("cache-control", "no-cache")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("username", username).formParam("password", password)
                .basePath("/v1/auth")
                .when().post("/login")
                .then().statusCode(200);
        response.body("status", equalTo(false));
        response.extract().response().getBody().prettyPrint();
    }
}
