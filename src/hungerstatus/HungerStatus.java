/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hungerstatus;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class HungerStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
       
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();
       
        System.out.println("Ok " + name + ", what's your favourite meal? ");
        String favouriteMeal = scanner.nextLine();
       
        // Priming input
        System.out.println(name + ", are you hungry? (yes/no)");
        String response = scanner.nextLine().toLowerCase();
       
        while(response.equals("yes")) {
            System.out.println("Here's your " + favouriteMeal + "! Enjoy!");
           
            // Asking if they're still hungry
            System.out.println(name + ", are you still hungry? (yebo/no)");
            response = scanner.nextLine().toLowerCase();
        }
       
        // When user says no, exit the loop and display final message
        System.out.println("Oh good, you are now full! Have a good day, " + name + "!");
    }
    }
    

