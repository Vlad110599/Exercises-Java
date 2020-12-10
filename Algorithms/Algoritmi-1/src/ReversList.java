
public class ReversList {

	static Nod head;
	
	public ReversList(Nod head) {
		this.head = head;
	}
	
    public void add(Nod nod) {

    	Nod current = head;
    	while (current != null) 
    	{ 
    		if (current.next == null) 
    	{ 
    		current.next = nod; 
    		break; 
    	} 
    	current = current.next; 
    	}

	}
    
    public void revers() {
    	
    	Nod pointer = head; 
    	Nod previous = null, current = null; 
    	while (pointer != null) 
    	{ 
    		current = pointer; 
    	    pointer = pointer.next;
    	    current.next = previous; 
    	    previous = current; 
    	    head = current;
    	}
    }
    
    public static void print(Nod head) {
		
    	Nod node = head;
    	while (node != null) 
    	{ 
    		System.out.print(node.val + " ");
    		node = node.next; 
    	} 
    	System.out.println("");

	}
}
