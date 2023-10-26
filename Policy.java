//name
public class Policy 
{//class begin
   
   //fields
   private int policyNumber;
   private String providerName;
   
   
   //no arg constructor, sets default values
   public Policy() {
      policyNumber = 1;
      providerName = "Ryujin";
   }
   
   //main constructor
   /*
      @param number is the policy number
      @param proName is the provider name
   */
   public Policy(int number, String proName) {
      policyNumber = number;
      providerName = proName;
   }
   
   //getters start
   
   //@return returns Policy Number
   public int getPolicyNumber() {
      return policyNumber;
   }
   
   //@return returns Provider name
   public String getProviderName() {
      return providerName;
   }
   
   //getters end
   
   
   
   //cost calcuation
   public double getCost() {
      double policyCost = 600.00;
      final int AGE_FEE_LIM = 50;
      final double AGE_FEE = 75.00;
      final double SMOKE_FEE = 100.00;
      final double BMI_LIM = 35.0;
      double bmiFee;
      
      if (holderAge > AGE_FEE_LIM) {
         policyCost = policyCost + AGE_FEE;
      }
      
      if (holderSmokeStatus) {
         policyCost = policyCost + SMOKE_FEE;
      }
      
      
      if(getBMI() > BMI_LIM) {
         bmiFee = (getBMI() - BMI_LIM) * 20.0; // hard coding the 20 cause it's easier
         policyCost = policyCost + bmiFee;
         
      }
   
      return policyCost;
   
   }



}