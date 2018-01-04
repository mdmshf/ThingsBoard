
class StaticMethod{
	static String name ;
	static void getName(String s){
		name=s;
	}
	static void showName(){
		System.out.println(name);
	}
}

class StaticMethodDemo{
	public static void main(String args[]){    
		StaticMethod.getName("Danish Iqbal");  //static method call without use of object
		StaticMethod.showName();
		StaticMethod obj=new StaticMethod();                   //static method call using object
		obj.getName("Iqbal Danish");
		obj.showName();
	}
}
