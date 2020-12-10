import java.util.Scanner;

public class Dame {

private static int n;
private static int[] v = new int[100];
private static int sol;

private static void afisare()
{	
	sol++;
	
	System.out.print("Solutia:");
	System.out.print(sol);
	System.out.print("\n");
	
	for (int i = 1;i <= n;i++)
	{
		for (int j = 1;j <= n;j++)
		{
			if (v[i] == j)
			{
				System.out.print("Regina nr. "+i+ ": linia "+i+" coloana "+j);
			}
		}
		System.out.print("\n");
	}
}

private static int valid(int k)
{	
	for (int i = 1;i <= k - 1;i++)
	{
		if ((v[i] == v[k]) || (Math.abs(v[k] - v[i]) == (k - i)))
		{
			return 0;
		}
	}
	return 1;
}

private static int solutie(int k)
{
	if (k == n)
	{
		return 1;
	}
	return 0;
}

private static void backtracking(int k)
{
	for (int i = 1;i <= n;i++)
	{
		v[k] = i;
		if (valid(k) == 1)
		{
			if (solutie(k) == 1)
			{
				afisare();
			}
			else
			{
				backtracking(k + 1);
			}
		}
	}
}

public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.print("n=");
	n = in.nextInt();
	backtracking(1);
}	
}
