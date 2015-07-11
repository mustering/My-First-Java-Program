/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int computerwins = 0;
        int userwins = 0;
        Scanner input = new Scanner(System.in);
        int number;
        
        
        
        for(number = 1; number < 3;){
            
        double computer = Math.random();
        String computermove;
        
        if(computer > 0 & computer < 0.33333){
            computermove = "Rock";
            
        }
        
        else if(computer > 0.33333 & computer < 0.66666){
            computermove = "Paper";
            
        }
        
        else{
            computermove = "Scissors";
            
        }
        
        System.out.print("Do you choose rock, paper, or scissors? ");
        String usermove = input.nextLine();
        
        if(usermove.equals("Rock") || usermove.equals("rock")){
            if(computermove.equals("Rock")){
                System.out.println("Computer: Rock");
                System.out.println("It was a tie!");               
            }
            
            else if(computermove.equals("Paper")){
                System.out.println("Computer: Paper");
                System.out.println("The computer won!");
                computerwins++;         
            }
            
            else if(computermove.equals("Scissors")){
                System.out.println("Computer: Scissors");
                System.out.println("You won!");
                userwins++;
            }
           
        }
        
        else if(usermove.equals("Paper") || usermove.equals("paper")){
            if(computermove.equals("Rock")){
                System.out.println("Computer: Rock");
                System.out.println("You win!");
                userwins++;
            }
            
            else if(computermove.equals("Paper")){
                System.out.println("Computer: Paper");
                System.out.println("It was a tie!");
                        
            }
            
            else if(computermove.equals("Scissors")){
                System.out.println("Computer: Scissors");
                System.out.println("The computer won!");
                computerwins++;
            }
           
        }
        
        else if(usermove.equals("Scissors") || usermove.equals("scissors")){
            if(computermove.equals("Rock")){
                System.out.println("Computer: Rock");
                System.out.println("The computer wins!");
                computerwins++;
            }
            
            else if(computermove.equals("Paper")){
                System.out.println("Computer: Paper");
                System.out.println("You win!");
                userwins++;  
            }
            
            else if(computermove.equals("Scissors")){
                System.out.println("Computer: Scissors");
                System.out.println("It was a tie!");
                
            }
           
        }
        
        else if(usermove.equals("s")){
            number = 3;
        }
        
        
        
        System.out.print("Do you want to play again? ");
        String againn = input.nextLine();
        
        if(againn.equals("Yes") || againn.equals("yes")){
            number = 1;
        }
        
        else if(againn.equals("No") || againn.equals("no")){
            number = 3;
        }
        
        }
        System.out.println("The computer won " + computerwins + " times, and you won " + userwins + " times.");
        
       }
        
        
            
       
    }
    

