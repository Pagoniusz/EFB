/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konorstolemybike.efb.main;

import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class GateProviderTest {
    
    public void shouldFreeGate() {
        System.out.println("freeGate");
        Gate gate = null;
        GateProvider instance = new GateProvider();
        instance.freeGate(gate);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
