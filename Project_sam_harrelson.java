import java.util.Scanner; 
import java.util.ArrayList;
import java.io.*;

public class Project_sam_harrelson
{
   public static void main(String[] args) throws IOException
   {
      int smoker = 0, nonSmoker = 0;
      
      try 
      {
         File file = new File("PolicyInformation.txt");
         Scanner policy = new Scanner(file);
      
         ArrayList<Policy> policies = new ArrayList<Policy>();
     
         while(policy.hasNext())
         {
            int num = policy.nextInt();
            String prov = policy.nextLine();
            String fn = policy.nextLine();
            String ln = policy.nextLine();
            int age = policy.nextInt();
            String stat = policy.nextLine();
            double inch = policy.nextDouble();
            double lbs = policy.nextDouble();
            
            if(policy.hasNext())
            {
               policy.nextLine();
            }
            
            Policy studentAccount = new Policy(num, prov, fn, ln, age, stat, inch, lbs);
            policies.add(studentAccount);
       }
       
       policy.close();
       
      if(policy.stat.equalsIgnoreCase("Smoker")){
         smoker++;
      }else{
         nonSmoker++;
      }
      
      for(int i = 0; i < policies.size(); i++)
      {
         System.out.println("\nPolicy Number: " + policies.get(i).getPolicyNumber());
         System.out.println("Provider Name: " + policies.get(i).getPolicyProvider());
         System.out.println("Policyholder’s First Name: "  + policies.get(i).getFirstname());
         System.out.println("Policyholder’s Last Name: " + policies.get(i).getLastname());
         System.out.println("Policyholder’s Age: " + policies.get(i).getHolderAge());
         System.out.println("Policyholder’s Smoking Status: " + policies.get(i).getSmokingStatus());
         System.out.println("Policyholder’s Height: " + policies.get(i).getHeight());
         System.out.println("Policyholder’s Weight: " + policies.get(i).getWeight());
         System.out.printf("Policyholder’s BMI: %.2f", policies.get(i).calculateBMI());
         System.out.printf("\nPolicy Price: $%,.2f", policies.get(i).calculatePolicyPrice());
      }
      
     System.out.println("The number of policies with a smoker is: " + smoker);
     System.out.println("The number of policies with a non-smoker is: " + nonSmoker);    
     }
    catch(IOException ex)
    {
      System.out.println("Something went wrong reading the file: " + ex.getMessage());
    }
   } // end of main
} // end of class