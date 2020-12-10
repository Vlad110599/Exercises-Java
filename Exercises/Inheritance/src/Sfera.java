
public class Sfera extends Punct {

	Sfera(double x, double y, double z) {
		super(x, y, z);
	}
	
	public static double calcVolum(double raza) {
		double v;
		v = 4*Math.PI*Math.pow(raza,2);
		return v;
	}

	public static double calcArie(double raza) {
		double a;
		a= (4*Math.PI*Math.pow(raza, 3))/3;
		return a;
	}
	
	public static Sfera centruGreutate(double raza) {
	    Sfera s = new Sfera(0,0,0);
		s.y = 4*raza/3*Math.PI;
		return s;
	}

}
