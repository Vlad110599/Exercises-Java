import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Matrice {

	public static void main(String[] args) {
		
		try {
			File f = new File("mat.txt");
			BufferedReader bf = new BufferedReader(new FileReader(f));
			
			try {
				int n = Integer.parseInt(bf.readLine());
				ArrayList <Margine> mar = new ArrayList <Margine>();
				String line="";
				while((line=bf.readLine())!=null)
				{
					String splituri[] = line.split(",");
					Margine e = new Margine(Integer.parseInt(splituri[0]),Integer.parseInt(splituri[1]));
					mar.add(e);
				}
				
				for(Margine i:mar)
				{
					System.out.println(i.toStirng());
				}
				
				int test=0;
				for(int i=0;i<mar.size()-1;i++)
					for(int j=i+1;j<mar.size();j++)
					{
						if((mar.get(i).varf==mar.get(j).linie) && (mar.get(j).varf==mar.get(i).linie))
							{
							
							   test=1;
							   
							}
					}
				
				//------------------Mat de adiacenta---------------------
				int matad [][] = new int[n][n];
				for(int i = 0;i<n;i++)
					for(int j=0;j<n;j++)
					{
						matad[i][j] = 0;
					}
				
				for(Margine cnt:mar)
				{
					matad[cnt.varf][cnt.linie]++;
					if(test==0&&(cnt.varf!=cnt.linie))
					{
					matad[cnt.linie][cnt.varf]++;
					}
					
				}
			
				System.out.println();
				System.out.println("Matricea de adiacenta:");
				
				for(int i = 0;i<n;i++)
					{for(int j=0;j<n;j++)
					{
						System.out.print(matad[i][j]+" ");
					}
					System.out.println();
					}
	       //---------------------------------------------------------------------------	
				
		    //-----------------------Mat de incidenta-------------------------------------
				
				int matid[][] = new int[n][mar.size()];
				for(int i = 0;i<n;i++)
					for(int j=0;j<n;j++)
					{
						matid[i][j] = 0;
					}
				
				for(Margine cnt:mar)
				{
					matid[cnt.varf][mar.indexOf(cnt)]++;
					matid[cnt.linie-1][mar.indexOf(cnt)]++;
					
				}
				
				System.out.println();
				System.out.println("Matricea de incidenta:");
				
				for(int i = 0;i<n;i++)
					{for(int j=0;j<mar.size();j++)
					{
						System.out.print(matid[i][j]+" ");
					}
					System.out.println();
					}
		//-------------------------------------------------------------------------		
				
		//------------------------Liste de adiacenta-------------------------------
				
				System.out.println();
				System.out.println("Listele de adiacenta:");
				
				for(int i = 0;i<n;i++)
					{int nod = i+1;
					System.out.print("Nodurile adiacente nodului "+nod+" : ");
					for(int j=0;j<n;j++)
					{	
						
						if(matad[i][j]>0)
						{
							int ad = j+1;
							System.out.print(ad+" ");
						}
					}
					System.out.println();
					}
				
				bf.close();
				
				}catch(IOException io)
				{
					
				}
					
				}catch(FileNotFoundException fnf)
				{
					
				}
			}

		}
