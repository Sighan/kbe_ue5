/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.ai_bachelor.kbe.counter;

import junit.framework.TestCase;

/**
 *
 * @author dan
 */
public class CounterFactoryTest extends TestCase {
    
    public CounterFactoryTest(String testName) {
        super(testName);
    }

    /**
     * Test of getInstace method, of class CounterFactory.
     */
    public void testGetInstaceTypeSimple() {
        String type = CounterFactory.SINGLE;
        Counter result = CounterFactory.getInstace(type);
        assertNotSame(result, null);
    }
    
    /**
     * Test of getInstace method, of class CounterFactory.
     */
    public void testGetInstaceTypeDouble() {
        String type = CounterFactory.DOUBLE;
        Counter result = CounterFactory.getInstace(type);
        assertNotSame(result, null);
    }
    
    /**
     * Test of getInstace method, of class CounterFactory.
     */
    public void testGetInstaceTypeTriple() {
        String type = CounterFactory.TRIPLE;
        Counter result = CounterFactory.getInstace(type);
        assertNotSame(result, null);
    }
    
    /**
     * Test of getInstace method, of class CounterFactory.
     */
    public void testGetInstaceTypeInvalid() {
        String type = "";
        Counter result = CounterFactory.getInstace(type);
        assertEquals(result, null);
    }
    
}
