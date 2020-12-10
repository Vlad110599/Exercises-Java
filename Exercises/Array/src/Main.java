import java.util.Scanner;

public class Main extends Program {

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
