package stack_array;
import stack_array.stack;
public class stack_array<E> implements stack<E>{
public static final int CAPACITY=20;
private E[] data;
private int t=-1;
public stack_array() {
	data=(E[])new Object[CAPACITY];
}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return t==-1;
	}

	@Override
	public void push(E e) {
		if(t+1==CAPACITY)
		{
			System.out.println("Stack OverFlow EXception");
		}
		else
		{
			t++;
			data[t]=e;
		}
		
	}

	@Override
	public E pop() {
		if(t==-1)
		{
			System.out.println("Stack NullPOinter Exception");
			return null;
		}
		else
		{
			E toret=data[t];
			data[t]=null;
			t--;
			return toret;
		}
	
		
		
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return data[t];
	}

	@Override
	public void printStack() {
		for(int i=0;i<CAPACITY;i++)
		{
			System.out.print(data[i]+":");
			
		}
		System.out.println(" ");
		// TODO Auto-generated method stub
		
	}

}
