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
    
    private final GateProvider gateProvider = new GateProvider();
    
    @Test
    public void shouldFreeGate() {
        gateProvider.selectGate(new Gate(2));
        gateProvider.freeGate(new Gate(2));
        assertNull(gateProvider.getSelectedGate());
    }
}
