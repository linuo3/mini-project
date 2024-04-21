import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {
 public static void main(String[] args) {
      Scanner scannerOne = new Scanner(System.in);
       int principal;   
         do {
            
            System.out.print("Principle[1k dollars - 1M dollars]:");
            principal = scannerOne.nextInt();
            if (principal<1000 || principal>1000000) {
               System.out.println("Enter a number between 1,000 to 1,000,000.");
            }
           
         } while (principal<1000 || principal>1000000);   
      Scanner scannerTwo = new Scanner(System.in); 
       double interestRate;
         do {
            System.out.print("Annual IntrestRate[0.1 - 30.0]:");
              interestRate = scannerTwo.nextDouble();
             if (interestRate<0.1 || interestRate>30.0) {
                System.out.println("Enter between 0.1% to 30.0%");
               }
       
         } while (interestRate<0.1 || interestRate>30.0);
     
      
      Scanner scannerThree = new Scanner(System.in);
       byte years;
         do {
            System.out.print("Number of Years[1 Year - 30 Years]:");
            years = scannerThree.nextByte();
            if (years<0|| years>30) {
             System.out.println("Enter between 1 year to 30 years");
            }
         } while (years<0|| years>30);
    
        
      int numberofpaymentsperyear = (years*12);
      double monthlyIntrest = (interestRate/ 12/ 100);
      double Morgage =( principal*((monthlyIntrest*Math.pow(monthlyIntrest+1, numberofpaymentsperyear))/(Math.pow(monthlyIntrest+1, numberofpaymentsperyear)-1)));
      String currency    = NumberFormat.getCurrencyInstance().format(Morgage);
      System.out.println("Mortgage amount:"+currency);
       
       
    }
   
    }
