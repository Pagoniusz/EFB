/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konorstolemybike.efb.main;

/**
 *
 * @author student
 */
public class Gate {
    
    private final Integer number;

    public Gate(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
    
    
}
