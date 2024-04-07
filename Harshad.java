package assigment_no2;

import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		int num;  
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		 
	        int rem = 0, sum = 0, n;  
	          
	        n = num;  
	          
	        while(num > 0){  
	            rem = num%10;  
	            sum = sum + rem;  
	            num = num/10;  
	        }  
	           
	        if(n%sum == 0)  
	            System.out.println(n + " is a harshad number");  
	        else  
	            System.out.println(n + " is not a harshad number");  
	sc.close();   
	}  

	}


