/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedingfineapplication;

/**
 *
 * @author ngazani
 */
public class SpeedingFineApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       speedingFines f = new speedingFines("",0); //object for the subclass
       f.prompts();//calling a prompth method
       f.calculateFine();// calling a fine calculating method
        System.out.println("*************************************************************");
        f.printFine(); //calling a method to print the final report
        
       
    }
    
}
