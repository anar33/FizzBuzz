/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.patrick.lorin.fizzbuzz;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Patrick
 */
public class FizzBuzzTest
{
    FizzBuzz fb;
    public FizzBuzzTest()
    {
        
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        fb = new FizzBuzz();
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void FizzSi9()
    {
        assertEquals(fb.FizzOuBuzz(9),"Fizz");
    }
    
    @Test
    public void BuzzSi25()
    {
        assertEquals(fb.FizzOuBuzz(25),"Buzz");
    }
    
    @Test
    public void FizzBuzzSi15()
    {
        assertEquals(fb.FizzOuBuzz(15),"FizzBuzz");
    }
    
    @Test
    public void AucunSi11()
    {
        assertEquals(fb.FizzOuBuzz(11),"11");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
