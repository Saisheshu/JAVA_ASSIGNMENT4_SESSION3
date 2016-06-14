package session3_Assignments;

import java.util.Scanner;

public class assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Basic Calculator
		int x =  0;
		String Op =  null;
		int y =  0;
		boolean ValidOperator=false;
		while(true){
		System.out.println("Enter any Number:");
		Scanner scaner=new Scanner(System.in);
		x=scaner.nextInt();
		System.out.println("Enter Operator like ( +,-,/,*):");
		while(!ValidOperator){
		Scanner scaner1=new Scanner(System.in);
		Op=scaner1.next();
		if(Op.length()!=1&&!Op.equals("+")&&!Op.equals("-")&&!Op.equals("/")&&!Op.equals("*")){
			System.out.println("Please Enter a valid Operator( +,-,/,*):");
		}else{
			ValidOperator=true;
			System.out.println("Enter any Number:");
			Scanner scaner2=new Scanner(System.in);
			y=scaner2.nextInt();
			if(Op.equals("+")){
				System.out.println("Result= "+(x+y));
			}else if(Op.equals("-")){
				System.out.println("Result= "+(x-y));
			}else if(Op.equals("*")){
				System.out.println("Result= "+(x*y));
			}else if(Op.equals("-")){
				System.out.println("Result= "+(x/y));
			}
		}
	}
		}
		
	}

	

}
