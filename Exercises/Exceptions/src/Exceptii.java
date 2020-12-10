import java.lang.*;
import java.text.ParseException;
public class Exceptii {
	
	public static double radical (int x) throws Throwable{
		if(x<1)
		throw new Throwable("Numar negativ!");
		else
			return java.lang.Math.sqrt(x);
	}

	public static double sinus(int x) throws Throwable{
		if(java.lang.Math.sin(x)>1 || java.lang.Math.sin(x)<-1)
			throw new Throwable("Nu apartine intervalului (-1,1)");
		else
			return java.lang.Math.sin(x);
	}
	
	public static double cosinus(double x) throws Throwable{
		if(java.lang.Math.cos(x)>1 || java.lang.Math.cos(x)<-1)
			throw new Throwable("Nu apartine intervalului (-1,1)");
		else
			return java.lang.Math.cos(x);
	}
	
	public static double logaritm(int x) throws Throwable{
		if(x<0)
			throw new Throwable("Numarul nu pote fi negativ!");
		else
			return java.lang.Math.log10(x);
	}
	
	public static double maxim(int x, int y) throws Throwable{
		if(x==y)
			throw new Throwable("Numerele sunt egale");
		else
			return java.lang.Math.max(x,y);
	}
	
	public static double minim(int x, int y) throws Throwable{
		if(x==y)
			throw new Throwable("Numerele sunt egale");
		else
			return java.lang.Math.min(x,y);
	}
	
	public static void main(String[] args) {
		try {
			int a = 3;
			System.out.println("Radical din "+a+ " este "+radical(a));
			int b = -2;
			System.out.println("Radical din "+b+ " este "+radical(b));
		}catch(Throwable e) {
			System.out.println(e);
		}
		
		try {
			int c = 1;
			System.out.println("Sin de "+c+ " este "+sinus(c));
			int d = -3;
			System.out.println("Sin de "+d+ " este "+sinus(d));
		}catch(Throwable e2) {
			System.out.println(e2);
		}
		
		try {
			int x = 1;
			System.out.println("Cos de "+x+ " este "+cosinus(x));
			double y = 90;
			System.out.println("Cos de "+y+ " este "+cosinus(y));
		}catch(Throwable e3) {
			System.out.println(e3);
		}
		
		try {
			int x =40;
			System.out.println("Log de "+x+ " este "+logaritm(x));
			int y = -20;
			System.out.println("Log de "+y+ " este "+logaritm(y));
		}catch(Throwable e4) {
			System.out.println(e4);
		}
		
		try {
			int x = 1,y = 5;
			System.out.println("Maximul dintre "+x+ ","+y+" este "+maxim(x,y));
			int a = 3,b=3;
			System.out.println("Maximul dintre "+a+ ","+b+" este "+maxim(a,b));
		}catch(Throwable e5) {
			System.out.println(e5);
		}
		
		try {
			int x = 1,y = 5;
			System.out.println("Minimul dintre "+x+ ","+y+" este  "+minim(x,y));
			int a = 3,b=3;
			System.out.println("Maximul dintre "+a+ ","+b+" este "+minim(a,b));
		}catch(Throwable e6) {
			System.out.println(e6);
		}
		
		try {
			int a = 0;
			a = java.lang.Math.addExact(312111, 3211111);
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("addExtract / multiplyExtract");
		}

		
  }

}
