import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class ProdusVec {
   public int prVec() throws IOException  {
	   
	        FileInputStream f=new FileInputStream("in.txt");
			InputStreamReader fchar=new InputStreamReader(f);
			BufferedReader buf=new BufferedReader(fchar);
			int n,i,j,temp;
			String linie;
			linie=buf.readLine();
			n=Integer.parseInt(linie);
			int v[]=new int[n+1];
			linie=buf.readLine();
			StringTokenizer t=new StringTokenizer(linie);
			for(i=1;i<=n;i++)
			 v[i]=Integer.parseInt(t.nextToken());
			fchar.close();
			
			int pr = 1;
			
			for(i=1;i<=n;i++) {
			   pr = pr*v[i];
				}
		  return pr;
   }
}
