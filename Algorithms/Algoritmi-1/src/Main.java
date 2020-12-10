import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.println("1.Problema 1!");
        System.out.println("2.Problema 2!");
        System.out.println("3.Problema 3!");
        System.out.println("4.Problema 4!");
        System.out.println("5.Problema 6!");
        System.out.println("0. Quit");

        boolean quit = false;

        int menuItem;

        do {

              System.out.print("Alege o optiune: ");

              menuItem = in.nextInt();

              switch (menuItem) {

              case 1:

                    System.out.println("Problema 1: Stiva cu lista simplu inlantuita.");
                    
                    LinkedListStack list = new LinkedListStack();
            		
            		list.push(7);
            		list.push(10);
            		list.push(11);
            		list.push(21);
            		list.push(22);
            		list.push(30);
            		list.print(list.head);
            		System.out.println("Elementul " +list.pop()+" a fost sters din lista!");
            		System.out.println("Elementul " +list.pop()+" a fost sters din lista!");
            		list.push(44);
            		list.print(list.head);
                    

                    break;

              case 2:

                    System.out.println("Problema 2: Coada cu lista simplu inlantuita.");

                    LinkedListQueue coada = new LinkedListQueue();
            		
            		coada.enqueue(7);
            		coada.enqueue(10);
            		coada.enqueue(11);
            		coada.enqueue(21);
            		coada.enqueue(22);
            		coada.dequeue();
            		coada.enqueue(30);
            		coada.enqueue(31);
            		coada.enqueue(32);
            		coada.enqueue(33);
            		coada.dequeue();
            		coada.enqueue(34);
            		coada.dequeue();
            		coada.enqueue(54);

                    break;

              case 3:

                    System.out.println("Problema 3: Dictionar folosint lista circulara.");

                    Dictionar d = new Dictionar();
            		
            		d.insert("apa");
            		d.insert("pamant");
            		d.insert("casa");
            		d.insert("copac");
            		d.insert("banca");
            		d.print();
            		d.search("casa");
            		d.delete("casa");
            		d.print();
            		d.search("casa");
            		d.delete("apa");
            		d.print();

                    break;
                    
              case 4:

                  System.out.println("Problema 4: Reuniunea.");

                   Union l1 = new Union();
                   Union l2 = new Union();
                   
                   l1.push(1);
                   l1.push(2);
                   l1.push(3);
                   l1.push(4);
                   System.out.println("Prima lista:");
                   l1.print(l1.head);
                   
                   l2.push(4);
                   l2.push(5);
                   l2.push(6);
                   System.out.println("A doua lista:");
                   l2.print(l2.head);
                   
                   Union reuniune = new Union();
                   reuniune.getUnion(l1.head, l2.head);
                   System.out.println("Reuniunea celor 2 liste:");
                   reuniune.print(reuniune.head);

                  break; 

              case 5:

                    System.out.println("Problema 6: Lista invers.");

                    ReversList rl = new ReversList(new Nod(1));
            		
            		rl.add(new Nod(2));
            		rl.add(new Nod(3));
            		rl.add(new Nod(4));
            		rl.add(new Nod(5));
            		rl.print(rl.head);
            		rl.revers();
            		rl.print(rl.head);

                    break;

              case 0:

                    quit = true;

                    break;

              default:

                    System.out.println("Aceasta optiune nu exista!");

              }

        } while (!quit);
    }
}
	
