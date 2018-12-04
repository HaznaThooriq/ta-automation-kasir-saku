package com.yakindeveloper.kasirsaku.automationkasirsaku.api;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ProfileController {

    public void profilHappyFlow(String auth) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/profile")
                .when().post("/view")
                .then().statusCode(200);
        response.body("status", equalTo(true));
        response.extract().response().getBody().prettyPrint();
    }

    public void profilErrorFlow(String auth) {

        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/profile")
                .when().post("/view")
                .then().statusCode(401);
        response.extract().response().getBody().prettyPrint();
    }

    public void updateProfilHappyFlow(String auth) {
        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "KasirSaku YakinDev")
                .formParam("username", "kasir_saku")
                .formParam("kota", "Surabaya")
                .formParam("alamat", "Kontrakan Mulyosari, Surabaya")
                .formParam("phone", "089666923911")
                .formParam("email", "kasirsaku@yakindeveloper.com")
                .formParam("nama_toko", "Toko Yakin")
                .formParam("alamat_toko", "Depan KFC Mulyosari, Surabaya")
                .formParam("upload_profile", "")
                .formParam("upload_toko", "")
                .basePath("/v1/profile")
                .when().post("/update")
                .then().statusCode(200);
        response.body("message", equalTo("Update profil berhasil."));
        response.extract().response().getBody().prettyPrint();
    }

    public void updateProfilErrorFlow(String auth) {

        ValidatableResponse response = given().header("Authorization", auth)
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .basePath("/v1/profile")
                .when().post("/update")
                .then().statusCode(401);
        response.extract().response().getBody().prettyPrint();
    }

    public void updateProfileZeroRequiredField(){
        ValidatableResponse response = given().header("Authorization", "Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==")
                .baseUri("http://api.kasirsaku.sahabatdeveloper.site")
                .formParam("nama", "KasirSaku YakinDev")
                .formParam("username", "kasir_saku")
                .formParam("kota", "Surabaya")
                .formParam("alamat", "Kontrakan Mulyosari, Surabaya")
                .formParam("phone", "")
                .formParam("email", "kasirsaku@yakindeveloper.com")
                .formParam("nama_toko", "Toko Yakin")
                .formParam("alamat_toko", "Depan KFC Mulyosari, Surabaya")
                .formParam("upload_profile", "")
                .formParam("upload_toko", "")
                .basePath("/v1/profile")
                .when().post("/update")
                .then().statusCode(200);
        response.body("phone", equalTo(""));
        response.extract().response().getBody().prettyPrint();

    }
}
