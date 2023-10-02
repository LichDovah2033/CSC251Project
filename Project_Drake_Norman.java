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
      final String NO_SMOKE = "non-smoker";
      double height;
      double weight;
      int numSmoke = 0;
      int numNonSmoke = 0;
      
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
         
         if(smokeInput.equals(SMOKE)) {
         smokeTF = true;
         } else if (smokeInput.equals(NO_SMOKE)) {
         smokeTF = false;
         } else {
         smokeTF = false;
         }
         height = fileInput.nextDouble();
         weight = fileInput.nextDouble();
         
         Policy policy = new Policy(number, proName, firstName, lastName, age, smokeTF, height, weight);
         policyList.add(policy);
         
         if(smokeTF) {
            numSmoke++;
         } else {
            numNonSmoke++;
         }
         
      }
      
      for (int index = 0; index < policyList.size(); index++) {
         Policy iPolicy = policyList.get(index);
         System.out.println("\nPolicy Number: " + iPolicy.getPolicyNumber());
         System.out.println("Provider Name: " + iPolicy.getProviderName());
         System.out.println("Policyholder's First Name: " + iPolicy.getHolderFirstName());
         System.out.println("Policyholder's Last Name: " + iPolicy.getHolderLastName());
         System.out.println("Policyholder's Age: " + iPolicy.getHolderAge());
         System.out.println("Policyholder's Smoking Status: " + iPolicy.getHolderSmokeStatus());
         System.out.printf("Policyholder's Height: %.2f\n" , iPolicy.getHolderHeight());
         System.out.printf("Policyholder's Weight: %.2f\n" , iPolicy.getHolderWeight());
         System.out.printf("Policyholder's BMI: %.2f\n" , iPolicy.getBMI());
         System.out.printf("Policy Price: $%.2f\n" , iPolicy.getCost());
      }
      
      System.out.println("\nThe number of policies with a smoker is: " + numSmoke);
      System.out.println("The number of policies with a non-smoker is: " + numNonSmoke);
         
   }


}