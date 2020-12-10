import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Functii {

	ArrayList<Cont> multime;
	
	public void Citeste()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("cont.txt")));
			String line = br.readLine();
			ArrayList<Cont> lista = new ArrayList<>();
			
			/*if(line!=null) {
				line = br.readLine();
			}*/
			while((line = br.readLine()) != null)
			{
				String[] s = line.split(",");
				lista.add(new Cont(s[0], s[1]));
			}
			br.close();
			multime = lista;
		}catch (IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	public void verifica() {
		
		/*try {
			Scanner el =  new Scanner(System.in);
			String pass,user;
			System.out.println("User: ");
			user = el.next();
			System.out.println("Pass: ");
			pass = el.next();
		
	    BufferedReader br = new BufferedReader(new FileReader(new File("cont.txt")));
	    ArrayList<Cont> lista = new ArrayList<>();
		
		Cont nume,parola;
	    
		String linie;
		//StringTokenizer t;
		linie=br.readLine();
		if(linie!=null) {
			linie = br.readLine();
		}
		while((linie = br.readLine()) != null)
		{
			String[] s = linie.split(", ");
			Cont c = new Cont(s[0],s[1]);
			//lista.add(new Cont(s[0], s[1]));
			if(user == c.getname() && pass == c.getpass() ) {
				System.out.println("Te-ai logat cu succes!");
			}
			else
			{
				System.out.println("Parola gresita!");
			}
		}
		br.close();
		//multime = lista;
		
		}catch (IOException ex)
		{
			System.out.println(ex);
		}*/
		boolean found = false;
		String tempUsername ="";
		String tempPass ="";
		Scanner el =  new Scanner(System.in);
		String pass,user;
		System.out.println("User: ");
		user = el.next();
		System.out.println("Pass: ");
		pass = el.next();
		
		try {
		  Scanner x = new Scanner(new File("cont.txt"));
		  x.useDelimiter("[,\n]");
		  
		  while(x.hasNext() && !found)
		  {
			  tempUsername = x.next();
			  tempPass = x.next();
			  
			  if(tempUsername.trim().equals(user.trim()) && tempPass.trim().equals(pass.trim())) {
				  found = true;
				  System.out.println("Te-ai logat cu succes!");
			  }
		  }
		  if(found != true)
			  System.out.println("Parola gresita!"); 
		  x.close();
		  //System.out.println(true);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		
    }
	
	
	public void Afiseaza()
	{
		for (Cont x : multime)
		{
			System.out.println(x);
			}
	}	
}
