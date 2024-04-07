package assigment_no2;

import java.util.Scanner;

public class FibonasciSeries {

	public static void main(String[] args) {
		
		Scanner i=new Scanner(System.in);
	   
	    int count=0,num1=0,num2=1,sum;

	    System.out.println("Enter a number:  ");
	    int num =i.nextInt();

	    for(count=0;count<num;count++){
	        System.out.print(" "+ num1);
	        sum=num1+num2;
	        num1=num2;
	        num2=sum;
	        
	        i.close();
	    }
		
	}

}
