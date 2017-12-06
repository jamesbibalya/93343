/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author james
 */
public class JavaLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            checkAge(12);
        }catch(InvalidAgeException iaex){
            System.out.println(iaex.getMessage());
        }
        
        
    }
       
            public static void checkAge(int age) throws InvalidAgeException{

                if(age<18){
                throw new InvalidAgeException("You must be 18");
                }
                else{

                }
                }


    
 }
    
    