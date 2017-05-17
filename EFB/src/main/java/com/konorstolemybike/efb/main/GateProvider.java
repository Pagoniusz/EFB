/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konorstolemybike.efb.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author student
 */
public class GateProvider {
    
    private final List<Gate> availableGates = IntStream
            .range(1, 45)
            .mapToObj(i -> new Gate(i))
            .collect(Collectors.toList());
    
    public List<Gate> getAvailableGates() {
        return availableGates;
    }
    
}
