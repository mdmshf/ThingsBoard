import java.util.*;

class ArrayListDemo{
	public static void main(String args[]){
		List<Integer> a=new ArrayList<Integer>(10);  //create array of size 10 
		
		a.add(0,30);     //add element in array (listname.add(<index>,<value>)
 		a.add(1,11);
		a.add(2,12);
		
		int e=a.get(2);  //get element of array from index 2
		System.out.println("value at index 2: "+e);
		
		a.add(3,14);
		
		System.out.println("Whole list: "+a); //print whole list
		
		a.remove(3);     // remove element from index 3
		System.out.println("Whole list after removing index 3: "+a); //print whole list
		
		a.set(2,30);  //replaces 2nd index element and this function returns set value i.e 30 in this case
		System.out.println("Whole list after replacing value of index 2: "+a); //print whole list
		List<Integer> b=new ArrayList<Integer>(6);  //create array of size 6 
		b.add(0,95);     //add element in array (listname.add(<index>,<value>)
 		b.add(1,23);
		b.add(2,65);
		a.addAll(2,b); //This method adds all elements from specified collection to list.
		System.out.println(a); //print whole list
		System.out.println("Position of 30:"+a.indexOf(30));  //return the first occurrence index of 30 else -1
		System.out.println("Position of 30:"+a.lastIndexOf(30));//return the last occurrence index of 30 else -1
		System.out.println(a.subList(3,5));  // return List between 3rd(including) and 5th element(excluding)
		
		Iterator itr = a.iterator();
        while (itr.hasNext())
        {
            //  moving cursor to next element
            int i = (Integer)itr.next();
 
            // getting even elements one by one
            System.out.print(i + " ");
 
            // Removing odd elements
            if (i % 2 != 0)
               itr.remove(); 
       }
	System.out.println("\n"+a); //print whole list	   
	}
}