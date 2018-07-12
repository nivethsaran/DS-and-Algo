import java.util.Scanner;
import java.io.*;
 
class StackApplication {
 
	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
 
		Scanner in = new Scanner(System.in);
		CapacityGetterSetter getset = new CapacityGetterSetter();
		
 String pattern="";
		int testcases = Integer.parseInt(in.nextLine());
		for (int j=0;j<testcases;j++){
			
			int stacksize = Integer.parseInt(in.nextLine());
			int inputs = Integer.parseInt(in.nextLine());
			getset.setCapacity(stacksize);
			
            while (inputs >0) {
				pattern = in.nextLine();
				StackApplication par = new StackApplication();
				if(par.paranthesisCheck(pattern))
						System.out.println("YES");
				else
					System.out.println("NO");
                pattern="";
                inputs--;
				}
			}
			
			
		}
			public boolean paranthesisCheck(String input) {
		// TODO Auto-generated method stub
			stack<Character> S = new StackArray<Character>();
			for(int i=0;i<input.length();i++)
			{
				if(input.charAt(i)=='{'||input.charAt(i)=='['||input.charAt(i)=='(') 
					S.push(input.charAt(i));
				else if(input.charAt(i)=='}'||input.charAt(i)==']'||input.charAt(i)==')')
					{if(S.isEmpty()) {
						while(S.size()>0)
						{
							S.pop();
						}
						return false;}
					else if(!isMatchingPair(S.pop(),input.charAt(i))){
						while(S.size()>0)
						{
							S.pop();
						}
							return false;
					}
					}}
			if(S.isEmpty()) {
				while(S.size()>0)
				{
					S.pop();
				}
				return true;}
			else {
				while(S.size()>0)
				{
					S.pop();
				}
				return false;
			}
			
		}
	public boolean isMatchingPair(char a,char b)
	{
		if (a == '(' && b == ')')
	         return true;
	       else if (a == '{' && b == '}')
	         return true;
	       else if (a == '[' && b == ']')
	         return true;
	       else
	         return false;
	}
 
 
}
 
interface stack<E> {
	int size();
	boolean isEmpty();
	void push(E e);
	E pop();
	E top();
	void printStack();
}
 
class CapacityGetterSetter {
	private static int stackcap;
 
	public int getCapacity() {
		return this.stackcap;
	}
 
	public void setCapacity(int cap) {
		stackcap = cap;
	}
}
 
class StackArray<E> implements stack<E> {
	// public static final int CAPACITY=20;
	CapacityGetterSetter getset = new CapacityGetterSetter();
	private E[] data; // array container
	private int t = -1; // index to top position
	// constructor
	int CAPACITY=0;
 
	public StackArray() {
		CAPACITY = getset.getCapacity();
		data = (E[]) new Object[CAPACITY];
	}
 
	public int size() {
		// TODO Auto-generated method stub
		return (t + 1);
	}
 
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t < 0);
	}
 
	public void push(E e) {
		// TODO Auto-generated method stub
		if (size() == CAPACITY)
		{
			
		}
		else {
			t = t + 1;
			data[t] = e;
		}
	}
 
	public E top() {
		// TODO Auto-generated method stub
		if (isEmpty()){
			System.out.println("StackEmptyException");
			return null;
		}
		else {
			return data[t];
		}
	}
 
	public E pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("StackEmptyException");
			return null;
		} else {
			E temp = data[t];
			data[t] = null;
			t = t - 1;
			return temp;
		}
 
	}
 
	public void printStack() {
		if (isEmpty())
			System.out.println("Empty");
		else{
			for (int i = 0; i < CAPACITY; i++) {
				if(data[i]!=null)
					System.out.print(data[i] + " ");
			}
			System.out.println("  ");
		}
	}
 
 
 
} 
