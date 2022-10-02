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

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
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

	public void insertAtPosition(int position, int data) {
		if (position < 1) {
			System.out.println("Invalid Position");
			return;
		}

		if (position == 1) {
			push(data);
		} else {
			Node node = new Node(data);
			Node temp = head;
			int count = 2;
			while (count < position) {
				temp = temp.next;
				count++;
			}
			Node current = temp.next;
			temp.next = node;
			node.next = current;
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
