import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Program {

	public static void Dezordine() {
		
		Scanner el = new Scanner(System.in);
		int n;
		System.out.println("Introduceti numarul de elemente al sirului:" );
		n = el.nextInt();
		int [] sir = new int[n];
		System.out.println("Introduceti elementele din sir:");
		for(int i = 0; i<n ;i++)
		{
			System.out.print("sir["+i+"]: ");
			sir[i] = Integer.parseInt(el.next());
		}
		System.out.println("Sirul este: "+Arrays.toString(sir));
		
		int count = 0;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				if(sir[i]>sir[j] && i<j)
				{
					count ++;
					System.out.println("("+sir[i]+","+sir[j]+")");
				}
					
			}
		
		System.out.println("Nr. perechi in dezordine: "+count);
	}
	
     public static void Transpusa() {
    	 
    	 Scanner el =  new Scanner(System.in);
 		
 		int n,m;
 		
 		System.out.println("Introduceti numarul de linii: ");
 		n =  el.nextInt();
 		System.out.println("Introduceti numarul de coloane: ");
 		m = el.nextInt();
 		
 		int [][] mat1 = new int[n][m];
 		int [][] mat2 = new int[n][m];
 		
 		System.out.println("Introduceti elementele primei matrici: ");
 		for(int i = 0;i < n ;i++)
 			for(int j = 0;j < m ; j++)
 			{
 				System.out.print("mat1["+i+"]["+j+"]: ");
 				mat1[i][j] = Integer.parseInt(el.next());
 			}
 		
 		for(int i = 0; i < n; i++)
 		{
 			System.out.println("\n");
 			for(int j = 0; j < m; j++)	
 				System.out.print(mat1[i][j] + " ");
 		}		
 		
 		System.out.println("\nIntroduceti elementele celei de a 2 matrice: ");
 		for(int i = 0;i < n ;i++)
 			for(int j = 0;j < m ; j++)
 			{
 				System.out.print("mat2["+i+"]["+j+"]: ");
 				mat2[i][j] = Integer.parseInt(el.next());
 			}
 		
 		for(int i = 0; i < n; i++)
 		{
 			System.out.println("\n");
 			for(int j = 0; j < m; j++)	
 				System.out.print(mat2[i][j] + " ");
 		}		
 		
 		int [][] mat3 = new int[n][m];
 		for(int i = 0; i < n; i++)
 			   for(int j = 0; j < m; j++)
 			   	   mat3[i][j] = mat1[i][j] + mat2[i][j];
 		
 		System.out.println("\nSuma celor doua matrici: ");
 		
 		for(int i = 0; i < n; i++)
 		{
 			System.out.println("\n");
 			for(int j = 0; j < m; j++)	
 				System.out.print(mat3[i][j] + " ");
 		}
 		
 		System.out.println("\nTranspusa sumei celor 2 matrici: ");
 		for(int i = 0; i < m; i++)
 		{
 			System.out.println("\n");
 			for(int j = 0; j < n; j++)	
 				System.out.print(mat3[j][i] + " ");
 		}
     }
     
     public static void Suma() {
    	 Scanner el = new Scanner(System.in);
 		int n,m;
 		System.out.println("Introduceti numarul de elemente din vector:" );
 		n = el.nextInt();
 		System.out.println("Introduceti numarul de elemente din vector pentru suma:" );
 		m = el.nextInt();
 		
 	    Vector<Integer> v = new Vector<>(n);	
 	    System.out.println("Introduceti elementele din vector:");
 		for(int i =0;i<n;i++)
 		{
 			v.add(el.nextInt());
 		}
 		System.out.println("Vectorul este: "+v);
 	    
 	    Vector<Integer> vtemp = new Vector<>(); 

 		for(int i = 0; i < v.size(); i++){
 			if(vtemp.contains(v.get(i))) {
 				continue;
 			}
 			vtemp.add(v.get(i));
 		}
 		System.out.println("Vectorul dupa indepartare dublicate: "+vtemp);
 		
 		Collections.sort(vtemp);
 		Collections.reverse(vtemp);
 		
 		if(vtemp.size() < m){
 			System.out.println("IMPOSIBIL");
 		}
 		else {
 	    int suma =0 ;
 		for(int i = 0;i<m;i++)
 		{
 			suma+=vtemp.get(i).intValue();
 		}		
 	 System.out.println("Suma maxima: "+suma);
 		}
     }
     
     public static void Stiva() {
    	 
    	 Stack s = new Stack();
    	 
    	 s.push("Ora 7: Ma trezesc");
    	 s.push("Ora 8: Facultate");
    	 s.push("ora 14: Facultate");
    	 s.push("ora 15: Mananc");
    	 s.push("ora 16: Pauza");
    	 s.push("ora 18: Merg la football");
    	 s.push("ora 20: Fac dus");
    	 s.push("ora 21: Mananc");
    	 s.push("ora 22: Ma culc");
    	 
    	 System.out.println(s);
    	 
    	 Stack s1 = new Stack();
         while(!s.empty())
         {
            s1.push(s.peek());
            s.pop();
         } 
         
         int pr = 0;
         while(pr < 3) {
        	 s1.pop();
        	 pr++;
         }
         while(!s1.empty())
         System.out.println(s1.pop());
     }
     
     
     public static void main(String[] args) {
 		
 		Scanner in = new Scanner(System.in);

         System.out.println("1. Exercitiul 1");
         System.out.println("2. Exercitiul 2");
         System.out.println("3. Exercitiul 3");
         System.out.println("4. Exercitiul 4");

         System.out.println("0. Quit");

         boolean quit = false;

         int menuItem;

         do {

               System.out.print("\nAlege o optiune: ");

               menuItem = in.nextInt();

               switch (menuItem) {

               case 1:
                 
             	    System.out.print("Exercitiul 1: \n");
                     Dezordine();

                     break;

               case 2:

             	    System.out.print("Exercitiul 2: \n");
                     Transpusa();

                     break;

               case 3:
             	  
             	    System.out.print("Exercitiul 3: \n");
             	    Suma();

                     break;

               case 4:

             	     System.out.print("Exercitiul 4: \n");
             	     Stiva();

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
