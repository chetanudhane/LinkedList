package linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedListExample linkedList = new LinkedListExample();
		linkedList.append(56);
		linkedList.append(20);
		linkedList.append(70);
		linkedList.print();
		linkedList.search(30);
		linkedList.insertNextToElement(30, 40);
		linkedList.print();
	}

}
