 class class1{
	 class1(){
	System.out.println("hello i am in class1");		
	}
}
 class class2{
	 class2(){
	System.out.println("hello i am in class2");		
	}
}
 class class3{
	 class3(){
	System.out.println("hello i am in class3");		
	}
}
class jarDemo{
	 public static void main(String args[]){
	class1 a=new class1();
	}	
}

//after compiling this file make a file named 'manifest.txt' and write
//Main-class: <Your mainClass> and then two enter and save it.
//make jar file by command in cmd jar cfm <namejar>.jar all class space seperated

//