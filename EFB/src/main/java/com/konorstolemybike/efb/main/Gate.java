/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konorstolemybike.efb.main;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.number);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gate other = (Gate) obj;
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return String.valueOf(number);
    }
    
    
}
