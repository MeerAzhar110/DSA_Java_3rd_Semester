
public class StackClass {
	static class Node{
		int data;
		Node next;
		
		public  Node(int data) {
			this.data=data;
			next=null;
			
		}
	}
	
	static class Stack{
		public static Node head;
		
		public static boolean isEmpty() {
			return head==null;
			
		}
		
		public static void push(int data) {
			Node newNode = new Node(data);
			if (isEmpty()) {
				head=newNode;
				return;	
				
			}
			newNode.next=head;
			head=newNode;
			
		}
		
		public static int pop() {
			if (isEmpty()) {
				return -1;
				
			}
			
			int top=head.data;
			head=head.next;
			return top;
			
		}
		
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Empty");
				return -1;		
			}
			return head.data;
		}
		
		
	}

	public static void main(String[] args) {
		Stack sc = new Stack();
		
		sc.push(12);
		sc.push(13);
		sc.push(14);
		sc.push(15);
		
		while(!sc.isEmpty()) {
			System.out.println(sc.peek());
			sc.pop();
		}

	}

}
