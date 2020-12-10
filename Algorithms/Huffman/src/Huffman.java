import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman {

	public static void printCode(Nod root, String s) 
	  {
	    if (root.left == null && root.right == null && Character.isLetter(root.c)) {

	      System.out.println(root.c + "  -  " + s);

	      return;
	    }
	    printCode(root.left, s + "0");
	    printCode(root.right, s + "1");
	  }
	
	public static void main(String[] args) 
	  { 

	    Scanner s = new Scanner(System.in); 

	    int n = 6; 
	    char[] c = { 'A', 'B', 'C', 'D' ,'E','F' }; 
	    int[] freq = { 45 , 13 , 12 , 16 , 9 , 5 }; 
	 
	    PriorityQueue<Nod> q = new PriorityQueue<Nod>(n, new Compar()); 

	    for (int i = 0; i < n; i++) {
	    	Nod hn = new Nod();

	      hn.c = c[i];
	      hn.data = freq[i];

	      hn.left = null;
	      hn.right = null;

	      q.add(hn);
	    }
	    
	   Nod root = null;
	    
	    while (q.size() > 1) {

	      Nod x = q.peek();
	      q.poll();

	      Nod y = q.peek();
	      q.poll();

	      Nod f = new Nod();

	      f.data = x.data + y.data;
	      f.c = '-';
	      f.left = x;
	      f.right = y;
	      root = f;

	      q.add(f);
	    }
	    System.out.println(" Caracter - Cod ");
	    printCode(root, ""); 
	  } 
	
}
