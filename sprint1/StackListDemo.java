import java.util.*;

class StackList{
	Stack<Integer> stack;
	Scanner s=new Scanner(System.in);
	StackList(){
		stack=new Stack<Integer>();
	}
	void insert(){
		System.out.println("Enter data: ");
		int a=s.nextInt();
		stack.push(a);
		}
	void pop() throws EmptyStackException{
		System.out.println("\nPopped data: "+stack.pop());
	}
	void top_data(){
		System.out.println("\nData on top of stack: "+stack.peek());
	}
	void stackcheck(){
		if(stack.empty()){
		System.out.println("Yes stack is empty.");			
		}else{
		System.out.println("No stack is not empty.");						
		}
	}
	void search(){
		System.out.print("Enter data to search: ");
		int a=s.nextInt();
		if(stack.search(a)!=-1){
		System.out.print("Data is at position "+stack.search(a));			
		}else{
			System.out.println("Data not found");
		}
	}
}

class StackListDemo{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		StackList stk=new StackList();
		while(true){
			System.out.print("\n1.Push\n2.Pop\n3.Check for top element\n4.Is stack is Empty\n5.Search\n6.Exit\n");
			int a=s.nextInt();
			switch(a){
				case 1:stk.insert();
					break;
				case 2:try{
							stk.pop();
							}
					   catch(EmptyStackException e){
						   System.out.println("Stack is empty\n");
					   }
					break;
				case 3:try{
						stk.top_data();
						}
						catch(EmptyStackException e){
						System.out.println("Stack is empty\n");	
						}
					break;
				case 4:stk.stackcheck();
					break;
				case 5:stk.search();
					break;
				case 6:System.exit(0);
					break;
			}	
		}
	}
}
