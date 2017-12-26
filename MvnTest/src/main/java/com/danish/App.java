package com.danish;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		char ch = args[0].charAt(0); 
		int a = Integer.parseInt(args[1]); 
		int b = Integer.parseInt(args[2]); 
		switch(ch){ 
					case 'a': System.out.println("Addition of Two Given number from command line: " + (a+b)); 
					break; 
					case 's': System.out.println("Substraction of Two Given number from command line: " + (a-b)); 
					break; 
					case 'd': System.out.println("Division of Two Given number from command line: " + (a/b)); 
					break; 
					case 'm': System.out.println("Multiplication of Two Given number from command line: " + (a*b)); 
					break; 
					default: System.out.println("Invalid argument passed!!"); 
					break; 
		}			
	}
}
