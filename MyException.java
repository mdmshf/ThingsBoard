import java.lang.*;
import java.util.*;

class MyException {

public static void main(String[] args)throws Exception
{

	Scanner sc=new Scanner(System.in);

	int age=0;

try
{
	age=sc.nextInt(); 
}

catch(Exception e)
{
        System.out.println("Please enter correct input");
        System.out.println(e.getMessage());
        e.printStackTrace();

}
      

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

		
}

class TooyoungException extends Exception 
{

 TooyoungException(String s)
 	{
 		 super(s);
				}
}


class OldException extends Exception
{
	OldException(String s)
	{
	
		super(s);
 }
		}


class TooyoungException extends Exception 
{

 	TooyoungException(String s)
	{
  		super(s);
			
			}
				}


class OldException extends Exception
{
OldException(String s) 
	{
		super(s);
 }
			}
