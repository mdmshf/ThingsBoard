//program to demonstrate if else in java
import java.util.Scanner;
class Larger{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Two number: ");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b){
		System.out.print("First number is Greater than Second");	
		}
		else if(b>a){
		System.out.print("Second number is Greater than Second");	
		}
		else{
		System.out.print("Both are equal");	
		}
	}
}
