
public class Cub extends Punct{
      
	Cub(double x,double y,double z){
		super(x,y,z);
	}
	
	public static double calcVolum(double latura) {
		double v;
		v = Math.pow(latura, 3);
		return v;
	}

	public static double calcArie(double latura) {
		double a;
		a= 6*Math.pow(latura, 2);
		return a;
	}
	
	public static Cub centruGreutate(Cub c1,Cub c2,Cub c3,Cub c4,Cub c5,Cub c6,Cub c7,Cub c8) {
		Cub c = new Cub(0,0,0);
        c.x = (c1.getX()+c2.getX()+c3.getX()+c4.getX()+c5.getX()+c6.getX()+c7.getX()+c8.getX())/8;
        c.y = (c1.getY()+c2.getY()+c3.getY()+c4.getY()+c5.getY()+c6.getY()+c7.getY()+c8.getY())/8;
        c.z = (c1.getZ()+c2.getZ()+c3.getZ()+c4.getZ()+c5.getZ()+c6.getZ()+c7.getZ()+c8.getZ())/8;
		return c;
	}
}
