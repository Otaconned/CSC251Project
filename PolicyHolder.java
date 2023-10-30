/**
   the policy class holds data about a policy holder
*/

public class PolicyHolder
{
   private String firstname; // PH's first name
   private String lastname; // PH's last name
   private int holderAge; // PH's age
   private String smokingStatus; // PH's smoking status
   private double height; // PH's height in inches
   private double weight; // PH's weight in pounds
/**
   no arg constructor w/default values
*/
   public PolicyHolder()
   {
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
   @param fn The policyholder's first name
   @param ln The policyholder's last name
   @param stat The policyholder's smoker status
   @param inch The policyholder's height
   @param lbs The policyholder's weight
*/
   public PolicyHolder(String fn, String ln, int age, String stat, double inch, double lbs)
   {
      firstname = fn;
      lastname = ln;
      holderAge = age;
      smokingStatus = stat;
      height = inch;
      weight = lbs;
   } // end of method
/**
   this copy constructor 
   intializes the obkect as a copy of 
   another policyholder object
*/
   public PolicyHolder(PolicyHolder object2)
   {
      firstname = object2.firstname;
      lastname = object2.lastname;
      holderAge = object2.holderAge;
      smokingStatus = object2.smokingStatus;
      height = object2.height;
      weight = object2.weight;
   }   
/**
   this method setsa value for each field
   @param age The age of the policy holder
   @param fn The policyholder's first name
   @param ln The policyholder's last name
   @param stat The policyholder's smoker status
   @param inch The policyholder's height
   @param lbs The policyholder's weight
*/   
   public void set(String num, String prov, String fn, String ln, int age, String stat, double inch, double lbs)
   {
      firstname = fn;
      lastname = ln;
      holderAge = age;
      smokingStatus = stat;
      height = inch;
      weight = lbs;
   } // end of method
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
   returns a string with details on the policy holder
   @return The string detail for policy holder
*/
   public String toString()
   {
      String str = "Policyholder’s First Name: "  + firstname +
                   "\nPolicyholder’s Last Name:  " + lastname +
                   "\nPolicyholder’s Age:  " + holderAge +
                   "\nPolicyholder’s Smoking Status:  " + smokingStatus +
                   "\nPolicyholder’s Height:  " + height +
                   "\nPolicyholder’s Weight:  " + weight +
                   "\nPolicyholder’s BMI: %.2f" + calculateBMI();
      return str;
   }
} // end of class