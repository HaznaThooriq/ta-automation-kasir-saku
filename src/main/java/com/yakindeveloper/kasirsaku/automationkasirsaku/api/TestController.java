//package com.yakindeveloper.kasirsaku.automationkasirsaku.api;
//
//import io.restassured.response.Response;
//
//import static net.serenitybdd.rest.SerenityRest.given;
//
//
//public class TestController {
//
//    public void testApi() {
//        String username = "kasir_saku";
//        String password = "kasir_saku";
//        Response response = given().header("cache-control", "no-cache")
//                .baseUri("http://api.kasirsaku.yakindeveloper.com")
//                .formParam("username", username).formParam("password", password)
//                .basePath("/v1/auth")
//                .when().post("/login")
//                .then().statusCode(200).extract().response();
//        response.getBody().prettyPrint();
//    }
//}