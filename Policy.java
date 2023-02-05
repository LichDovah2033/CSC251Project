// policy program

public class Policy
{
   //fields = atrributes of the policy
   
   // pro = provider, ph = policy holder, SS = Smoker Status
   
   private String proName;
   private int proNumber;
   private String ph_first;
   private String ph_last;
   private int ph_age;
   private String policyHolderSS;
   private double Height;
   private double Weight;
   
   
   /*
   no arg constructor
   I'm only going to use "@param" for the next constructor, because I have 8 fields
   1 will be the default value of all numerical fields
   Insura will be the defualt provider name (proName)
   I'll just use my initials as the the default first and last (ph_first, ph_last)
   smoker status will be set to non-smoker by defualt.
   */
   public Policy()
   {
      proName = "Insura";
      proNumber = 1;
      ph_first = "D";
      ph_last = "N";
      ph_age = 1;
      policyHolderSS = "non-smoker";
      Height = 1.0;
      Weight = 1.0;
   }
      
   /*
   argument constructor
   
   @param name the provider name
   @param num the provider number
   @param first the holder's first name
   @param last the holder's last name
   @param age the holders age
   @param bigSmoke is the smoker status, had to throw in a video game reference
   @param inch the holders height in inches
   @param lbs the holders weight in pounds
   */
   public Policy(String name, int num, String first, String last, int age, String bigSmoke, double inch, double lbs)
   {
      proName = name;
      proNumber = num;
      ph_first = first;
      ph_last = last;
      ph_age = age;
      policyHolderSS = bigSmoke;
      Height = inch;
      Weight = lbs;
   }
   
   /* setters
      \/
      \/
      \/
   */
   
   //@param name is provider name
   public void setproName(String name)
   {
      proName = name;
   }
   
   //@param num is provider number
   public void setproNumber(int num)
   {
      proNumber = num;
   }
   
   //@param first is holder first name
   public void setph_first(String first)
   {
      ph_first = first;
   }
   
   // abbreviations meaning: ph = policy holder, SS = smoker satus
   
   //@param last is the holder's last name
   public void setph_last(String last)
   {
      ph_last = last;
   }
   
   //@param age is holder's time spent alive
   public void setph_age(int age)
   {
      ph_age = age;
   }
   
   //@param bigsmoke is for wether or not the holder is giving themsleves lung cancer
   public void setpolicyHolderSS(String bigSmoke)
   {
      policyHolderSS = bigSmoke; // :)
   }
   
   // the next two setter set the policy holders height and weight
   
   
   //@param inch is holder's height in inches
   public void setHeight(double inch)
   {
      Height = inch;
   }
   
   //@param lbs is the holder's weight in pounds
   public void setWeight(double lbs)
   {
      Weight = lbs;
   }
   
   /* getters (main fields)
         for the sake of convenince, here's what the abbreviations mean again
         pro = provider, ph = policy holder, SS = smoker status
   */
   
   
   //@param #Igiveup #Wasitevenneccesary
   public String getproName()
   {
      return proName;
   }
   
   public int getproNumber()
   {
      return proNumber;
   }
   
   public String getph_first()
   {
      return ph_first;
   }
   
   public String getph_last()
   {
      return ph_last;
   }
   
   public int getph_age()
   {
      return ph_age;
   }
   
   public String getpolicyHolderSS()
   {
      return policyHolderSS;
   }
   
   public double getHeight()
   {
      return Height;
   }
   
   public double getWeight()
   {
      return Weight;
   }
   
   
   
   //BMI calcuation
   public double getBMI()
   {
      double BMI;
      
      BMI = (Weight * 703)/(Height * Height); //bmi calculation
      return BMI;
   }
   
   // if statment method
   public double getTotalPrice()
   {
      double totalPrice = 600.00;
      
      if (ph_age > 50) // if statment for 50 or older fee
      {
         totalPrice = totalPrice + 75.0;
      }
      
      String smoke = "smoker";
      
      if (policyHolderSS.equals(smoke)) // statement for smoke status fee
      {
         totalPrice = totalPrice + 100.0;
      }
      
      
      double BMI = getBMI(); // used to set up bmi fee calculation and if statment
      
      double additionFee = (BMI - 35) * 20; //bmi fee calculation
      
      if (BMI > 35.0) //if statment for bmi fee
      {
         totalPrice = totalPrice + additionFee;
      }
      
      // and finally, returning the total price
      return totalPrice;
   
   }
   
   
}