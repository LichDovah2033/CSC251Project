//imports
import java.util.*;
import java.io.*;

public class Project_Drake_Norman 
{
   public static void main(String[] args) throws IOException
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
      double height;
      double weight;
      int numSmoke = 0;
      int numNonSmoke = 0;
      String smokeTest;
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      File policyFile = new File("PolicyInformation.txt");
      Scanner fileInput = new Scanner(policyFile);
      //input loop
      while (fileInput.hasNext()) {
         number = fileInput.nextInt();
         fileInput.nextLine();
         proName = fileInput.nextLine();
         firstName = fileInput.nextLine();
         lastName = fileInput.nextLine();
         age = fileInput.nextInt();
         fileInput.nextLine();
         smokeInput = fileInput.nextLine();
         height = fileInput.nextDouble();
         weight = fileInput.nextDouble();
         
         if(smokeInput.equals(SMOKE)){
            smokeTF = true;
         } else { 
            smokeTF = false;
         }
         
         
         
         PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokeTF, height, weight);
         
         
         if(holder.getSmokeTF()) {
            numSmoke++;
         } else {
            numNonSmoke++;
         }
         
         Policy policy = new Policy(number, proName, holder);
         policyList.add(policy);
         
      }
      
      for (int index = 0; index < policyList.size(); index++) {
         Policy iPolicy = policyList.get(index);
         System.out.print(iPolicy.toString());
      }
      
      Policy display = policyList.get(policyList.size() - 1);
      
      System.out.println("\nThere were " + display.numPolicies +  " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + numSmoke);
      System.out.println("The number of policies with a non-smoker is: " + numNonSmoke);
      
         
   }


}