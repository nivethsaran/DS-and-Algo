package LList;

public class SinglyLinkedList<E> implements SLL<E> {
private Node<E> head =null;
private Node<E> tail=null;
	private int size=0;
	public SinglyLinkedList()
	{
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFirst(E e) {
		head=new Node<E>(e,head);
		if(size==0)
			tail=head;
		size++;
		
		
	}

	@Override
	public void addLast(E e) {
			Node<E> newest=new Node<E>(e,null);
			if (isEmpty( ))
				head = newest; // special case: previously empty list
				else
			tail.setNext(newest); // new node after existing tail
				tail = newest; // new node becomes the tail
				size++;
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void printList() {
		Node<E> temp=head;
		
		do
		{
			System.out.println(temp.getElement());
			temp=temp.getNext();
		}while(temp!=null);
		
	}
	

}
