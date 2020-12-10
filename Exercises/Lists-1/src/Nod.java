
public class Nod {

	private int info;
	private Nod next;
	
	public Nod(int x) 
	{
		this.info = x;
		this.next = null;
	}
	
	public Nod getNext(){
		return this.next;
	}
	
	public void setNext(Nod x) {
	       this.next = x;
	}
	
	public int getInfo(){
		return this.info;
	}
	
	public void setInfo(int x) {
	       this.info = x;
	}
	
	public boolean equals ( Object o ) { 
		 if ( ! ( o instanceof Nod) )
			 return false ; 
		 Nod pt = ( Nod ) o ;
		 return (( pt.info == this.info) && (pt.next==this.next) ) ; 
		 } 
	
	public String toString() {
		return this.info+" + "+this.next;
	}
	
}
