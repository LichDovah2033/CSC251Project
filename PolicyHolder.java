public class PolicyHolder
{
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   //no arg constructor
   public PolicyHolder(){
      holderFirstName = "unkown";
      holderLastName = "unkown";
      holderAge = 25;
      holderSmokeStatus = "non-smoker";
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
   public PolicyHolder(String firstName, String lastName, int age, String bigSmoke, double height, double weight) {
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
      holderSmokeStatus = getHolderSmokeStatus();
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
   public String getHolderSmokeStatus() {
      return holderSmokeStatus;
   }
   
   //@return returns smoke status as a boolean
   public boolean getSmokeTF() {
      boolean smokeTF;
      final String SMOKE = "smoker";
      
      if (holderSmokeStatus.equals(SMOKE)) {
         smokeTF = true;
      } else {
         smokeTF = false;
      }
      
      return smokeTF;
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

}