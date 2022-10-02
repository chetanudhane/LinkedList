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

	public int pop() {
		if (head == null) {
			System.out.println("List is Empty");
			return 0;
		}
		if (head.next == null) {
			Node temp = head;
			head = null;
			return temp.key;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.key;
		temp.next = null;
		return data;
	}

	public boolean search(int elememt) {

		if (head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		boolean isExist = false;
		while (temp != null) {

			if (temp.key == elememt) {
				isExist = true;
				break;
			}
			temp = temp.next;
		}
		System.out.println(isExist);
		return isExist;
	}

	public void insertNextToElement(int elememt, int data) {
		Node node = new Node(data);
		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {

			if (temp.key == elememt) {
				Node newNode = temp.next;
				temp.next = node;
				node.next = newNode;
				break;
			}
			temp = temp.next;
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
