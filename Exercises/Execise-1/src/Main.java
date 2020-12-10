import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Vector;

public class Main {
 
	public static void main(String[] args) {
		
		try {
			  Vector<City> city = new Vector<City>();
			  File file = new File("cities.csv");
			  BufferedReader br = new BufferedReader(new FileReader(file));
			  try {
					String line = br.readLine();
					while((line=br.readLine())!=null)
					{
						String[] splituri = line.split(",");
						City c = new City(splituri[0],splituri[3].trim(),Integer.parseInt(splituri[4].trim()));
						city.add(c);
					}
					
					for(int i=0;i<city.size()-1;i++)
						for(int j=i+1;j<city.size();j++)
						{
							if(city.get(i).getPupulation() > city.get(j).getPupulation()) {
								City.PopulationSort(city.get(i),city.get(j));
							
							}
						}
					
					for(City cy:city)
					{
						System.out.println(cy.toString()+"\n");
					}
					
					}catch(IOException ioex)
					{
						ioex.printStackTrace();
					}
						
					}catch(FileNotFoundException fnfe)
					{
						System.out.println("Fisierul nu a fost gasit!");
						fnfe.printStackTrace();
					}
		
	}
	
}
