import java.util.Scanner;

public class DivideEtImpera {

	private static int[] x = new int[50];
	private static int n;
	private static int i;

	private static int Part(int st,int dr)
	{

	int aux;
	int i;
	int j;
	int di;
	int dj;

	di = 0;
	dj = 1;
	i = st;
	j = dr;

	while (i < j)
	{

			 if (x[i] > x[j])
			 {
				 aux = x[i];
				 x[i] = x[j];
				 x[j] = aux;
				 aux = di;
				 di = dj;
				 dj = aux;
			 }

			 i = i + di;
			 j = j - dj;
	}

	 return j;

	}
	
	private static void QuickSort(int st,int dr)
	{

	int p;

	    if (st < dr)
	    {
		p = Part(st, dr);
        QuickSort(st, p - 1);
        QuickSort(p + 1, dr);
	    }
    } 
	
	public static void main(String[] args)
	  {

	 Scanner in = new Scanner(System.in);
	
	 System.out.println("Numarul de elemenente din lista: ");
	  n = in.nextInt();

	  
	  for (i = 1;i <= n;i++)
	  {
		  System.out.print("x["+i+"]= ");
		  x[i] = in.nextInt();
	  }

	  QuickSort(1, n);

	  for (i = 1;i <= n;i++)
	  {
		  System.out.print(x[i]);
		  System.out.print(" ");
	  }
	 
	}
}
