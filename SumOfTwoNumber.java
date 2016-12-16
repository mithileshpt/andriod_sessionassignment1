/*Write a program to print the sum of two numbers without using + operator. Other operators have
to be used.*/

package assignment1;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Sum of two number "+a +" annd "+b+" is "+ addIterative(a, b));
		s.close();

	}
	
	public static int addIterative(int a, int b){  
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
	 }



}
