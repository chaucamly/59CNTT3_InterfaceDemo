/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg59cntt3_interfacedemo;

/**
 *
 * @author Cam Ly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Icalculate calculator = new CasioCaculator();
        System.out.println("4+5 = "+ calculator.cong(4, 5));
        System.out.println("4*5 = "+ calculator.nhan(4, 5));
    }
    
}
    

