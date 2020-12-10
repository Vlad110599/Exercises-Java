import java.util.Scanner;

public class Backtracking {

private static char[][] C = new char[16][11];
private static int[] X = new int[100];
private static int[] P = new int[16];

public static void initial(int n) {
	for (int i = 1;i <= n;i++)
	{
      X[i]=0;
	}
}

private static void afisare(int n)
{
	for (int i = 1;i <= n;i++)
	{
		System.out.print(C[X[i]]);
		System.out.print(" ");
	}
	System.out.print('\n');
}

static void backPermutari(int m,int n, int k)
{
	for (int i = 1;i <= n;i++)
	{
		if (P[i] == 0)
		{
			X[m] = i;
			P[i] = 1;
			if (m == n)
			{
				afisare(n);
			}
			else
			{
				backPermutari(m + 1,n,k);
			}
		P[i] = 0;
		}
	}
}

static void backCombinari(int m,int n,int k)
{
	for (int i = X[m-1]+1;i <= n;i++)
	{
			X[m] = i;
			if (m == k)
			{
				afisare(n);
			}
			else
			{
				backCombinari(m + 1,n,k);
			}
	}
}

private static int valid(int m)
{
	int i;
	int ok;
	
	ok = 1;
	
	for (i = 1;i < m;i++)
	{
		if (X[m] == X[i])
		{
			ok = 0;
		}
	}
	return ok;
}


static void backAranjamente(int m,int n,int k)
{
	for (int i = 1;i <= n;i++)
	{
			X[m] = i;
			if (valid(m)!=0)
			{
				if(m == k)
				{	
					afisare(n);
				}	
				else
				{
					backAranjamente(m + 1,n,k);
				}
			}	
	}
}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n = 3 ;
	int k = 3 ;
	System.out.println("Introduceti numele/numerele:");
	for (int i = 1;i <= n;i++)
	{
		System.out.println("C["+i+"] = ");
		C[i] = sc.next().toCharArray();
	}
	System.out.println("Permutari:");
	backPermutari(1,n,k);
	initial(n);
	System.out.println("\nCombinari de "+n+" luate cate "+k+":");
	backCombinari(1,n,k);
	initial(n);
	System.out.println("\nAranjamente:");
	backAranjamente(1,n,k);
}	
	
}
