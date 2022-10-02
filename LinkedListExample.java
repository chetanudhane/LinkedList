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

	public boolean append(int data) {
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

	public void sort() {
		System.out.println("Sorted LinkedList...");
		Node temp1 = head;
		Node temp2;
		while (temp1.next != null) {
			temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.key > temp2.key) {
					int temp = temp1.key;
					temp1.key = temp2.key;
					temp2.key = temp;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
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
