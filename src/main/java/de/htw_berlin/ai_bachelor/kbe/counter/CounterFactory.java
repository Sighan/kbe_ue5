/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 *
 * @author dan
 */
public class CounterFactory {
    public static final String SINGLE = "single";
    public static final String DOUBLE = "double";
    public static final String TRIPLE = "triple";
    
    public static Counter getInstace(String type) {
        if (type.equals(SINGLE)){
            return CounterSimple.getInstance();
        }
        
        if (type.equals(DOUBLE)){
            return CounterDouble.getInstance();
        }
        
        if (type.equals(TRIPLE)) {
            return CounterTriple.getInstance();
        }
        return null;
    }
    
}
