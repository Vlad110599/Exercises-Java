import javax.xml.soap.Node;

//import test.Nod;

public class ListaSI {

	public Nod head;
	public Nod current;
	
	public ListaSI() {
		head = null;
	}
	
	public void ListaSI(Nod nou) {
		 Nod aux = head;
		 while(aux.getNext() != null) {
			 aux.setNext(aux.getNext());
		 }
		 aux.setNext(nou);
		
	} 
	
	void PrintNod()
    {
        while (head != null)
        {
            System.out.println(head.getInfo());
            head = head.getNext();
        }
    }
	
	public void add(Nod newNode)
    {
        if (head == null)
        {
            head = newNode;
            current = head;
        }
        else
        {
            current.setNext(newNode);
            current = current.getNext();
        }
    }
	
	
	public void addInceput(Nod head,int info) {

		Nod el = new Nod(1);
		el.setInfo(info);
		el.setNext(head);
		head = el;
		
  }
	
	public void addFinal(int info) {

		Nod el_f = new Nod(0);
		el_f.setInfo(info);
		el_f.setNext(null);
		
		if(head == null) {
			head = el_f;
		}
		else {
			Nod nod_curent = head;
			while(nod_curent != null) {
               nod_curent = nod_curent.getNext();
			}
               nod_curent.setNext(el_f);
		
      }
   }
	
	public void stergere(Nod prev) {
		Nod n = prev.getNext();
		prev.setNext(prev.getNext().getNext());
	}
}	