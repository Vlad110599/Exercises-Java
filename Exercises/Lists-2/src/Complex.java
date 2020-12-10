
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Complex {

	public double x;
	public double y;
	
	public Complex(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	 public boolean equals ( Object o ) { 
		 if ( ! ( o instanceof Complex) )
			 return false ; 
		 Complex pt = ( Complex ) o ;
		 return (( pt . x == this . x) && ( pt . y==this . y) ) ; 
		 } 
	 
	 public int hashCode () { 
		 return (int) (this.x + this.y);
		 } 
	
	public String toString() {
		if(y>=0)
		{
		return this.x+" + "+this.y+"i";
		}
		else
			return this.x+" "+this.y+"i";
	}
	
	public Complex addel() {
		
		Scanner el = new Scanner(System.in);
		int re,im;
		Complex c = new Complex(0,0);
		System.out.println("Partea reala: ");
		re = el.nextInt();
		System.out.println("Partea imaginara: ");
		im = el.nextInt();
		c.x = re;
		c.y = im;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Set s = new HashSet();
		Complex c = new Complex(0,0);
		int n;
		System.out.println("Introduceti numarul de elemente din lista:");
		n = in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("\nNumarul: "+i);
			s.add(c.addel());
		}
        
        System.out.println("1. Dimensiune lista.");
        System.out.println("2. Verifica daca un numar exista in lista.");
        System.out.println("3. Stergerea uni element din lista.");
        System.out.println("4. Suma elementelor din lista.");
        System.out.println("5. Afisarea listei.");

        System.out.println("0. Quit");

        boolean quit = false;

        int menuItem;

        do {

              System.out.print("\nAlege o optiune: ");

              menuItem = in.nextInt();

              switch (menuItem) {

              case 1:
                
            	    System.out.print("Optiunea 1: \n");
            	    int size = s.size();
            	    System.out.println(size);
            	    
                    break;

              case 2:

            	    System.out.print("Optiunea 2: \n");
				    Complex c1 = new Complex(0,0);
				    System.out.println("\nIntrofuceti un numar complex");
	
				      c1 = c.addel();
	            	if(s.contains(c1) == true) {
	            		  System.out.println("Exista numarul "+c1.toString()+" in lista.");
					} else 
	            		{
						s.add(c1);
						System.out.println("Numarul "+c1+" a fost afaugat in lista.");
						}
				System.out.println("Dimensiunea listei: "+s.size());
                    break;

              case 3:
            	  
            	    System.out.print("Optiunea 3: \n");
            	    
            	    Complex a = new Complex(0,0);
				    System.out.println("\nIntroduceti numarul:");
	
				      a = c.addel();
	            	if(s.contains(a) == false) {
	            		  System.out.println("Numarul "+a.toString()+" nu exista in lista.");
					} else 
	            		{
						s.remove(a);
						System.out.println("Numarul "+a+" a fost sters din lista");
						}
            	   

                    break;

              case 4:

            	     System.out.print("Optiunea 4: \n");
            	    
            	     Complex suma = new Complex(0,0);
            	     Iterator sum = s.iterator();
                    for(int i=1;i<=s.size();i++) {
                    	Complex element = (Complex) sum.next();
                    	suma.x = suma.x + element.x;
                    	suma.y = suma.y + element.y;
                    }
                    System.out.print("Suma elementelor este:  "+suma.toString());
                    
                    break;
                    
              case 5:

         	     System.out.print("Optiunea 5: \n");
         	    Iterator it = s.iterator();
         	    while ( it.hasNext() ) {
         	   Object element = it.next();
         	   System.out.println(element); }
         	    

                 break;


              case 0:

                    quit = true;

                    break;

              default:

                    System.out.println("Aceasta optiune nu exista.");

              }

        } while (!quit);
	}
}