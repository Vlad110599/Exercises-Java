import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Thread {
  public void run() {
	  try {
		  Vector<Persoana> persoane = new Vector<>();
		  File file = new File("persoane.csv");
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  try {
				String line = br.readLine();
				while((line=br.readLine())!=null)
				{
					String[] splituri = line.split(",");
					Persoana p = new Persoana(splituri[0],splituri[1].trim(),Integer.parseInt(splituri[2].trim()));
					persoane.add(p);
				}
				
				for(Persoana pers:persoane)
				{
					System.out.println(pers.toString()+"\n");
				}
				for(int i=0;i<persoane.size()-1;i++)
					for(int j=i+1;j<persoane.size();j++)
					{
						if(persoane.get(i).getData()>persoane.get(j).getData())
							Persoana.Interschimbare(persoane.get(i),persoane.get(j));
					}
				File fo = new File("iesire.csv");
				BufferedWriter bw = new BufferedWriter(new FileWriter(fo));
				for(Persoana pers:persoane)
				{
					bw.write(pers.toString()+"\n");
				}
				
				br.close();
				bw.flush();
				bw.close();
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
