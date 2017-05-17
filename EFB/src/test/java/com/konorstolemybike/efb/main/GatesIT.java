/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konorstolemybike.efb.main;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.specification.ProxySpecification.port;
import org.junit.Test;

/**
 *
 * @author student
 */
public class GatesIT {

    @Test
    public void shouldReturnAvailableGates() {
        given()
                .port(4567)
                .when()
                .get("/availableGates")
                .then()
                .statusCode(200);
    }

}
