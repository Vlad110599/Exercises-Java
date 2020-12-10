import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		ListaSI lst = new ListaSI();
		//LinkedList lst = new LinkedList();
		lst.add(new Nod(15));
        lst.add(new Nod(16));
        lst.add(new Nod(17));
        lst.PrintNod();
         Nod head = new Nod(1);
		lst.addInceput(head, 5);
		//lst.PrintNod();
	}
	
}
