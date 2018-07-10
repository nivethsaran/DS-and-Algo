package stack_array;

public class test {

	public static void main(String[] args) {
		stack<Integer> S =new stack_array<Integer>();
		System.out.println("Size"+S.size());
		S.push(13);
		S.push(12);
		S.push(1);
		S.push(5);
		S.push(10);
		S.push(8);
		S.push(90);
		S.push(100);
		System.out.println(S.pop());
		S.printStack();

	}

}
