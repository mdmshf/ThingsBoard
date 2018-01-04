import java.util.Scanner;
import java.lang.*;
class Figure{
	double dim1;
	double dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	void area(){
		System.out.print("Area of ");
	}
	void perimeter(){
		System.out.print("Perimeter of ");
	}
	
}
class Triangle extends Figure{
	double dim3;
	Triangle(double a,double b,double c){
		super(a,b);
		dim3=c;
	}
	void area(){
		super.area();
		double s=(dim1+dim2+dim3)/2;
		System.out.println("Triangle: "+Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3)));
	}
	void perimeter(){
		super.perimeter();
		double c=dim1+dim2+dim3;
		System.out.println("Triangle: "+c);
	}
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	void area(){
		super.area();
		System.out.println("Rectangle: "+dim1*dim2);
	}
	void perimeter(){
		super.perimeter();
		System.out.println("Rectangle: "+2*(dim1+dim2));
	}
}

class InheritanceDemo{
	public static void main(String args[]){
	int n;
	Scanner s=new Scanner(System.in);
	Figure f;
	while(true){
		System.out.print("1.Rectangle\n2.Triangle\n");
		n=s.nextInt();
		if(n==1){
			System.out.print("Enter length and breath: ");
			int a=s.nextInt();
			int b=s.nextInt();
			f=new Rectangle(a,b);
		}else{
			System.out.print("Enter all three sides: ");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			f=new Triangle(a,b,c);
		}
			f.area();
			f.perimeter();
		}
	}
}
