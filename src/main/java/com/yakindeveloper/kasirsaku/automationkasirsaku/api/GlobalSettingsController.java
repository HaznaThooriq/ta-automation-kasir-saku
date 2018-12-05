package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GlobalSettingsController {

    public void indexGlobalSettings() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/global-setting")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void appAndroidVersionGlobalSettings() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/global-setting")
                .when().post("/app-android-version")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexGlobalSettingsInvalidAuth() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/global-setting")
                .when().post("/index")
                .then().statusCode(404);
        response.body("status", equalTo(false));
        response.extract().response().getBody().prettyPrint();
    }

    public void appAndroidVersionGlobalSettingsInvalidAuth() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/global-setting")
                .when().post("/app-android-version")
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }
}
