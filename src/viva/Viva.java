/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva;

/**
 *
 * @author User
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class Viva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
     
        while(true){
            System.out.println("Customer Type(Residential/Commercial):"); // or Type 0 to exit: **otherwise, can choose to quit at here 
            String type = t.nextLine();
//            if (type.equals("0")){
//                System.out.println("Quitting.... ");
//                break;}
            
            if (!type.equalsIgnoreCase("Residential") && !type.equalsIgnoreCase("Commercial")){
                System.out.println("Invalid customer type. Please try again.");
                continue;
            }
            
            
            System.out.println("Amount of water used(0-50000): ");
            int amount_water = t.nextInt();
            t.nextLine();
            
            if (amount_water==0){
                System.out.println("Exiting....");
                break;}
            if (amount_water<0 || amount_water>50000){
                System.out.println("Invalid input. Try to enter again the amount within 0 to 50000");
                amount_water = t.nextInt();
                }
            
            
        double bills = 0;
             
        if (type.equalsIgnoreCase("Residential")) {
            if (amount_water>0 && amount_water<=1000){
                bills = amount_water*0.02;
            }
            else if (amount_water>=1001 && amount_water<=5000){
                bills = (1000*0.02)+(amount_water-1000)* 0.05;
            }

            else{
                bills = (1000*0.02)+(4000 * 0.05) + (amount_water - 5000)* 0.08;
            }
        }
            
        else if (type.equalsIgnoreCase("Commercial")){
            if (amount_water <= 10000) {
                bills = amount_water * 0.06;
            } 
            else {
                bills = (10000 * 0.06) + (amount_water - 10000) * 0.10;
            } 
        }
                
        System.out.println("Customer Type: " + type);
        System.out.println("Water Usage: " + amount_water + " L");
        System.out.printf("Total Bill: RM%.2f%n", bills);
        System.out.println("Thank you for conserving water!\n");        
    
            System.out.println("Do you want to continue? Press other integer for yes or 0 for quitting. ");
            int ans = t.nextInt();
            t.nextLine(); // input and loop from the top
            // instead of if (ans == 1) , can direct go for answer == 0
            
            if (ans == 0){
                System.out.println("Quitting.... ");
                break;}
            
            else
                continue;
                
        }
        
            t.close();
        }
        
}

