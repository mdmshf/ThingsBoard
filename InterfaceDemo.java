interface nameA        //Declation of interface
{
 
    public String name = "Farhan";  // Declaration of static constant.
 
    public void print();   //Declaration of method in interface.
}
 
interface nameB extends nameA        //Interface implementing another interface
 {  
 
  	  public String name = "Danish";
 
    	  public void print1();
 }
 
interface nameC
 {
 
   	 public String name = "Musharraf";
 
   	 public void print2();
 }
 
class student implements nameA, nameB, nameC      //Class implementing many interfaces
 {
 	 public void print()
	 {
      
        	System.out.println("Name:" + nameA.name);   //Each method print() prints the String name.
   	 }
 
   	 public void print1()
	 {
        	
		System.out.println("Name:" + nameB.name);
   	 }
 
         public void print2()
	 {
       
		 System.out.println("Name:" + nameC.name);
   	 }
}

public class InterfaceDemo
 {
   
       public static void main(String[] args)
      {
   
           nameA n = new student();    //Reference of nameA is used while creating object so that it can call to its individual method.
   
           n.print();


	   nameB n1 = new student();
	   
           n1.print1();               //Note, here we can't use reference of any other interface because of no mismatch of Java interface. 


	   nameC n2 = new student();

           n2.print2();
           
      }
 }
