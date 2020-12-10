import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArboriBinari ar = new ArboriBinari();
		Nod rootNod = Arbore();
		
		Scanner in = new Scanner(System.in);

        System.out.println("1.Problema 1!");
        System.out.println("2.Problema 2!");
        System.out.println("0. Quit");

        boolean quit = false;

        int menuItem;

        do {

              System.out.print("\nAlege o optiune: ");

              menuItem = in.nextInt();

              switch (menuItem) {

              case 1:
            	  
            	  System.out.println("\nProblema 1 !");
            	  System.out.println("\nPreordine:");
            	  ar.preordine(rootNod);
            	  System.out.println("\nPostordine:");
            	  ar.postordine(rootNod);
            	  System.out.println("\nInordine:");
            	  ar.inordine(rootNod);

                    break;

              case 2:

                    System.out.println("Problema 2!");
                    Heap<Integer> hp = new Heap<Integer>();
            		hp.insert(10);
            		hp.insert(8);
            		hp.insert(9);
            		hp.insert(7);
            		hp.insert(5);
            		hp.insert(3);
            		hp.insert(1);
            
            		System.out.println("SiftDown:");
            		while (!hp.isEmpty()) {
            			int max = hp.makeheap();
            			System.out.println(max + " " + hp);
            		}
            		
            		hp.insert(10);
            		hp.insert(8);
            		hp.insert(9);
            		hp.insert(7);
            		hp.insert(5);
            		hp.insert(3);
            		hp.insert(1);
            		System.out.println("Percolate:");
            		while (!hp.isEmpty()) {
            			int max = hp.slowmakeheap();
            			System.out.println(max + " " + hp);
            		}
                    break;

              case 0:

                    quit = true;

                    break;

              default:

                    System.out.println("Aceasta optiune nu exista!");

              }

        } while (!quit);
	}

	public static Nod Arbore() {
		
		Nod rootNod = new Nod(40);
		Nod nod1 = new Nod(20);
		Nod nod2 = new Nod(10);
		Nod nod3 = new Nod(30);
		Nod nod4 = new Nod(60);
		Nod nod5 = new Nod(50);
		Nod nod6 = new Nod(70);
		
		rootNod.left = nod1;
		rootNod.right = nod4;
		
		nod1.left = nod2;
		nod1.right = nod3;
		
		nod4.left = nod5;
		nod4.right = nod6;
		
		return rootNod;
	}
}
