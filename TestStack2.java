// Improved stack class that uses the lengtharray member.

class Stack{
	private int stck[];
	private int tos;

	//allocate and initialize stack
	Stack(int size){
		stck = new int[size];
		tos = -1;
	}

	//push an item onto the stack
	void push(int item){
		if(tos==stck.length-1) // use length member
			System.out.println("Stack is Full.");
		else
			stck[++tos] = item;
	}

	//Pop an item from the stack
	int pop(){
		if(tos < 0){
			System.out.println("Stack is Underflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class TestStack2 {
	public static void main(String args[]){
		Stack mystck1 = new Stack(5);
		Stack mystck2 = new Stack(8);

		//push some numbers onto the stack
		for(int i = 0; i < 5; i++) mystck1.push(i);
		for(int i = 0; i < 8; i++) mystck2.push(i);

		//pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i = 0; i<5;i++)
			System.out.println(mystck1.pop());

		System.out.println("Stackin mystack2:");
		for (int i = 0; i<8; i++ ) 
			System.out.println(mystck2.pop());
	}
}