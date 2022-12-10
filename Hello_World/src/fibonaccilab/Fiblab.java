package fibonaccilab;

import java.util.Scanner;

public class Fiblab { 
	
	public static int fibonacci(int n) {
	      
	      if (n < 0) {
	      return -1; }
	      
	      else if (n <=1) {
	      return n; }
	      return fibonacci(n-1) + fibonacci(n-2); 
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int startNum;
	      
	      startNum = scnr.nextInt();
	      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
	      
	      scnr.close();
	   }	

}
