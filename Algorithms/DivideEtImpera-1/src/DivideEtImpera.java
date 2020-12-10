
public class DivideEtImpera {

	private final static int N = 7;
	private static int[] V = {2, 3, 4, 5, 6, 7, 8};
	
	
	static int RecursivDivideEtImpera(int Left, int Right, int x)
	{
		if (Left > Right)
		{
			return -1;
		}
		else
		{
			int Mid = (Left + Right) / 2;
			if (x == V[Mid])
			{
				return Mid;
			}
			if (x < V[Mid])
			{
				return RecursivDivideEtImpera(Left, Mid - 1, x);
			}
			else
			{
				return RecursivDivideEtImpera(Mid + 1, Right, x);
			}
		}
	}
	
	private static int IterativDivideEtImpera(int x)
	{
	  int Sol = -1;
	  int Left = 0;
	  int Right = N;
	  
	while (Left <= Right)
	{
		int Mid = (Left + Right) / 2;
	
		if (V[Mid] == x)
		{
	        Sol = Mid;
	        break;
	    }
		
	    if (V[Mid] > x)
	    {
	       Right = Mid - 1;
	    }
	    
	    if (V[Mid] < x)
	    { 
	       Left = Mid + 1;
	    }
	 }
	 return Sol;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Divide Et Impera recursiv: ");	
		System.out.println(RecursivDivideEtImpera(0, N-1, 5));
		System.out.println("Divide Et Impera iterativ: ");	
		System.out.print(IterativDivideEtImpera(5));
	}

	
}
	
