//demo policy program

//Hello World!

//scanner import
import java.util.Scanner;

//named after the file name because I think the compiler will explode if I don't
public class Project_Drake_Norman
{
   public static void main(String[] args)
   {
      // varibles to match class fields
      String testName;
      int testNumber;
      String testFirst;
      String testLast;
      int testAge;
      String testSmoke;
      double testHeight;
      double testWeight;
      
      Scanner keyboard = new Scanner(System.in);
      
      //policy number
      System.out.print("\nPlease enter the Policy Number: ");
      testNumber = keyboard.nextInt();
      
      //consume remaining newline
      keyboard.nextLine();
      
      //provider name
      System.out.print("\nPlease enter the Provider Name: ");
      testName = keyboard.nextLine();
      
      
      
      //policy holder first name
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      testFirst = keyboard.nextLine();
      
      //policy holder last name
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      testLast = keyboard.nextLine();
      
      //policy holder age
      System.out.print("\nPlease enter the Policyholder's Age: ");
      testAge = keyboard.nextInt();
      
      //consume remaining newline
      keyboard.nextLine();
      
      //whether or not the policy holder is giving themselves lunger cancer check 
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      testSmoke = keyboard.nextLine();
      
      
      //holder's height (inches)
      System.out.print("\nPlease enter the Policyholders Height (in inches): ");
      testHeight = keyboard.nextDouble();
      
      //weight in pounds
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      testWeight = keyboard.nextDouble();
      
      
      
      Policy user = new Policy(testName, testNumber, testFirst, testLast, testAge, testSmoke, testHeight, testWeight);
      
      System.out.println("\nPolicy Number: " + user.getpolNumber());
      
      System.out.println("\nProvider Name: " + user.getproName());
      
      System.out.println("\nPolicyholder's First Name: " + user.getph_first());
      
      System.out.println("\nPolicyholder's Last Name; " + user.getph_last());
      
      System.out.println("\nPolicyholder's Age: " + user.getph_age());
      
      System.out.println("\nPolicyholder's Smoking Status: " + user.getpolicyHolderSS());
      
      System.out.printf("\nPolicyholder's Height: %.2f\n", user.getHeight());
      
      System.out.printf("\nPolicyholder's weight: %.2f\n", user.getWeight());
      
      System.out.printf("\nPolicyholder's BMI: %.2f\n", user.getBMI());
      
      System.out.printf("\nPolicy Price: $%.2f\n", user.getTotalPrice());
   
   
   }
}