import java.util.*;

class LList{
	LinkedList<Integer> list = new LinkedList<Integer>();	
	Scanner s=new Scanner(System.in);
	
	LList(int n){              //constructor
	for(int i=0;i<n;i++){
			System.out.print("Enter "+i+" data in Linked List: ");
			int list_data=s.nextInt();
			list.add(list_data);
		}
	}
	void insert(){
		System.out.print("Enter data in Linked List: ");
		int a=s.nextInt();
		list.add(a);
	}
	void insertbeg(){
		System.out.print("Enter data in Linked List: ");
		int a=s.nextInt();
		list.addFirst(a);
	}
	void check(){
		System.out.print("Enter data to search: ");
		int a=s.nextInt();
		if(list.contains(a)){
			System.out.print("Data found\n");
		}else{
			System.out.print("Data not found\n");
		}
	}
	void size(){
			System.out.print("No. of data in linked list: "+list.size());		
	}
	void remove() throws IndexOutOfBoundsException{
			int a=s.nextInt();
			list.remove(a);
	}
	void insertbyindex()throws IndexOutOfBoundsException{
			System.out.print("Enter data and index");
			int data=s.nextInt();
			int index=s.nextInt();
			list.add(index,data);
	}
	void show(){
		System.out.print(list+"\n");
	}
}

class LinkedListDemo{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of data in Linked List: ");
		int n=s.nextInt();
		LList list=new LList(n);
		boolean a=true;
		while(a){
			System.out.print("\n1.Insert at end\n2.Insert at beginning\n3.Insert at given index\n4.Check for data\n");
			System.out.print("5.Remove \n6.Number of data\n7.show List\n8.Exit");
			int arg=s.nextInt();
			switch(arg){
				case 1:list.insert();
					break;
				case 2:list.insertbeg();
					break;
				case 3:try{
					list.insertbyindex();
					}
					catch(IndexOutOfBoundsException e){
							System.out.print("\nEnter proper index");									
					}
					break;
				case 4:list.check();
					break;
				case 5:try{
						list.remove();
						}
					   catch(IndexOutOfBoundsException e){
							System.out.print("\nEnter proper index");									
					}
					break;
				case 6:list.size();
					break;
				case 7:list.show();
					break;
				case 8:a=false;
					break;
			}
		}
	}
}