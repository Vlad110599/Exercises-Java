
public class Test {

	 public static void main(String args[]) {
	      ProdusVec gg = new ProdusVec();
	      ThreadDemo T1 = new ThreadDemo ( "Thread - 1 ",gg);
	      ThreadDemo T2 = new ThreadDemo ( "Thread - 2 ",gg);
	      T1.start();
	      T2.start();
	         try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
}
