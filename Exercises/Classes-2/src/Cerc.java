import java.math.*;

public class Cerc extends Forma2D{
	
    private double raza;
    
	public Cerc(String forma,double raza) {
		super(forma);
		this.raza = raza;
		System.out.println("Constructor Cerc...");
	}
	
	public double getRaza() {
		return this.raza;
	}
	
	public static double lungime(Cerc c) {

		   return 2*Math.PI*c.getRaza();
	   }
	
	public static double suprafata(Cerc c) {

		   return Math.PI*Math.pow(c.getRaza(), 2);
	   }
}
