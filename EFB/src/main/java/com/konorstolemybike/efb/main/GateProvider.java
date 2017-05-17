/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konorstolemybike.efb.main;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author student
 */
public class GateProvider {
    
    private Gate selectedGate;
    
    private final Set<Gate> availableGates = IntStream
            .range(1, 46)
            .mapToObj(i -> new Gate(i))
            .collect(Collectors.toSet());
    
    public Set<Gate> getAvailableGates() {
        return availableGates;
    }
    
    public boolean selectGate(Gate gate) {
        if(!availableGates.contains(gate)){
            return false;
        } else {
            availableGates.removeIf(g -> g.equals(gate));
            selectedGate = gate;
            return true;
        }
    }
    
    public Gate getSelectedGate() {
        return selectedGate;
    }
    
    public void freeGate(Gate gate) {
        availableGates.add(gate);
        if(selectedGate.equals(gate)){
            selectedGate = null;
        }
    }
}
