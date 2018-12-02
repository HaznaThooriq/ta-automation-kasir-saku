package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TransaksiPPOBController {

    public void createTransaksiPPOB() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("jumlah_bayar", "20000")
                .formParam("jenis_pembayaran", "pulsa")
                .formParam("kode_pelanggan", "085330438009")
                .formParam("kode_transaksi", "abc123")
                .formParam("nominal", "10500")
                .formParam("harga_jual", "12000")
                .formParam("laba", "1300")
                .formParam("keterangan", "keterangan transaksi")
                .basePath("/v1/transaksi-ppob")
                .when().post("/create")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void indexTransaksiPPOB() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi-ppob")
                .when().post("/index")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void viewTopupPPOB() {
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/transaksi-ppob")
                .when().post("/view?id={id}", "1")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }
}
