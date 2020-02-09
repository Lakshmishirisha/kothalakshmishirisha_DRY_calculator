package calc.operations;

import java.util.*;
import java.io.*;

public class division{
	public division(double a,double b) throws ArithmeticException{
		if(a==0||b==0) 
			throw new ArithmeticException("Zero is not allowed");
		System.out.println("The division of "+a+" and "+b+" is "+(a/b));
	}
}