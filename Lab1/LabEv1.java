 import java.util.Scanner;
     
    class StackFinal2 {
     
    	/**
    	 * @param args
    	 */
    	public static void main(String[] args) {
    		
    		Scanner scan = new Scanner(System.in);
    		CapacityGetterSetter getset = new CapacityGetterSetter();
    		int testcases = Integer.parseInt(scan.nextLine());
    		int stacksize = Integer.parseInt(scan.nextLine());
    		getset.setCapacity(stacksize);
    		stack<Integer> S = new StackArray<Integer>();
    		int inputs = Integer.parseInt(scan.nextLine());
     
    		while (inputs >0) {
    			String operation = scan.nextLine();
    			String[] temp = operation.split(" ");
    			if (temp[0].equals("S"))
    				System.out.println(S.size());
    			if (temp[0].equals("I"))
    				System.out.println(S.isEmpty());
    			if (temp[0].equals("P")){
    				S.push(Integer.parseInt(temp[1]));
    				
    				
    			}
    			if (temp[0].equals("O")){
    				System.out.println(S.pop());
    				S.printStack();
    			}
    			if (temp[0].equals("T"))
    				System.out.println(S.top());
    			inputs--;
    			if (temp[0].equals("F")){
    				System.out.println(S.getMid());
    				
    			}
    		}
     
    	}
    }
     
    interface stack<E> {
    	int size();
     
    	boolean isEmpty();
     
    	void push(E e);
     
    	E pop();
     
    	E top();
    	
    	E getMid();
     
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
    	// enter index to top position
    	// constructor
    	private int s;
    	private E toret;
    	int CAPACITY=0;
    	private int t=-1;
    	public StackArray() {
    		CAPACITY = getset.getCapacity();
    		data=(E[])new Object[CAPACITY];
    	}
     
    	public int size() {
    		return t+1;
    	}
     
    	public boolean isEmpty() {
    		// TODO Auto-generated method stub
    		return t==-1;
    	}
     
    	public void push(E e) {
    		// TODO Auto-generated method stub
    		if(t+1==CAPACITY)
    			{System.out.println("StackFullException");
    			printStack();
    			}else {
    		t++;
    		data[t]=e;
    		printStack();
    		
    		}
    	}
     
    	public E top() {
    		// TODO Auto-generated method stub
    		if(t==-1)
    			{System.out.println("StackEmptyException");
    			return null;}
    			else {
    				return data[t];
    			}
    	}
     
    	public E pop() {
    		// TODO Auto-generated method stub
    		if(t==-1)
    		{System.out.println("StackEmptyException");
    		return null;}
    		else {
    			toret=data[t];
    			data[t]=null;
    			t--;
    			return toret;
    			
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
     
    	public E getMid() {
    		E a[];
    		s=t+1;
    		
    	
    		a=(E[])new Object[s/2];
    			for(int i=0;i<s/2;i++)
    			{
    				a[(s/2)-1-i]=pop();
    				
    				
    			}
    			E n=top();
    			for(int i=0;i<((s)/2);i++)
    			{
    				push(a[i]);
    			}
    			return n;
    			
    	
    
    	
    		
    		
    	}
    }   
