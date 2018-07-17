package queuepack;

public interface Queue<E> {
	int size();
	boolean isEmpty();
	void enqueue(E e);
	E dequeue();
	E front();
	void printQueue();

}
