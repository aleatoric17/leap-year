/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

/**
 *
 * @author PFA Young Lee
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 1789;
        
        if (n%4==0) {
            System.out.println("The given year is a leap year.");
        }
        else {
            System.out.println("The given year is not a leap year.");
        }
    }
    
}
