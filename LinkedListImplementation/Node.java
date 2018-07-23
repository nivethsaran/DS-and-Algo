package LList;

public class Node<E> {
	private E element;
	Node<E> next;
	public Node()
	{
		element=null;
		next=null;
	}
public Node(E e,Node<E> n)
{
	element=e;
	next=n;
}
public E getElement()
{
	return element;
}
public Node<E> getNext()
{
	return next;
}
public void setNext(Node<E> n)
{
	next =n;
}
}
