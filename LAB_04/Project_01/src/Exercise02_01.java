/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author cannell001
 */
public class Exercise02_01 {

  
    public static void main(String[] args) {
        
        double population = 312320486;
        double secondsPerBirth;
        double secondsPerDeath;
        double secondsPerImmigrant;
        double secondsPerYear;
        double populationIncreasePerYear;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the average # 0f seconds between each birth in a year");
        secondsPerBirth = input.nextDouble();
        
        System.out.println("Enter the average # 0f seconds between each death in a year");
        secondsPerDeath = input.nextDouble();
        
        System.out.println("Enter the average # 0f seconds between each Immigrant entry in a year");
        secondsPerImmigrant = input.nextDouble();
        
        secondsPerYear = 365 * 24 * 60 * 60;
        populationIncreasePerYear = secondsPerYear * (1 / secondsPerBirth - 1 / secondsPerDeath + 1 / secondsPerImmigrant );
        System.out.println(populationIncreasePerYear);
        
      System.out.println("Population after first year = "   + ( population + populationIncreasePerYear)); 
      System.out.println("Population after second year = " + ( population + 2 * populationIncreasePerYear)); 
      System.out.println("Population after third year year = "  + ( population + 3 * populationIncreasePerYear)); 
      System.out.println("Population after fourth year = " + ( population + 4 * populationIncreasePerYear)); 
      System.out.println("Population after fifth year = "  + ( population + 5 * populationIncreasePerYear)); 
    }
    
}
