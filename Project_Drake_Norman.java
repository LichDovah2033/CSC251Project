//demo policy program v2

//Hello World!

//imports v2
import java.util.*;
import java.io.*;

//named after the file name because I think the compiler will explode if I don't
public class Project_Drake_Norman
{
   public static void main(String[] args)
   {
      /*
         I'm building this program based on the example programs given, specifically part 2.
         However, I'm not sure if using the try header is condsidered advanced code from outside the alloted chapters,
         while that matters little now for the project, I want to make sure that I don't end up using code that
         will possibly fail my grade on the exam.
      */
      
      //try header/method
      try
      {//try open
         
         //policy file object
         File file = new File("policy.txt");
         
         //making sure the file exists
         if (!file.exists())
         {
            System.out.println("Could not find policy.txt file");
            System.exit(0);
         
         }
         
         //scanner for Policy file
         Scanner inputFile = new Scanner(file);
         
         //Varibles to match class fields v2
         String testName = "", testFirst = "", testLast = "", testSmoke = "", fileInputFP = "";
         int testNumber = 0, testAge = 0, numSmoke = 0, numNonSmoke = 0;
         double testHeight = 0.0, testWeight = 0.0;
         String smoke = "smoker"; // used to help count smoker policies
         
         //array list
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         // while loop for reading the file
         while(inputFile.hasNext())
         {//while loop open
            
            //reading file for number and parseing
            //(not sure if parsing is apart of the chapters we are alowed to use on exam)
            fileInputFP = inputFile.nextLine();
            testNumber = Integer.parseInt(fileInputFP); //I used procces of elimination to figure out how to do this
            
            testName = inputFile.nextLine(); // reading file for provider name
            
            //getting first and last name from file 
            testFirst = inputFile.nextLine();
            testLast = inputFile.nextLine();
            
            //getting age (parse method, cause I think it looks cooler)
            fileInputFP = inputFile.nextLine();
            testAge = Integer.parseInt(fileInputFP);
            
            //smoker status get
            testSmoke = inputFile.nextLine();
            
            //height get
            fileInputFP = inputFile.nextLine();
            testHeight = Double.parseDouble(fileInputFP);
            
            //weight get
            fileInputFP = inputFile.nextLine();
            testWeight = Double.parseDouble(fileInputFP);
            
            //if statment for tallying smoker policies
            if(testSmoke.equals(smoke))
            {
               numSmoke += 1;
            }
            else
            {
               numNonSmoke += 1;
            }
            
            if(inputFile.hasNext())
            {
               inputFile.nextLine();   
            }
            
            //policy object
            Policy u = new Policy(testName, testNumber, testFirst, testLast, testAge, testSmoke, testHeight, testWeight);
            
            //adding policy to array
            policies.add(u);
            
         }//while loop close
         
         //for loop for display
         for(int i = 0; i < policies.size(); i++)
         {//for loop open
            
            //display stuff
            System.out.println("\nPolicy Number: " + policies.get(i).getpolNumber());
            System.out.println("\nProvider Name: " + policies.get(i).getproName());
            System.out.println("\nPolicyholder's First Name: " + policies.get(i).getph_first());
            System.out.println("\nPolicyholder's Last Name: " + policies.get(i).getph_last());
            System.out.println("\nPolicyholder's Age: " + policies.get(i).getph_age());
            System.out.println("\nPolicyholder's Smoking Status: " + policies.get(i).getpolicyHolderSS());
            System.out.printf("\nPolicyholder's Height: %.2f", policies.get(i).getHeight());
            System.out.print(" Inches\n");
            System.out.printf("\nPolicyholder's weight: %.2f", policies.get(i).getWeight());
            System.out.print(" Pounds\n");
            System.out.printf("\nPolicyholder's BMI: %.2f\n", policies.get(i).getBMI());
            System.out.printf("\nPolicy Price: $%.2f\n\n", policies.get(i).getTotalPrice());
         
         
         }//for loop close
      
         System.out.println("The number of policies with a smoker is: " + numSmoke);
         System.out.println("The number of policies with a non-smoker is: " + numNonSmoke);
      
      }//try close
      
      catch(IOException ex) //literally just copied over from the exam, code was going to look the same regardless
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}