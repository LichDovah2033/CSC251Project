//imports
import java.util.Scanner;

public class Project_Drake_Norman 
{
   public static void main(String[] args)
   {//main start
      
      //varibles
      int number;
      String proName;
      String firstName;
      String lastName;
      int age;
      boolean smokeTF;
      String smokeInput;
      final String SMOKE = "smoker";
      final String NO_SMOKE = "non-smoker";
      double height;
      double weight;
      Scanner keyboard = new Scanner(System.in);
      
      
      //inputs
      
      System.out.print("Please enter the Policy Number: ");
      number = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      proName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeInput = keyboard.nextLine();
      
      //if statment for boolean
      if(smokeInput.equals(SMOKE)) {
         smokeTF = true;
      } else if (smokeInput.equals(NO_SMOKE)) {
         smokeTF = false;
      } else {
         smokeTF = false;
      }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
   
      Policy policy = new Policy(number, proName, firstName, lastName, age, smokeTF, height, weight);
      
      
      //printing
      System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder's Age: " + policy.getHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getHolderSmokeStatus());
      System.out.printf("Policyholder's Height: %.2f\n" , policy.getHolderHeight());
      System.out.printf("Policyholder's Weight: %.2f\n" , policy.getHolderWeight());
      System.out.printf("Policyholder's BMI: %.2f\n" , policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n" , policy.getCost());
   
   }


}