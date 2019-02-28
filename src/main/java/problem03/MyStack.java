package problem03;

public class MyStack {
	
	int top;
	int size;
	int[] stack;
	
	private String[] buffer;

	public MyStack( int size ) {
		top=-1;
		stack=new int[size];
		this.size=size;
	}
	
	public int peek() {
		return stack[top];        
	}
	
	public void push(String item) {
		stack[++top]=item;
		System.out.println(stack[top]);
	}

	public String pop() {
		System.out.println(stack[top]);
		return stack[top--];
	}

	public boolean isEmpty() {
		return top==null;
	}
	
	public int size() {
		return 0;
	}
}