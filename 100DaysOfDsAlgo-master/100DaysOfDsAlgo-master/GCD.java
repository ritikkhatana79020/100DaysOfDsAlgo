/*GCD (Greatest Common Divisor) or HCF (Highest Common Factor)
of two numbers is the largest number that divides both of them.*/


package Practice1;

import java.util.Scanner;

public class GCD {
    //Code By Ritik Khatana
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int result=calculateGCD(a,b);
	     System.out.println("GCD of "+ a +" and "+ b + " is ---> "+result);
	}
	public static int calculateGCD(int a,int b) {
		
		if(a==0) {
			return a;
		} 
		if(b==0) {
			return b;
		} 
		if(a==b) {
			return a;
		} 
		
		if(a>b) {
			return calculateGCD(a-b,b);          
		}
		return calculateGCD(a,b-a);
		
	}

}
