import java.lang.*;
import java.util.*;

class MyException {

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int age;
age=sc.nextInt(); 

try
{

	if (age < 18)
	{
		throw new TooyoungException("You are too young to vote");
}

	else if (age >= 60)
	 {
		throw new OldException("You are an eligible Senior Citizen voter");
}

	else
	{
		System.out.println("You are an eligible voter");
}
		}

catch(Exception e)
{
	System.out.println("Please enter correct input");
	System.out.println(e.getMessage());
	//System.out.println(e.printStackTrace());

	}
		}
}

class TooyoungException extends Exception 
{

 TooyoungException(String s) {
  super(s);
		}
	}


class OldException extends Exception
{
OldException(String s) {
super(s);
 }
	}
