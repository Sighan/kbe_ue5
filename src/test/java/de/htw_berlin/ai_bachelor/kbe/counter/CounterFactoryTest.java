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
        assertEquals(result.getClass().getSimpleName(), "CounterSimple");
    }
    
    /**
     * Test of getInstace method, of class CounterFactory.
     */
    public void testGetInstaceTypeDouble() {
        String type = CounterFactory.DOUBLE;
        Counter result = CounterFactory.getInstace(type);
        assertEquals(result.getClass().getSimpleName(), "CounterDouble");
    }
    
    /**
     * Test of getInstace method, of class CounterFactory.
     */
    public void testGetInstaceTypeTriple() {
        String type = CounterFactory.TRIPLE;
        Counter result = CounterFactory.getInstace(type);
        assertEquals(result.getClass().getSimpleName(), "CounterTriple");
    }
    
    public void testIncrementS() {
        String type = CounterFactory.SINGLE;
        Counter result = CounterFactory.getInstace(type);
        result.increment();
        result.increment();
        assertEquals(result.getCounter(), 2);
    }
    public void testIncrementD() {
        String type = CounterFactory.DOUBLE;
        Counter result = CounterFactory.getInstace(type);
        result.increment();
        result.increment();
        assertEquals(result.getCounter(), 4);
    }
    public void testIncrementT() {
        String type = CounterFactory.TRIPLE;
        Counter result = CounterFactory.getInstace(type);
        result.increment();
        result.increment();
        assertEquals(result.getCounter(), 6);
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
