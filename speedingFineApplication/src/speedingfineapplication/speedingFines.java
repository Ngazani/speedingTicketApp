/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedingfineapplication;
import java.util.*; //import statement
/**
 *
 * @author ngazani
 */
// subclass extending sup[er class and implementing the interface
public class speedingFines extends Fine implements iFine {
    //declarations
    public String name; 
     public  int speed,personFinePayable;
     
    //creating a non-default constructor
    speedingFines(String name, int speed){
    }
    
//method to prompt the user for the name and speed
    public void prompts(){
        Scanner sc = new Scanner(System.in);
         name = Fine.getPersonName();
        speed = Fine.getPersonSpeed();
    System.out.print("Enter the persons name: ");
    name = sc.nextLine();
    System.out.print("Enter the speed: ");
    speed=sc.nextInt();
    }
    //overriding an abstract method from the super class
    @Override
        public void calculateFine(){
        personFinePayable = Fine.getPersonFinePayable();
        //statement to determine if the person gets a fine
        if (speed>120){
     personFinePayable=(int) (speed *10.20);
        }
        
        else{}
    }
    //overriding the display method
    @Override
    //display the final report
    public void printFine(){
        System.out.println("Person Name: "+name);
        System.out.println("Person Speed: "+speed+"km/h");
        System.out.println("Payable fee: R"+personFinePayable);
    }

}
