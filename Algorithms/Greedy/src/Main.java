import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("n=");
		n = in.nextInt();	
		ArrayList<Integer> l = new ArrayList<Integer>(n);
		System.out.println("Sir:");
		for(int i=1 ;i<=n;i++) {
			l.add(in.nextInt());
		}
		Greedy g = new Greedy();
		System.out.println("Greedy:");
		g.interopt(l);
		
	}
}
