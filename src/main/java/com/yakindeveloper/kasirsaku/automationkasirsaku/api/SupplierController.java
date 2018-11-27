package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SupplierController {

    public void createSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/hutang")
                .when().post("/pelanggan?id={id}", "31")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void updateSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("jumlah_bayar", "1000")
                .basePath("/v1/hutang")
                .when().post("/bayar?id={id}", "34")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }


    public void viewSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/hutang")
                .when().post("/view?id={id}", "34")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", "abdul")
                .basePath("/v1/hutang")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void deleteSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }
}
