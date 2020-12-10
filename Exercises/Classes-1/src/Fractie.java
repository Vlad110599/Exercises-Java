import java.lang.*;

public class Fractie {
   public double x,y;
   
   public Fractie() {
	   this.x = 0;
	   this.y = 0;
   }
   
   public Fractie(double x, double y) {
	   this.x = x;
	   this.y = y;
   }
   
   public Fractie(double x) {
	   this.x = x;
	   this.y = 0;
   }
   
   
   public static Fractie adunare(Fractie f1, Fractie f2) {

	   Fractie f3 = new Fractie();
	   f3.x = (f1.x*f2.y)+(f2.x*f1.y);
	   f3.y = (f1.y*f2.y);
	   return f3;
   }
   
   public static Fractie scadere(Fractie f1, Fractie f2) {
	   
	   Fractie f3 = new Fractie();
	   f3.x = (f1.x*f2.y)-(f2.x*f1.y);
	   f3.y = (f1.y*f2.y);
	   return f3;
   }
   
   public static Fractie inmultire(Fractie f1, Fractie f2) {
	   
	   Fractie f3 = new Fractie();
	   f3.x = (f1.x*f2.x);
	   f3.y = (f1.y*f2.y);
	   return f3;
   }
   
   public static Fractie impartire(Fractie f1, Fractie f2) {
	   
	   Fractie f3 = new Fractie();
	   f3.x = (f1.x*f2.y);
	   f3.y = (f1.y*f2.x);
	   return f3;
   }
   
  public static Fractie simplificare(Fractie f1) {
   
   Fractie f2 = new Fractie();
   f2.x=f1.x;
   f2.y=f1.y;

   while(f2.x!=f2.y)
	   
	   if(f2.x > f2.y)
		   f2.x=f2.x-f2.y;
	   else 
		   f2.y=f2.y-f2.x;
   
   if(f2.x==1)  
	   System.out.println("Fractia este ireductibila!");
   else
	   f2.x=f1.x/f2.x;
	   f2.y=f1.y/f2.y;


	 return f2;
    
}
     
   public String toString() {
	   
	   return this.x+"/"+this.y;
	   
   }
}
