package com.yakindeveloper.kasirsaku.automationkasirsaku.api;

import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.given;


public class TestController {

    public void testApi() {
        String username = "kasir_saku";
        String password = "kasir_saku";
        Response response = given().header("cache-control", "no-cache")
                .baseUri("http://api.kasirsaku.yakindeveloper.com")
                .formParam("username", username).formParam("password", password)
                .basePath("/v1/auth")
                .when().post("/login")
                .then().statusCode(200).extract().response();

        response.getBody().prettyPrint();


/*        HttpResponse response = Unirest.post("http://api.kasirsaku.yakindeveloper.com/v1/auth/signup")
                .header("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
                .header("cache-control", "no-cache")
                .header("postman-token", "786113e6-3966-699c-dfdb-407446bcedf5")
                .body("------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"nama\"\r\n\r\nhazna3\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"toko\"\r\n\r\nhazna3\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"kota\"\r\n\r\nSurabaya\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"username\"\r\n\r\nhazna3\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"email\"\r\n\r\nhaznaatthooriqoh@it.student.pens.ac.id\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"phone\"\r\n\r\n089666923911\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"password\"\r\n\r\nHazna123\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--")
                .asString();*/
        /*String username = "kasir_saku";
        String password = "kasir_saku";

        Response response = given().header("content-type", "application/json")
                .formParam("username", username).formParam("password", password)
                .baseUri("http://api.kasirsaku.yakindeveloper.com/")
                .basePath("/v1")
                .formParam("username", username).formParam("password", password)
                .when().post("/auth/login")
                .then().statusCode(200).extract().response();

        response.getBody().prettyPrint();*/

        /*Response response = given().header("content-type", "application/json")
                .baseUri("http://api.kasirsaku.yakindeveloper.com")
                .basePath("/").formParam("username", username).formParam("password", password)
                .when().post("/v1/auth/login")
                .then().statusCode(200).extract().response();

        response.getBody().prettyPrint();*/

/*        Response response = given()//.header("content-type", "application/json")
                .baseUri("http://api.kasirsaku.yakindeveloper.com")
                .basePath("/").when().get("/").then().statusCode(200).extract().response();

        response.getBody().prettyPrint();*/

    }
}
