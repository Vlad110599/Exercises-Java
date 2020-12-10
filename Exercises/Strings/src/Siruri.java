import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Siruri {
	
public static void main(String args[]) {
	
	 Scanner x = new Scanner(System.in);
	 System.out.println("1.Lungimea sirului.");
	 System.out.println("2.Ultima pozitie a literei a.");
	 System.out.println("3.De cate ori se repeta secventa abc.");
	 System.out.println("4.Verifica daca sirul este palindrom.");
	 System.out.println("5.Stergerea literelor de pe pozitii pare.");
	 System.out.println("0. Quit");
	    	
	 boolean quit = false;
	 int menu;
	    	
	 do {
	 System.out.println("Alege o optiune: ");
	 menu = x.nextInt();
	 switch(menu) {  
	 case 1:
		    Scanner s = new Scanner(System.in);
		    System.out.println("Introduceti un sir: ");
		    String input=s.nextLine();
	    	System.out.println("Lungimea sirului este = " + input.length()); 
	    	break;
	 case 2:
		    Scanner s1 = new Scanner(System.in);
		    System.out.println("Introduceti un sir: ");
		    String input1 = s1.nextLine();
		    int pozitie = 0;
		    char[] sir = input1.toCharArray();
		    for(int i=0;i<input1.length();i++)
		    	if(sir[i]=='a')
		    		pozitie=i;
		    System.out.println("Ultima pozitie a literei a  = " + pozitie); 
	    	break;
	 case 3:
		    Scanner s2 = new Scanner(System.in);
		    System.out.println("Introduceti un sir: ");
		    String input2 = s2.nextLine();
		    String[] split = input2.split(" ");
		    int abc = 0;
		    for(int i=0;i<split.length;i++)
		    	{if(split[i].contains("abc"))
		    		abc++;
		    	}
		    System.out.println("Secventa abc se repeta de " + abc + " ori.");
	    	break;
	 case 4:
		    Scanner s3 = new Scanner(System.in);
		    System.out.println("Introduceti un sir: ");
		    String input3=s3.nextLine();
		    char[] invers;
		    char[] sir1 = input3.toCharArray();
		    String palindrom = "";
		    invers = new char[sir1.length];
		    
		    for(int i=0;i<input3.length();i++)
		    	palindrom+=input3.charAt(input3.length()-i-1);
		    if(palindrom.equals(input3))
		    	System.out.println("Sirul este palindrom!");
		    else
		    	System.out.println("Sirul nu este palindrom!");
		    
	    	break;
	 case 5:
        	{
        		Scanner s4 = new Scanner(System.in);
    		    System.out.println("Introduceti un sir: ");
    		    String input4=s4.nextLine();
    		    StringBuffer sir4 = new StringBuffer(input4);
    		    for(int i=0;i<sir4.length();i++) {
    		    	if(i%2==0)
    		    		sir4.deleteCharAt(i);
    		    }
    		    System.out.println("Sirul dupa ce au fost sterse literele este: "+sir4);
	        }
	    	break;
	 case 0:
	    	quit = true;
	        break;
	 default:
	        System.out.println("Aceasta optiune nu exista!");
      }
	}while(!quit);
  }
}


