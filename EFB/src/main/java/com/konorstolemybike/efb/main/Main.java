package com.konorstolemybike.efb.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import spark.Response;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        options("/*",
                (request, response) -> {

                    String accessControlRequestHeaders = request
                            .headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers",
                                accessControlRequestHeaders);
                    }

                    String accessControlRequestMethod = request
                            .headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods",
                                accessControlRequestMethod);
                    }

                    return "OK";
                });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        GateProvider gateProvider = new GateProvider();
        get("/hello", (req, res) -> "Hello");
        get("/availableGates", (req, res) -> gateProvider.getAvailableGates());
        post("/gate", (req, res) -> {

            boolean wasAvailable = gateProvider.selectGate(new Gate(Integer.valueOf(req.queryParams("number"))));
            if (wasAvailable) {
                res.status(200);
            } else {
                res.status(400);
            }
            return res;
        });
        get("/selectedGate", (req, res) -> gateProvider.getSelectedGate().getNumber());
        post("/freeGate", (req, res) -> {
            gateProvider.freeGate(new Gate(Integer.valueOf(req.queryParams("number"))));
            return res;
        });
    }
}
