package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PelangganController {

    public void createPelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "lala")
                .formParam("alamat", "mjk")
                .formParam("phone", "082141045604")
                .formParam("email", "hazna.android@gmail.com")
                .basePath("/v1/pelanggan")
                .when().post("/create")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void updatePelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "lala")
                .formParam("alamat", "mjk")
                .formParam("phone", "082141045604")
                .formParam("email", "hazna.android@gmail.com")
                .basePath("/v1/pelanggan")
                .when().post("/update?id={id}", "68")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexPelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/pelanggan")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }


    public void viewPelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/pelanggan")
                .when().post("/view?id={id}", "68")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchPelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", "abdul")
                .basePath("/v1/pelanggan")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void deletePelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/pelanggan")
                .when().post("/delete?id={id}", "")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }
}
