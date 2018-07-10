
import java.util.Scanner;

 class StackApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		CapacityGetterSetter getset = new CapacityGetterSetter();
		int testcases=0 ;
		int operations=0;
		int historysize=0;
		 try {
			 testcases= Integer.parseInt(scan.nextLine());		 	
		 }catch (NumberFormatException e){}
	
		
		while (testcases>0) {
		   operations= Integer.parseInt(scan.nextLine());		
		   historysize= Integer.parseInt(scan.nextLine());
			getset.setCapacity(historysize);
		   stack<String> history = new StackArray<String>();
		  for(int i=0;i<operations;i++) {
		   	String operation = scan.nextLine();
			String[] temp = operation.split(" ");
			if (temp[0].equals("V")){
				history.VisitPage(temp[1]);
				System.out.println(history.size());
			}
			if (temp[0].equals("R"))
				{
				    history.RecentlyVisitedPage();
				   
				}
			if (temp[0].equals("CA"))
				history.ClearAll();
			if (temp[0].equals("C"))
				history.Clear(Integer.parseInt(temp[1]));
			if (temp[0].equals("S"))
				System.out.println(history.size());
			if (temp[0].equals("L"))
				history.List();		
		  }
		  testcases --;
		}
	}

}
interface stack<E> {
	int size();
	boolean isEmpty();
	void VisitPage(E e);
	E pop();
	E RecentlyVisitedPage();
    	void ClearAll();
    	void Clear(int n);
	void List();
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

	public void VisitPage(E e) {
		if (size() == CAPACITY)
		{
			System.out.println("HistoryFullException");
		}
		else {
			t = t + 1;
			data[t] = e;
		}
		
		
	}

	public E RecentlyVisitedPage() {
		
		if (isEmpty()) {
			System.out.println("History is Empty");
			return null;
		} else {
			System.out.println(data[t]);
			return data[t];
		}
	 
			
		   
			   
	}
	
	public void ClearAll() {
		for(int i=0;i<size();)
		{
			System.out.println(pop());
		}
	}
	
	public void Clear(int n){
		for(int i=0;i<n;i++)
			{System.out.println(pop());
			System.out.println(size());
			}
	}
	
	
	public E pop() {
		// TODO Auto-generated method stub
		
			E temp = data[t];
			data[t] = null;
			t = t - 1;
			return temp;
		
 
	}

	public void  List() {
		E a[]=(E[])new Object[size()];
		int n=size();
		if(n==0)
			System.out.println("HistoryEmptyException");
		else {
		for(int i=0;i<n;i++)
		{
			a[n-i-1]=pop();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		}
	}
}
