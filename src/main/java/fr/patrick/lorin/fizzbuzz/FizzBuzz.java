/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.patrick.lorin.fizzbuzz;
/**
 *
 * @author Patrick
 */
public class FizzBuzz
{
    public FizzBuzz()
    {
        
    }
    
    public boolean EstMultipleDe3(int nb)
    {
        if(nb % 3 == 0)
        {
            return true;
        }
        return false;
    }
    
    public boolean EstMultipleDe5(int nb)
    {
        if(nb % 5 == 0)
        {
            return true;
        }
        return false;
    }
    
    public String FizzOuBuzz(int nb)
    {
        String retour = "";
        if(EstMultipleDe3(nb))
        {
            retour+="Fizz";
        }
        if(EstMultipleDe5(nb))
        {
            retour+="Buzz";
        }
        if(retour=="")
        {
            retour = ""+nb;
        }
        return retour;
    }
}
