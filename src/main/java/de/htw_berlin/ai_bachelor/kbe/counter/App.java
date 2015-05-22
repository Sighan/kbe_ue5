package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CounterFactory.getInstace(CounterFactory.DOUBLE).increment();
        CounterFactory.getInstace(CounterFactory.DOUBLE).increment();
        System.out.println(CounterFactory.getInstace(CounterFactory.DOUBLE).getCounter());
    }
}
