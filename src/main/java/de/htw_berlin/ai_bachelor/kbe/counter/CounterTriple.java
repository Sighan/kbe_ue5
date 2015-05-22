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
public class CounterTriple implements Counter {
    private int counter = 0;
    private static final Counter cs = new CounterTriple();
    
    private CounterTriple() {
        
    }

    public void increment() {
        counter=counter+3;
    }

    public int getCounter() {
        return counter;
    }
    
    public static Counter getInstance() {
        return cs;
    }
}
