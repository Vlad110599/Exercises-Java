
public class LinkedListQueue{

	private Nod front;
	private Nod rear;
	private int nr;
	
	public LinkedListQueue() {
		front = null;
		rear = null;
		nr = 0;
	}
	 
	 public int dequeue()
	 {
	 int data = front.val;
	 if (front.next == null) 
	 {
	 rear = null;
	 }
	 nr--;
	 front = front.next;
	 System.out.println(data+ " sters din coada!");
	 return data;
	 }
	 
	
	 public void enqueue(int data)
	 {
	 Nod oldRear = rear;
	 rear = new Nod();
	 rear.val = data;
	 rear.next = null;
	 if (nr == 0) 
	 {
	 front = rear;
	 }
	 else 
	 {
	 oldRear.next = rear;
	 }
	 nr++;
	 System.out.println(data+ " adaugat la coada!");
	 }
}
