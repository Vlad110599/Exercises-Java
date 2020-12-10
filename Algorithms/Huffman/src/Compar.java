import java.util.Comparator;

public class Compar implements Comparator<Nod>{

	public int compare(Nod x, Nod y) 
	  { 
	    return x.data - y.data; 
	  } 
}
