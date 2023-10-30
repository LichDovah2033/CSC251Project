public class PolicyHolder
{
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private boolean holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   //no arg constructor
   public PolicyHolder(){
      holderFirstName = "unkown";
      holderLastName = "unkown";
      holderAge = 25;
      holderSmokeStatus = false;
      holderHeight = 72.00;
      holderWeight = 100.00;
   }
   
   //main constructor
   /*
      @param firstName is the holder's first name
      @param lastName is the holder's last name
      @param age is the holder's age
      @param bigSmoke is the holder's smoker status and a gta meme refernce
      @param height is the holder's height
      @param weight is the holder's weight
   */
   public PolicyHolder(String firstName, String lastName, int age, boolean bigSmoke, double height, double weight) {
      holderFirstName = firstName;
      holderLastName = lastName;
      holderAge = age;
      holderSmokeStatus = bigSmoke;
      holderHeight = height;
      holderWeight = weight;
   }
   
   //copy constructor
   public PolicyHolder(PolicyHolder toCopy) {
      holderFirstName = toCopy.getHolderFirstName();
      holderLastName = toCopy.getHolderLastName();
      holderAge = toCopy.getHolderAge();
      holderSmokeStatus = toCopy.getSmokeTF();
      holderHeight = toCopy.getHolderHeight();
      holderWeight = toCopy.getHolderWeight();
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
   
   //@retrun returns holder's Smoke Status
   public boolean getSmokeTF() {
      return holderSmokeStatus;
   }
   
   public String getHolderSmokeStatus() {
      final String SMOKE = "smoker";
      final String NON_SMOKE = "non-smoker";
      String smoke;
      
      if(getSmokeTF()){
         smoke = SMOKE;
      } else {
         smoke = NON_SMOKE;
      }
      
      return smoke;
   }
   
   public double getHolderHeight() {
      return holderHeight;
   }
   
   public double getHolderWeight() {
      return holderWeight;
   }
   
   //BMI calculation
   public double getBMI() {
      double BMI;
      // \/idk what to actually call this
      final double CALC_NUM = 703.00;
      
      BMI = (CALC_NUM * holderWeight) / (holderHeight * holderHeight);
      
      return BMI;
   
   }
   
   //toString method
   public String toString(){
      String print;
      
      //There is no way for me to make this easy to read, but I tried.
      print = String.format("\nPolicyholder's First Name: %s\n" + 
                            "Policyholder's Last Name: %s\n" + 
                            "Policyholder's Age: %d\n" + 
                            "Policyholder's Smoking Status (Y/N): %s\n" + 
                            "Policyholder's Height: %.1f\n" + 
                            "Policyholder's Weight: %.1f\n" + 
                            "Policyholder's BMI: %.2f" , getHolderFirstName() , getHolderLastName() , getHolderAge() , getHolderSmokeStatus() , getHolderHeight() , getHolderWeight() , getBMI());
      return print;  
   
   }

}