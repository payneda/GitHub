/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
 public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        String name;
   
        
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user name.
        System.out.println("What is your name");
        name = keyboard.nextLine();
        //int stringSize = name.length();
        
        
        //Ask the user if they would like to continue.
        int answer;
        String True;
        String False;
        False = "N";
        True = "Y";
        
        System.out.println("Would you like to answer some questions. ??(1=Continue or 2=Quit");
        answer = keyboard.nextInt();
            if(answer <= 2)
            {
                System.out.println("You may proceed");
                System.out.println("Do you like programming?? (1=yes or 2=no");
                    answer = keyboard.nextInt();
                    if (answer <= 2)
                    {
                        System.out.println("Thats great.");
                    }
                    else
                    {
                        System.out.println("Thats too bad");
                    }
                    
            }
            else
            {
                System.out.println("Thank you for your time");
                System.exit(0);
            }
               
            
             
                
                        
                    
            
            
                    System.exit(0); //Terminates the program.
        } //Terminates the program.
            
         

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
