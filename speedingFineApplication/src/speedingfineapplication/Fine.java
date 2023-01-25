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
public abstract class Fine {
    //declarations
    private static String personName;
    private static int personSpeed,personFinePayable;

    //constructor
    Fine(){
    }

    //get methods
    public static String getPersonName() {
        return personName;
    }

    public static int getPersonSpeed() {
        return personSpeed;
    }
    
    public static int getPersonFinePayable(){
    return personFinePayable; 
    }
    //abstract method declaration
    public abstract void calculateFine();
    
     }


    

