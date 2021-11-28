import java.util.Scanner;

public class Runner {
	public static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {

		// ---------------------------1
		initListByLoop();

		// ---------------------------2
		System.out.println("\n"+ isInList(null, 2));
		
		// ---------------------------3
		System.out.println("\n"+createFibonacciList(5));

		// ---------------------------4
//		Node first = new Node<String>("lala");
//		first = new Node<String>("bla", first);
//		first = new Node<String>("bayush", first);
//		first = new Node<String>("hi", first);
//		System.out.println("\n" + removeLongWords(first));

	}

	public static void initListByLoop() {
		final int size = 5;
		System.out.println("members");
		int member = user.nextInt();

		Node node = new Node<Integer>(member);
		Node node1 = null;
		Node head = node;
		for (int i = 1; i < size; i++) {	

			System.out.println("mebmer [" + i + "]");
			member = user.nextInt();

			node1 = new Node(member);
			node.setNext(node1);
			node = node.getNext();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(head.getValue() + " --> ");
			head = head.getNext();

		}

	}

	public static boolean isInList(Node<Integer> first, int lookFor) {// לסדר את קליטת הערכים מהפונקציה הקודמת

		Node num = first;
		while (num != null) {
			if (first.getValue() == lookFor) {
				return true;
			}
			first = first.getNext();

		}
		return false;

	}

	public static Node<Integer> createFibonacciList(int numOfElements) {

		Node first = new Node(0);
		first.setNext(new Node(1));

		Node<Integer> prevPrev = first;
		Node<Integer> prev = first.getNext();

		for (int i = 3; i <= numOfElements; i++) {

			prev.setNext(new Node(prevPrev.getValue() + prev.getValue()));
			prevPrev = prev;
			prev = prev.getNext();
		}
		return first;
	}

	public static Node<String> removeLongWords(Node<String> first) {

		if (first == null) {
			return null;
		}
		if (first.getValue().length() > 3) {
			Node<String> newF = first.getNext();
			first.setNext(null);
			return removeLongWords(newF);
		}
		Node<String> current = first;
		while (current.getNext() != null) {
			if (current.getNext().getValue().length() > 3) {
				Node<String> remove = current.getNext();
				current.setNext(remove.getNext());
				remove.setNext(null);
			} else {
				current = current.getNext();
			}
		}
		return first;

	}

}
