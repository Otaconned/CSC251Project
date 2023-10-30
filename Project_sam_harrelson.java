import java.util.Scanner; 
import java.util.ArrayList;
import java.io.*;

public class Project_sam_harrelson
{
   public static void main(String[] args) throws IOException
   {
      String num;
      String prov;
      String fn;
      String ln;
      int age;
      String stat;
      double inch;
      double lbs;
      int smokerCount = 0;
      
      ArrayList<Policy> policies = new ArrayList<Policy>();

      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
     
      while(inputFile.hasNext())
      {
         num = inputFile.nextLine();
         prov = inputFile.nextLine();
         fn = inputFile.nextLine();
         ln = inputFile.nextLine();
         age = inputFile.nextInt();
         stat = inputFile.nextLine();
         inch = inputFile.nextDouble();
         lbs = inputFile.nextDouble();
            
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
            policies.add(new Policy(num, prov, fn, ln, age, stat, inch, lbs));
       } // end of while
      
      for(Policy policy : policies)
      {
         System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getPolicyProvider());
         System.out.println("Policyholder’s First Name: "  + policy.getFirstname());
         System.out.println("Policyholder’s Last Name: " + policy.getLastname());
         System.out.println("Policyholder’s Age: " + policy.getHolderAge());
         System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder’s Height: " + policy.getHeight());
         System.out.println("Policyholder’s Weight: " + policy.getWeight());
         System.out.printf("Policyholder’s BMI: %.2f", policy.calculateBMI());
         System.out.printf("\nPolicy Price: $%,.2f", policy.calculatePolicyPrice());
         
         if(policy.getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            smokerCount++;
      } // end of for
      
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokerCount) );  
   } // end of main
} // end of class