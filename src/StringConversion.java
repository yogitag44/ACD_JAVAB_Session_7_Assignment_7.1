import java.util.Scanner;   //Scanner Class to take input from user

public class StringConversion {    //Main class including the main function
	public static void main (String arg[]) {
		
		int number = -782;  //initialized an integer  
		
	//Converting integer into string using Sting function Integer.toString;	
		String numberAsString = Integer.toString(number);       
		System.out.println("Converting integer into string using Sting function Integer.toString: "+numberAsString);
		
	//Converting integer using String.valueOf(int)
		String NumAsString2= Integer.toString(number);
		System.out.println("\nConverting integer using String.valueOf(int): "+NumAsString2);
	
	//Convert using String.format()
		int Anothernumber = -782;
		String NumAsString3 = String.format ("%d", Anothernumber);
		System.out.println("\nConvert using String.format() "+NumAsString3);
		
	//Convert using StringBuffer or StringBuilder
		
			//StringBuffer Example 
		
		int Stringnumber = -782;
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append(number);
		String numberAsString4 = sbuffer.toString();
		System.out.println("\nConvert using String Buffer:  "+numberAsString4);
			
			//StringBuilder Example
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(number);
		String numberAsString5 = sbuilder.toString();
		System.out.println("\nConvert using String Builder: "+numberAsString5);
	}
}
