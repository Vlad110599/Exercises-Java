
public class Union {

	 Nod head;
	
	public Union() {
		head = null;
	}
	
	public void push(int value) {
		
         Nod new_node = new Nod(value);
        new_node.next = head;
        head = new_node;
	}
	
	void getUnion(Nod head1, Nod head2)
    {
        Nod t1 = head1, t2 = head2;
 
        
        while (t1 != null)
        {
            push(t1.val);
            t1 = t1.next;
        }
 
       
        while (t2 != null)
        {
            if  ((t2.val != head1.val))
                push(t2.val);
            t2 = t2.next;
        }
    }
	
	public static void print(Nod head) {
		
       Nod temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

	}
	
}
