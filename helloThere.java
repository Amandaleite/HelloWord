package javatraining;

import java.util.Scanner;

/**
 *
 * @author Amanda Lima
 */
public class JavaTraining {//Class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //method
        System.out.println("Hello There!");//statement; type of members can be propeties or methods
        System.out.println("What is your name?");
        
        Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Hello " + name +", nice to meet you!" );
        
        int x = 5;
        double y = 3.45;
        double z = x + y;
        System.out.println("There is some maths "+x+" plus "+y+" is igual to "+z);
        System.out.println("Now it is your time");
        
        Scanner num = new Scanner (System.in);
            System.out.println("Please enter a positive number.");
            int n1 = num.nextInt();
            System.out.println("Please enter another number :)");
            int n2 = num.nextInt();
            System.out.println("Hummm... What do you tell me about divide thoses number ? How much is it?");
            double res = num.nextInt();
            
            double correctRes = n1/n2;
                
                if (res == correctRes){
                    System.out.println("Yes, you look good at this.");
                }
                if (res != correctRes){
                        System.out.println("Sorry, that is not the right answer. Maybe more pratice");
                }
                                     
              
                    
                        
            
            
          
                    
                    
            
                    
                    
                
             
                
    }
    
}
