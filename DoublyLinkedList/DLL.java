Home  » 15CSE281: Data Structure Lab » DoublyLinkedList » All Submissions » niveth_saran [19552294]
Solution: 19552294
CodeChef submission 19552294 (JAVA) plaintext list. Status: AC, problem CS281L1, contest DS20186A. By niveth_saran (niveth_saran), 2018-08-07 15:40:58.
 
import java.util.*;
 class Test {
public static void main(String args[]) {
	int t;
	Scanner in=new Scanner(System.in);
	t=Integer.parseInt(in.nextLine());
	IDLL<Integer> ll=new DoublyLinkedList<Integer>();
	for(int i=0;i<t;i++)
	{
		int n;
		n=Integer.parseInt(in.nextLine());
		for(int j=0;j<n;j++)
		{
			String o=in.nextLine();
			String temp[]=o.split(" ");
			if(temp[0].equals("I"))
			{	
				System.out.println(ll.isEmpty());
			}
			if(temp[0].equals("S"))
			{	
				System.out.println(ll.size());
			}
			if(temp[0].equals("AF"))
			{
				int te=Integer.parseInt(temp[1]);
				ll.insertFirst(te);
				
			}
			if(temp[0].equals("AL"))
			{
				int te=Integer.parseInt(temp[1]);
				ll.insertLast(te);
				
			}
			if(temp[0].equals("RF"))
			{
				ll.removeFirst();
			}
			if(temp[0].equals("RL"))
			{
				ll.removeLast();
			}
			if(temp[0].equals("L"))
			{
				ll.last();
				
				
			}
			if(temp[0].equals("F"))
			{
				ll.first();
				
			}
			if(temp[0].equals("FIND"))
			{
				int te=Integer.parseInt(temp[1]);
				ll.find(te);
				
			}
			
			
			
			
		}
		
		
		
		
	}
	
}
 
}
class Node<E>
{
	Node<E> next,prev;
	E element;
	Node()
	{
		next=null;
		prev=null;
		element=null;
	}
	Node(Node<E> n,Node<E> p, E e)
	{
		next=n;
		prev=p;
		element=e;
	}
	
}
interface IDLL<E>
{
	void insertFirst(E e);
	void insertLast(E e);
	void removeFirst();
	void removeLast();
	void first();
	void last();
	int size();
	boolean isEmpty();
	void printList();
	void find(E e);
	
}
 
class DoublyLinkedList<E> implements IDLL<E>
{
int size=0;
Node<E> head,tail;
	@Override
	public void insertFirst(E e) {
		
		if(isEmpty())
		{
			Node<E> n=new Node<E>(null,null,e);
			n.prev=null;
			n.next=null;
			head=n;
			tail=n;
			
			size++;
			printList();
			
		}
		else
		{	Node<E> n=new Node<E>(null,null,e);
			n.prev=null;
			n.next=head;
			n.next.prev=n;
			head=n;
			
			size++;
			printList();
			
		}
		
	}
 
	@Override
	public void insertLast(E e) {
		
		if(isEmpty())
		{
			Node<E> n=new Node<E>(null,null,e);
			n.prev=null;
			n.next=null;
			head=n;
			tail=n;
			
			size++;
			printList();
			
		}
		else
		{	Node<E> n=new Node<E>(null,null,e);
			n.prev=tail;
			n.next=null;
			n.prev.next=n;
			tail=n;
			
			size++;
			printList();
			
		}
	}
 
	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("ListEmptyException");
			printList();
		}
		else if(size==1)
		{
			
			head=null;
			size--;
			printList();
		}
		else
		{
			Node<E> temp=head;
			temp.next.prev=null;
			head=temp.next;
			temp=null;
			size--;
			printList();
		}
	}
 
	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("ListEmptyException");
			printList();
		}
		else if(size==1)
		{
			tail=null;
			size--;
			printList();
		}
		else
		{
			Node<E> temp=tail;
			temp.prev.next=null;
			tail=temp.prev;
			temp=null;
			size--;
			printList();
		}
	}
 
	@Override
	public void first() {
		// TODO Auto-generated method stub
			System.out.println(head.element);
	}
 
	@Override
	public void last() {
		
		System.out.println(tail.element);
	}
 
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
 
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0);
	}
 
	@Override
	public void printList() {
		if (size()==0) {
			System.out.println("List Empty");
		}
		else {
			Node<E> temp = head;
			while (temp != null) {
				System.out.print(temp.element+ "->");
				temp = temp.next;
			}
			System.out.print("null\n");
			temp = tail;
			while (temp != null) {
				System.out.print(temp.element + "->");
				temp = temp.prev;
			}
			System.out.print("null\n");
		}
	}
 
	@Override
	public void find(E e) {
		// TODO Auto-generated method stub
		int f=0;
		if(isEmpty())
		{
			System.out.println("ListEmptyException");
			
		}else {
		Node<E> temp=head;
		while(temp!=null)
		{
			if(temp.element==e)
				{System.out.println(e);
				f=1;
				}
			temp=temp.next;
		}
		if(f==0)
		System.out.println("null");
		}
		}
	
} 
