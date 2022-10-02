package linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedListExample linkedList = new LinkedListExample();
		linkedList.append(56);
		linkedList.append(70);
		linkedList.insertAtPosition(2, 30);
		linkedList.print();
	}

}
