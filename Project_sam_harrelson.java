import java.util.Scanner; 

public class Project_sam_harrelson
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      int num = keyboard.nextInt();
      keyboard.nextLine(); //consume newline
      
      System.out.print("Please enter the Provider Name: ");
      String prov = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      String fn = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      String ln = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine(); //consume newline
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String stat = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      double inch = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      double lbs = keyboard.nextDouble();
      
      Policy studentAccount = new Policy(num, age, prov, fn, ln, stat, inch, lbs);
      
      System.out.println("\nPolicy Number: " + studentAccount.getPolicyNumber());
      System.out.println("Provider Name: " + studentAccount.getPolicyProvider());
      System.out.println("Policyholder’s First Name: "  + studentAccount.getFirstname());
      System.out.println("Policyholder’s Last Name: " + studentAccount.getLastname());
      System.out.println("Policyholder’s Age: " + studentAccount.getHolderAge());
      System.out.println("Policyholder’s Smoking Status: " + studentAccount.getSmokingStatus());
      System.out.println("Policyholder’s Height: " + studentAccount.getHeight());
      System.out.println("Policyholder’s Weight: " + studentAccount.getWeight());
      System.out.printf("Policyholder’s BMI: %.2f", studentAccount.calculateBMI());
      System.out.printf("Policy Price: $%,.2f", studentAccount.calculatePolicyPrice());
      
   } // end of main
} // end of class