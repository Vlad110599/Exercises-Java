
public class LinkedListStack {
   
	Nod head;
	
	public LinkedListStack(){
		head = null;
	}
	
	public int pop() {
     
		int value = head.val;
		head = head.next;
		return value;	
	}
	
	public void push(int value) {
		
		Nod oldhead = head;
		head = new Nod();
		head.val = value;
		head.next = oldhead;
	}
	
	public static void print(Nod head) {
		
		Nod temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		System.out.println();
	}
}
