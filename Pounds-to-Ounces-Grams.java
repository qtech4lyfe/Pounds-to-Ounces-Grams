
package pounds_ounces_to_grams_kilograms;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Pounds_Ounces_to_Grams_Kilograms {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        double pounds;
        double ounces;
        double grams;
        double kilograms;
        
        
        System.out.println ("This program will convert pounds into grams and kilograms.");
       
        System.out.println ("Please enter weight in pounds/lbs");
        pounds = in.nextInt();    
        
        ounces = pounds * 16;
        grams = pounds * 453.592;
        kilograms = grams / 1000;
        
        System.out.println ( + pounds + " lbs is equal to " + grams + " grams"
                + ", " + kilograms + " kilograms \nand " + ounces + " ounces.");
        }
         
    }
    

