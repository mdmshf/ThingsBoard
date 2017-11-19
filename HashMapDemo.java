import java.util.*; 
class HashMapDemo {


public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
 HashMap m=new HashMap();

for(int i=0;i<3;i++)
{	
	try
   {
		System.out.println("Enter you name: ");
       		 String s1=sc.next();
        	System.out.println("Enter your Student ID: ");
       		 int a=sc.nextInt();
        	 m.put(s1,a);
		System.out.println(m);
   }

catch(Exception e)
{
        System.out.println("Please enter correct input");
        System.out.println(e.getMessage());
        e.printStackTrace();

}
	
 	}
 
  Set s=m.keySet();
 
 System.out.println("Output as Key Set: ");
 System.out.println(s);

 Collection c=m.values();

  System.out.println("Output as Collection values :");
  System.out.println(c);

System.out.println("Using iterator and Map Entry :");

 Set s2=m.entrySet();

 Iterator its = s2.iterator();

 while (its.hasNext())
{
	Map.Entry m1=(Map.Entry)its.next();
 
	System.out.println (m1.getKey()+"---"+m1.getValue());

 
}
	 }	
		 }
