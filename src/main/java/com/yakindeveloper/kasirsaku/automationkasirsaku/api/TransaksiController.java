package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TransaksiController {

    public void transaksiBayar() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("id_pelanggan", "31")
                .formParam("nama", "Abdul")
                .formParam("alamat", "Surabaya")
                .formParam("phone", "086357654722")
                .formParam("email", "abdul@mail.com")
                .formParam("jumlah_bayar", "10000")
                .formParam("barang[0][id_barang]", "23")
                .formParam("barang[0][qty]", "25")
                .basePath("/v1/transaksi")
                .when().post("/bayar")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexTransaksi() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }


    public void viewTransaksi() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi")
                .when().post("/view?id={id}", "34")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchTransaksi() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", "abdul")
                .basePath("/v1/transaksi")
                .when().post("/search")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void transaksiBayarInvalidIdPelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("id_pelanggan", "3")
                .formParam("nama", "Abdul")
                .formParam("alamat", "Surabaya")
                .formParam("phone", "086357654722")
                .formParam("email", "abdul@mail.com")
                .formParam("jumlah_bayar", "10000")
                .formParam("barang[0][id_barang]", "23")
                .formParam("barang[0][qty]", "25")
                .basePath("/v1/transaksi")
                .when().post("/bayar")
                .then().statusCode(500);
        response.body("message", equalTo("Creating default object from empty value"));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexTransaksiErrorAuth() {
        ValidatableResponse response = given().header("Authorization", "Basic YjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi")
                .when().post("/index")
                .then().statusCode(401);
        response.body("status", equalTo(401));
        response.extract().response().getBody().prettyPrint();
    }


    public void viewTransaksiInvalidId() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi")
                .when().post("/view?id={id}", "304")
                .then().statusCode(200);
        response.body("status", equalTo(false));
        response.extract().response().getBody().prettyPrint();
    }

    public void searchTransaksiInvalidPelanggan() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("search", "xxxx")
                .basePath("/v1/transaksi")
                .when().post("/search")
                .then().statusCode(401);
        response.body("status", equalTo(false));
        response.extract().response().getBody().prettyPrint();
    }


}
