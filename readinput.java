package calc;

import java.util.Scanner;
import calc.operations.*;
import java.io.*;

public class readinput{
		public void input() throws IllegalStateException{
		System.out.println("Enter any two numbers");
		Scanner S=new Scanner(System.in);
		double a,b;
		int o;
		a=S.nextDouble();
		b=S.nextDouble();
		System.out.println("Select an option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divide\n");
		o=S.nextInt();
		if(!(o>=0&&o<5))
			throw new IllegalStateException("Option is permitted to only 1 to 4");
		switch(o){
			case 1:
				addition add = new addition(a,b);
				break;
			case 2:
				subtraction sub = new subtraction(a,b);
				break;
			case 3:
				multiplication mul = new multiplication(a,b);
				break;
			case 4:
				division div = new division(a,b);
				break;
		}
	}
}