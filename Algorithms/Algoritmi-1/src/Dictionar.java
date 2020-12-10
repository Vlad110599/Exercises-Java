
public class Dictionar {

	private Node head = null;
	private Node tail = null;

	public void insert(String value) {
		
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		}else {
			tail.next = newNode;
		}
			
		tail = newNode;
		tail.next = head;
	}
	
	public void search(String value) {
		Node currentNode = head;
		
		if(head == null) {
			System.out.println("Cuvantul cautat nu exista!");
		}else {
			do {
				if(currentNode.value == value) {
					System.out.println("Cuvantul cautat exista!");
				}
				currentNode = currentNode.next;	
			}while(currentNode != head);
				System.out.println("Cuvantul cautat nu exista!");	
		}
	}
	
	public void delete(String value) {
		Node currentNode = head;
		
		if (head != null) {
	        if (currentNode.value == value) {
	            head = head.next;
	            tail.next = head;
	        } else {
	            do {
	                Node nextNode = currentNode.next;
	                if (nextNode.value == value) {
	                    currentNode.next = nextNode.next;
	                }
	                currentNode = currentNode.next;
	            } while (currentNode != head);
	            System.out.println(value+" a fost sters!");
	        }
	    }
	}
	
	public void print() {
	    Node currentNode = head;
	 
	    if (head != null) {
	        do {
	            System.out.println(currentNode.value + " ");
	            currentNode = currentNode.next;
	        } while (currentNode != head);
	    }
	}
}
