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
   
   //BMI calculation
   public double getBMI() {
      double BMI;
      // \/idk what to actually call this
      final double CALC_NUM = 703.00;
      
      BMI = (CALC_NUM * holderWeight) / (holderHeight * holderHeight);
      
      return BMI;
   
   }

}