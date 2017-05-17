package com.konorstolemybike.efb.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static spark.Spark.*;

public class Main {
    
    
    public static void main(String[] args) {
        GateProvider gateProvider = new GateProvider();
        get("/hello", (req, res) -> "Hello");
        get("/availableGates", (req, res) -> gateProvider.getAvailableGates());
 
    }
}
