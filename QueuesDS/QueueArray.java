package queuepack;
import queuepack.Queue;
public class QueueArray<E> implements Queue<E>
{
	int f=0,r=0;
	E data[];
	E toret;
	private static int CAPACITY=0;
	public QueueArray(int n){
		CAPACITY=n;
		data=(E[])new Object[CAPACITY];
	}
	

	@Override
	public int size() {
		return (CAPACITY-f+r)%CAPACITY;
	}

	@Override
	public boolean isEmpty() {
			return size()==0;
	}

	@Override
	public void enqueue(E e) {
		data[r]=e;
		r=(r+1)%CAPACITY;
		
	}

	@Override
	public E dequeue() {
		if(size()==0)
		{
			System.out.println("QueueEmptyException");
			return null;
		}
		else
		{toret=data[f];
		data[f]=null;
		f=(f+1)%CAPACITY;
		return toret;
		}
	}

	@Override
	public E front() {
		if(size()==0)
		{
			System.out.println("QueueEmptyException");
			return null;
		}
		else
		{
		return data[f];
		}
	}

	@Override
	public void printQueue() {
		if(size()==0)
			System.out.println("QueueEmptyException");
		else if(f>r)
		{
			for(int i=f;i<r+CAPACITY;i++)
			{
				System.out.print(data[i%CAPACITY]+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i=f;i<r;i++)
			{
				System.out.print(data[i]+" ");
			}
			System.out.println();
		}
			
		
	}

}
