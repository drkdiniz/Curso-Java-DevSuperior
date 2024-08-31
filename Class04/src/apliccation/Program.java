package apliccation;
import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("First grade: ");
        double at1 = sc.nextDouble();

        System.out.print("Second grade: ");
        double at2 = sc.nextDouble();

        System.out.print("Third grade: ");
        double at3 = sc.nextDouble();
        
        Students e = new Students();
        e.setName(name);
        e.setAt1(at1);
        e.setAt2(at2);
        e.setAt3(at3);
        e.setApproval();
        System.out.println(e);
        
        
        

 
       
        
        
        
     sc.close();   
        
        
    }
    
}
