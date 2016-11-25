package stack;

public class Stack<T> implements stackable<T> {

	private Node head;
	private int size;
	private class Node{
		T data;
		Node next;
	}
	
	@Override
	public void push(T data) {
		Node memorizeNode = head;
		head = new Node();
		head.data = data;
		head.next = memorizeNode;
		size++;
	}

	@Override
	public T pop() {
		if (head != null){
			T retObj = head.data;
			head = head.next;
			size--;
			return retObj;
		}
		return null;
	}
	
	@Override
	public T peek() {
		if (head != null){
			return head.data;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
			head = null;
			size = 0;
	}

	@Override
	public void prinAll() {
		Node tmp = head;
		while(tmp != null){
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
		System.out.println();
	}



	


}
