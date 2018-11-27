package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SignupController {

    public void SignupHappyFlow(String nama, String toko, String kota, String username, String email, String phone, String password) {

        ValidatableResponse response = given().header("cache-control", "no-cache")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", nama).formParam("toko", toko).formParam("kota", kota)
                .formParam("username", username).formParam("email", email)
                .formParam("phone", phone).formParam("password", password)
                .basePath("/v1/auth")
                .when().post("/signup")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void SignupErrorFlow(String nama, String toko, String kota, String username, String email, String phone, String password) {

        ValidatableResponse response = given().header("cache-control", "no-cache")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", nama).formParam("toko", toko).formParam("kota", kota)
                .formParam("username", username).formParam("email", email)
                .formParam("phone", phone).formParam("password", password)
                .basePath("/v1/auth")
                .when().post("/signup")
                .then().statusCode(200);
        response.body("status", equalTo(false));
        response.extract().response().getBody().prettyPrint();
    }
}
