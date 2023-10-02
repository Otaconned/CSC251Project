/**
   the policy class holds data about an insurance policy
*/

public class Policy
{

   private int policyNumber; // PH's policy number
   private String policyProvider; // Policy provider
   private String firstname; // PH's first name
   private String lastname; // PH's last name
   private int holderAge; // PH's age
   private String smokingStatus; // PH's smoking status
   private double height; // PH's height in inches
   private double weight; // PH's weight in pounds
   
/**
   no arg constructor w/default values
*/
   public Policy()
   {
      policyNumber = 0;
      policyProvider = "";
      firstname = "";
      lastname = "";
      holderAge = 0;
      smokingStatus = ""; 
      height = 0.0;
      weight = 0.0;
   } // end of method
   
/**
   this constructor sets the starting value
   to the value passed as an argument.
   @param num The policy number
   @param age The age of the policy holder
   @param prov The policy provider
   @param fn The policyholder's first name
   @param ln The policyholder's last name
   @param stat The policyholder's smoker status
   @param inch The policyholder's height
   @param lbs The policyholder's weight
*/
   public Policy(int num, String prov, String fn, String ln, int age, String stat, double inch, double lbs)
   {
      policyNumber = num;
      policyProvider = prov;
      firstname = fn;
      lastname = ln;
      holderAge = age;
      smokingStatus = stat;
      height = inch;
      weight = lbs;
   } // end of method
/**
   this method setsa value for each field
   @param num The policy number
   @param age The age of the policy holder
   @param prov The policy provider
   @param fn The policyholder's first name
   @param ln The policyholder's last name
   @param stat The policyholder's smoker status
   @param inch The policyholder's height
   @param lbs The policyholder's weight
*/   
   public void set(int num, String prov, String fn, String ln, int age, String stat, double inch, double lbs)
   {
      policyNumber = num;
      policyProvider = prov;
      firstname = fn;
      lastname = ln;
      holderAge = age;
      smokingStatus = stat;
      height = inch;
      weight = lbs;
   } // end of method
/**
   getPolicyNumber method
   @return The policy number
*/  

   public int getPolicyNumber() 
   {
      return policyNumber;
   }

/**
   getPolicyProvider method
   @return The name of the provider company
*/  

   public String getPolicyProvider() 
   {
      return policyProvider;
   }
/**
   getfirstname method
   @return The first name of the policyholder
*/  

   public String getFirstname() 
   {
      return firstname;
   }
/**
   getLastname method
   @return The last name of the policyholder
*/  

   public String getLastname() 
   {
      return lastname;
   }
/**
   getHolderAge method
   @return The age of the policyholder
*/    

   public int getHolderAge() 
   {
      return holderAge;
   }
/**
   getSmokingStatus method
   @return The smoking status of the policyholder
*/  

   public String getSmokingStatus() 
   {
      return smokingStatus;
   }
/**
   getHeight method
   @return The height of the policyholder
*/  

   public double getHeight() 
   {
      return height;
   }
/**
   getWeight method
   @return The weight of the policyholder
*/  

   public double getWeight() 
   {
      return weight;
   }
/**
   calculateBMI method
   @return The BMI of the policyholder based on weight and height
*/  
   public double calculateBMI() 
   {
      final int BMI_CALCULATION = 703;
      return (weight*BMI_CALCULATION)/(height *  height);
   }
/**
   calculatePolicyPrice method
   @return The price of the policy based on age, smoking status, and BMI factors
*/     
   public double calculatePolicyPrice() 
   {
      double policyPrice = 600;
      double bmi = calculateBMI();
      
      if (holderAge > 50){
         policyPrice += 75;
      }
      if (smokingStatus.equalsIgnoreCase("Smoker")){
         policyPrice += 100;
      }
      if (bmi > 35){
         policyPrice += (bmi - 35)*20;
      }
      
      return policyPrice;
   } 
} // end of class