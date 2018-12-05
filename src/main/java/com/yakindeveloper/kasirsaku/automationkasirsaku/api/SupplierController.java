package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SupplierController {

    public void createSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "lala")
                .formParam("alamat", "mjk")
                .formParam("phone", "082141045604")
                .formParam("email", "hazna.android@gmail.com")
                .basePath("/v1/supplier")
                .when().post("/create")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void updateSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "lala")
                .formParam("alamat", "mjk")
                .formParam("phone", "082141045604")
                .formParam("email", "hazna.android@gmail.com")
                .basePath("/v1/supplier")
                .when().post("/update?id={id}", "6")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/supplier")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }


    public void viewSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/supplier")
                .when().post("/view?id={id}", "8")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", "abdul")
                .basePath("/v1/supplier")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void deleteSupplier() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/supplier")
                .when().post("/delete?id={id}", "6")
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }

    public void createSupplierInvalidAuth() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "lala")
                .formParam("alamat", "mjk")
                .formParam("phone", "082141045604")
                .formParam("email", "hazna.android@gmail.com")
                .basePath("/v1/supplier")
                .when().post("/create")
                .then().statusCode(401);
        response.body("status", equalTo(401));
        response.extract().response().getBody().prettyPrint();
    }

    public void updateSupplierInvalidId() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "lala")
                .formParam("alamat", "mjk")
                .formParam("phone", "082141045604")
                .formParam("email", "hazna.android@gmail.com")
                .basePath("/v1/supplier")
                .when().post("/update?id={id}", "600")
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexSupplierInvalidAuth() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/supplier")
                .when().post("/index")
                .then().statusCode(401);
        response.body("status", equalTo(401));
        response.extract().response().getBody().prettyPrint();
    }


    public void viewSupplierInvalidId() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/supplier")
                .when().post("/view?id={id}", "800")
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchSupplierInvalidId() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", "abdul")
                .basePath("/v1/supplier")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void deleteSupplierInvalidId() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/supplier")
                .when().post("/delete?id={id}", "pp")
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }
}
