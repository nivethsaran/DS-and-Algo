package LList;

public class TestClass {

	public static void main(String[] args) {
		SLL<Integer> list=new SinglyLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(2000);
		list.addLast(90);
		list.addFirst(50);
		list.printList();
		

	}

}
