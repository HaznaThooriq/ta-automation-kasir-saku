package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BarangController {


    public void barangIndexHappyFlow(String auth) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void barangViewHappyFlow(String auth, String id) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/view?id={id}", id)
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void scanBarcode(String auth, String barcode) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/scan?barcode={barcode}", barcode)
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchBarang(String auth, String keyword) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", keyword)
                .basePath("/v1/barang")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void tambahStockBarang(String id, String auth, String stock, String hargaSupplier, String hargaBaru){
        ValidatableResponse response = given().header("Authorization", auth)
                .contentType("application/x-www-form-urlencoded")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("stok", stock).formParam("hargaSupplier", hargaSupplier).formParam("hargaBaru", hargaBaru)
                .basePath("/v1/barang")
                .when().post("/view?id={id}", id)
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void deleteBarang(String id, String auth){
        ValidatableResponse response = given().header("Authorization", auth)
                .contentType("application/x-www-form-urlencoded")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/delete?id={id}", id)
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }

    public void barangIndexErrorFlow(String auth) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/index")
                .then().statusCode(401);
        response.body("status", equalTo(401));
        response.extract().response().getBody().prettyPrint();
    }

    public void barangViewErrorFlow(String auth, String id) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/view?id={id}", id)
                .then().statusCode(404);
        response.body("status", equalTo(404));
        response.extract().response().getBody().prettyPrint();
    }

    public void scanBarcodeErrorFlow(String auth, String barcode) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/scan?barcode={barcode}", barcode)
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchBarangErrorFlow(String auth, String keyword) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", keyword)
                .basePath("/v1/barang")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void tambahStockBarangErrorFlow(String id, String stock, String hargaSupplier, String hargaBaru){
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR29283g==")
                .contentType("application/x-www-form-urlencoded")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("stok", stock).formParam("hargaSupplier", hargaSupplier).formParam("hargaBaru", hargaBaru)
                .basePath("/v1/barang")
                .when().post("/view?id={id}", id)
                .then().statusCode(401);
        response.body("status", equalTo(401));
        response.extract().response().getBody().prettyPrint();
    }

    public void deleteBarangErrorFlow(String id, String auth){
        ValidatableResponse response = given().header("Authorization", auth)
                .contentType("application/x-www-form-urlencoded")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/barang")
                .when().post("/delete?id={id}", id)
                .then().statusCode(401);
        response.body("status", equalTo(401));
        response.extract().response().getBody().prettyPrint();
    }
}
