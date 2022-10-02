package linkedlist;

public class LinkedListExample {

	private Node head;

	private class Node {
		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}
	}

	public boolean add(int data) {

		boolean isAdd = false;

		Node node = new Node(data);
		if (head == null) {
			head = node;
			isAdd = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			isAdd = true;
		}
		return isAdd;
	}

	public void print() {
		Node temp = head;
		System.out.println("Linked List : ");
		while (temp != null) {
			System.out.print(temp.key + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}
