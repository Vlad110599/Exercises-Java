import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Functie {

     ArrayList<Client> multime;
	
	public void Citeste()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("clienti.txt")));
			String line = br.readLine();
			ArrayList<Client> lista = new ArrayList<>();
			
			if(line!=null) {
				line = br.readLine();
			}
			while((line = br.readLine()) != null)
			{
				String[] s = line.split(",");
				lista.add(new Client(s[0],s[1],Integer.parseInt(s[2])));
			}
			br.close();
			multime = lista;
		}catch (IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	public void ClientiMajori() {
		/*try {
			BufferedReader br = new BufferedReader(new FileReader(new File("clienti.txt")));
			String line = br.readLine();
			ArrayList<Client> lista = new ArrayList<>();
			
		    if(line!=null) {
				line = br.readLine();
			}
			while((line = br.readLine()) != null)
			{
				String[] s = line.split(",");
				if(Integer.parseInt(s[3])>=18)
				lista.add(new Client(s[0], s[1], Integer.parseInt(s[3])));
			}
			br.close();
			multime = lista;
		}catch (IOException ex)
		{
			System.out.println(ex);
		}*/
		
		boolean found = false;
		String tempName ="";
		String tempPre ="";
		String tempAge ="";
		
		try {
			  Scanner x = new Scanner(new File("clienti.txt"));
			  ArrayList<Client> lista = new ArrayList<>();
			  x.useDelimiter("[,\n]");
			  
			  while(x.hasNext())
			  {
				  tempName = x.next();
				  tempPre = x.next();
				  tempAge = x.next();
				  
				  if(Integer.parseInt(tempAge.trim()) >= 18) {
					  lista.add(new Client(tempName,tempPre,Integer.parseInt(tempAge)));
				  }
			  }
			  x.close();
			  multime = lista;
			}
			catch(IOException ex)
			{
				System.out.println(ex);
			}
	}
	
	public void Afiseaza()
	{
		for (Client x : multime)
		{
			System.out.println(x);
			}
	}	
	
}
