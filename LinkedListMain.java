package linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedListExample linkedList = new LinkedListExample();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
		linkedList.search(30);
	}

}
