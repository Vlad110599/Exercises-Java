
public class Program {
    public static void main(String[] args) {
    	
    	Cub A=new Cub(0,0,0);
    	Cub B=new Cub(1,0,0);
    	Cub C=new Cub(1,1,0);
    	Cub D=new Cub(0,1,0);
    	Cub A1=new Cub(0,0,1);
    	Cub B1=new Cub(1,0,1);
    	Cub C1=new Cub(1,1,1);
    	Cub D1=new Cub(0,1,1);
        System.out.println("Cub:");
        System.out.println("P1:"+A.toString());
        System.out.println("P2:"+B.toString());
        System.out.println("P3:"+C.toString());
        System.out.println("P4:"+D.toString());
        System.out.println("P5:"+A1.toString());
        System.out.println("P6:"+B1.toString());
        System.out.println("P7:"+C1.toString());
        System.out.println("P8:"+D1.toString());
        
        double l,v,a;
        
        l=Punct.lungimelatura(A,B);
        System.out.println("Latura Cub: "+l);
        
        v=Cub.calcVolum(l);
        System.out.println("Volum Cub: "+v);
        
        a=Cub.calcArie(l);
        System.out.println("Arie Cub: "+a);
        
        Cub c3 = new Cub(0,0,0);
        c3 = Cub.centruGreutate(A,B,C,D,A1,B1,C1,D1);
        System.out.println("G: "+c3.toString());
        
        System.out.println(" ");
        Sfera s1 = new Sfera(1,1,1);
        Sfera s2 = new Sfera(4,5,6);
        System.out.println("Sfera: ");
        System.out.println("Centrul:"+s1.toString());
        System.out.println("Punct de margine:"+s2.toString());
        
        double r,vol,arie;
        
        r = Punct.lungimelatura(s1, s2);
        System.out.println("Raza sferei: "+r);
        
        vol = Sfera.calcVolum(r);
        System.out.println("Volumul sferei: "+vol);
        
        arie = Sfera.calcArie(r);
        System.out.println("Aria sferei: "+arie);
        
        Sfera s3 = new Sfera(0,0,0);
        s3 = Sfera.centruGreutate(r);
        System.out.println("G: "+s3.toString());
    }
}
