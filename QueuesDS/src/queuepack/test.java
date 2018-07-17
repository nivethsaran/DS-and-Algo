package queuepack;
import java.util.*;
public class test {
	public static void main(String args[])
	{	int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		Queue<Integer> Q=new QueueArray<Integer>(n);
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		Q.enqueue(60);
		Q.printQueue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.printQueue();
		Q.enqueue(70);
		Q.enqueue(80);
		Q.enqueue(90);
		Q.printQueue();
		Q.enqueue(100);
		Q.enqueue(110);
		Q.enqueue(120);
		Q.printQueue();
	}

}
