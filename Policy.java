//name
public class Policy 
{//class begin
   
   //fields
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private boolean holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   //no arg constructor, sets default values
   public Policy() {
      policyNumber = 1;
      providerName = "Ryujin";
      holderFirstName = "unkown";
      holderLastName = "unkown";
      holderAge = 25;
      holderSmokeStatus = false;
      holderHeight = 72.00;
      holderWeight = 100.00;
   }
   
   //main constructor
   /*
      @param number is the policy number
      @param proName is the provider name
      @param firstName is the holder's first name
      @param lastName is the holder's last name
      @param age is the holder's age
      @param bigSmoke is the holder's smoker status and a gta meme refernce
      @param height is the holder's height
      @param weight is the holder's weight
      
      (I think this is the correct way to do this
   
   */
   public Policy(int number, String proName, String firstName, String lastName, int age, boolean bigSmoke, double height, double weight) {
      policyNumber = number;
      providerName = proName;
      holderFirstName = firstName;
      holderLastName = lastName;
      holderAge = age;
      holderSmokeStatus = bigSmoke;
      holderHeight = height;
      holderWeight = weight;
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
   
   //@return returns holder's first name
   public String getHolderFirstName() {
      return holderFirstName;
   }
   
   //@return returns holder's last name
   public String getHolderLastName() {
      return holderLastName;
   }
   
   //@return returns holder's Age
   public int getHolderAge() {
      return holderAge;
   }
   
   //@retrun returns holder's Smoke Status as a boolean
   public boolean getSmokeTF() {
      return holderSmokeStatus;
   }
   
   //@return returns smoke status as a string
   public String getHolderSmokeStatus() {
      String smokeString;
      
      if (holderSmokeStatus) {
         smokeString = "smoker";
      } else {
         smokeString = "non-smoker";
      }
      
      return smokeString;
   }
   
   public double getHolderHeight() {
      return holderHeight;
   }
   
   public double getHolderWeight() {
      return holderWeight;
   }
   
   //getters end
   
   //BMI calculation
   public double getBMI() {
      double BMI;
      // \/idk what to actually call this
      final double CALC_NUM = 703.00;
      
      BMI = (CALC_NUM * holderWeight) / (holderHeight * holderHeight);
      
      return BMI;
   
   }
   
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