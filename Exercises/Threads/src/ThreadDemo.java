import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ThreadDemo extends Thread{
  
	private Thread thrd;
	   private String thrdName;
	   ProdusVec pv;
	   ThreadDemo( String name,ProdusVec prv) {
	      thrdName = name;
	      pv = prv;
	   }
	    public void run() {
	     int pr = 0;
	     String linie;
	     try {
			pr = pv.prVec();
			FileOutputStream g=new FileOutputStream("out.txt");
			PrintStream gchar=new PrintStream(g);
			linie="";
			linie=linie+pr;
			gchar.println(linie);
			gchar.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	      System.out.println("Thread " +  thrdName + " exiting.");
	   }
	   public void start () {
	      System.out.println("Starting " +  thrdName );
	      if (thrd == null) {
	         thrd = new Thread (this, thrdName);
	         thrd.start ();
	      }
	   }

}
