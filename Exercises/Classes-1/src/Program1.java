
public class Program1 {
   
	public static void main(String[] args) {
	   Fractie f1 = new Fractie(4,2);
	   System.out.println("Fractia 1 = "+f1.toString());
	   Fractie f2 = new Fractie(8,3);
	   System.out.println("Fractia 2 = "+f2.toString());
	   Fractie f3 = new Fractie();

	   
	   f3=Fractie.adunare(f1, f2);
	   System.out.println("f1 + f2 = "+f1.toString()+" + "+f2.toString()+" = "+f3.toString());
	   
	   f3=Fractie.scadere(f1, f2);
	   System.out.println("f1 - f2 = "+f1.toString()+" - "+f2.toString()+" = "+f3.toString());
	   
	   f3=Fractie.inmultire(f1, f2);
	   System.out.println("f1 * f2 = "+f1.toString()+" * "+f2.toString()+" = "+f3.toString());
	   
	   f3=Fractie.impartire(f1, f2);
	   System.out.println("f1 : f2 = "+f1.toString()+" : "+f2.toString()+" = "+f3.toString());
	   
	   f3=Fractie.simplificare(f1);
	   System.out.println("Fractia f1 = "+f1.toString()+" simplificata este: "+f3.toString());
	   
   }
}
