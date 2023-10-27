//name
public class Policy 
{//class begin
   
   //fields
   private int policyNumber;
   private String providerName;
   private PolicyHolder person;
   
   
   //no arg constructor, sets default values
   public Policy() {
      policyNumber = 1;
      providerName = "Ryujin";
      person = new PolicyHolder();
   }
   
   
   //main constructor
   /*
      @param number is the policy number
      @param proName is the provider name
   */
   public Policy(int number, String proName, PolicyHolder holder) {
      policyNumber = number;
      providerName = proName;
      person = new PolicyHolder(holder);
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
      
      if (person.getHolderAge() > AGE_FEE_LIM) {
         policyCost = policyCost + AGE_FEE;
      }
      
      if (person.getSmokeTF()) {
         policyCost = policyCost + SMOKE_FEE;
      }
      
      
      if(person.getBMI() > BMI_LIM) {
         bmiFee = (getBMI() - BMI_LIM) * 20.0; // hard coding the 20 cause it's easier
         policyCost = policyCost + bmiFee;
         
      }
   
      return policyCost;
   
   }



}