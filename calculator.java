package javaCal;

//import java.util.Scanner;

public class Calculator {
	int a,b;
	//Scanner s=new Scanner(System.in);
    public void addition()
    {
    	System.out.println("Enter two numbers : ");
    	a=10;
    	b=20;
    	System.out.println("Addition of Numbers : "+(a+b));
    }
    
    public void subtraction()
    {
    	System.out.println("Enter two numbers : ");
    	a=50;
    	b=35;
    	System.out.println("Subtraction of Numbers : "+(a-b));
    }
    public void multiplication()
    {
    	System.out.println("Enter two numbers : ");
    	a=10;
    	b=20;
    	System.out.println("Multiplication of Numbers : "+(a*b));
    }
    public void division()
    {
    	System.out.println("Enter two numbers : ");
    	a=60;
    	b=2;
    	System.out.println("Quotient of Numbers : "+(a/b));
    	System.out.println("Remender of numbers : "+(a%b));
    }
	
    public static void main(String[] args) {
    	int choice ;
    	Calculator c=new Calculator();
    	Scanner s1=new Scanner(System.in);
		do {
			System.out.println("1 . for addition");
			System.out.println("2 . for subtraction");
			System.out.println("3 . for multiplication");
			System.out.println("4 . for division");
			System.out.println("Enter choice for operations : ");
			choice=s1.nextInt();
		 switch(choice)
		 {
		 case 1:
			c.addition();
			System.out.println("__________________________");
			break;
		 case 2:
			 c.subtraction();
			 System.out.println("__________________________");
			 break;
		 case 3:
			 c.multiplication();
			 System.out.println("__________________________");
			 break;
			 
		 case 4:
			 c.division();
			 System.out.println("__________________________");
			 break;
			 
		 }
		
		}while(choice != 4);
	}
}