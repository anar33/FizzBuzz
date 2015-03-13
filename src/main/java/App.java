/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static spark.Spark.*;
import spark.*;
import fr.patrick.lorin.fizzbuzz.FizzBuzz;
/**
 *
 * @author Patrick
 */
public class App
{
    public static void main(String[] args)
    {
        setPort(Integer.parseInt(System.getenv("PORT")));
        get("/", (req, res) -> {
            String html = "<!DOCTYPE html><head><title>FizzBuzz</title></head><body><h1>FizzBuzz</h1><table>";
            FizzBuzz fb = new FizzBuzz();
            for(int i = 1; i<101;i++)
            {
                html+="<tr><td>"+i+"</td><td>"+fb.FizzOuBuzz(i)+"</td>";
            }
            html+="</table></body></html>";
            return html;
        });
    }
}
