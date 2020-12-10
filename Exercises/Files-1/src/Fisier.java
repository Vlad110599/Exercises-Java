import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fisier {
  
	public static void main(String[] args) throws IOException
	{
	Scanner el =  new Scanner(System.in);
	FileInputStream f=new FileInputStream("mat1.txt");
	InputStreamReader fchar=new InputStreamReader(f);
	BufferedReader buf=new BufferedReader(fchar);
	int m, n,i,j,s;
	String linie;
	StringTokenizer t;
	linie=buf.readLine();
	t=new StringTokenizer(linie);
	m=Integer.parseInt(t.nextToken());
	n=Integer.parseInt(t.nextToken());
	
	int a[][]=new int[m+1][];
	for(i=1;i<=m;i++)
	a[i]=new int[n+1];
	for(i=1;i<=m;i++){
	linie=buf.readLine();
	t=new StringTokenizer(linie);
	for(j=1;j<=n;j++)
	 a[i][j]=Integer.parseInt(t.nextToken());
	}
	fchar.close();
	
	
	int b[][]=new int[m+1][];
	for(i=1;i<=m;i++)
	b[i]=new int[n+1];
	for(i=1;i<=m;i++)
	for(j=1;j<=n;j++) {
	System.out.print("b["+i+"]["+j+"]: ");
	b[i][j] = Integer.parseInt(el.next());
	}
	
	int c[][]=new int[m][n];
	for(i=1;i<=m;i++)
	for(j=1;j<=n;j++)
		c[i][j] = a[i][j] + b[i][j];
	

	FileOutputStream g=new FileOutputStream("mat2.txt");
	PrintStream gchar=new PrintStream(g);
	
	ArrayList<Fisier> lista = new ArrayList<>();
	for(i=1;i<=m;i++)
	for(j=1;j<=n;j++) {
		gchar.println(c[i][j]);
	}
	
	}
}
	
