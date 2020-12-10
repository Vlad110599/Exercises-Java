
public abstract class Punct {
	protected double x,y,z;
     
     Punct(double x,double y,double z) {
    	 this.x = x;
    	 this.y = y;
    	 this.z = z; 
     }
     
     public double getX() {
    	 return this.x;
     }
     
     public double getY() {
    	 return this.y;
     }
     
     public double getZ() {
    	 return this.z;
     }
   
     public String toString() {
    	 return "("+this.x+","+this.y+","+this.z+")";
     }
     
     public static double lungimelatura(Punct p1,Punct p2) {
    	 double l;
	   	 l=Math.abs(p1.getX()-p2.getX())+Math.abs(p1.getY()-p2.getY())+Math.abs(p1.getZ()-p2.getZ());
	   	 return l; 
     }
}
