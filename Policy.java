/**
   the policy class holds data about an insurance policy
*/

public class Policy
{

   private String policyNumber; // PH's policy number
   private String policyProvider; // Policy provider
   private PolicyHolder policyHolder; // the Policy Holder
   private static int policyCount = 0;
     
/**
   no arg constructor w/default values
*/
   public Policy()
   {
      policyNumber = "";
      policyProvider = "";
      policyCount++;
   } // end of method
   
/**
   this constructor sets the starting value
   to the value passed as an argument.
   @param num The policy number
   @param prov The policy provider
*/
   public Policy(String num, String prov)
   {
      policyNumber = num;
      policyProvider = prov;
   } // end of method
   public Policy(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
/**
   this method sets a value for each field
   @param num The policy number
   @param prov The policy provider
*/   
   public void set(String num, String prov)
   {
      policyNumber = num;
      policyProvider = prov;
   } // end of method
/**
   getPolicyNumber method
   @return The policy number
*/  

   public String getPolicyNumber() 
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
   This method returns the # of policies created
   @return The # of policy objects created
*/
   public int getPolicyCount()
   {
      return policyCount;
   }
/** 
   This method returns a copy of the PH class
   @return A reference to PolicyHolder class
*/
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
/**
   calculatePolicyPrice method
   @return The price of the policy based on age, smoking status, and BMI factors
*/     
   public double calculatePolicyPrice() 
   {
      final double BASE_FEE = 600;
      final double SMOKING_FEE = 100;
      final double AGE_FEE = 75;
      final double BMI_FEE = 20;
      final int AGE_LIMIT = 50;
      final int BMI_LIMIT = 35;
      
      double policyPrice = BASE_FEE;
      
      if (policyHolder.getHolderAge() > AGE_LIMIT){
         policyPrice += AGE_FEE;
      }
      if (policyHolder.smokingStatus.equalsIgnoreCase("Smoker")){
         policyPrice += SMOKING_FEE;
      }
      if (policyHolder.calculateBMI() > BMI_LIMIT){
         policyPrice += (policyHolder.calculateBMI() - BMI_LIMIT)*BMI_FEE;
      }
      
      return policyPrice;
   } 
/**
   returns a string with details on the policy
   @return The string detail for policy
*/
   public String toString()
   {
      String str = "Policy Number: "  + policyNumber +
                   "\nProvider Name: " + policyProvider +
                   "\nPolicy Price: $%,.2f" + calculatePolicyPrice();
      return str;
   }
} // end of class