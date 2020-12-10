
public class LCS {
	static void lcs(String S1, String S2, int m, int n) 
	{
	    int[][] LCS = new int[m + 1][n + 1];

	    for (int i = 0; i <= m; i++) 
	    {
	      for (int j = 0; j <= n; j++) 
	      {
	        if (i == 0 || j == 0)
	          LCS[i][j] = 0;
	        else if (S1.charAt(i - 1) == S2.charAt(j - 1))
	          LCS[i][j] = LCS[i - 1][j - 1] + 1;
	        else
	          LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
	      }
	    }

	    int index = LCS[m][n];
	    int temp = index;

	    char[] lcs = new char[index + 1];
	    lcs[index] = '\0';
	    
	    int i = m, j = n;
	    while (i > 0 && j > 0) 
	    {
	      if (S1.charAt(i - 1) == S2.charAt(j - 1)) 
	      {
	        lcs[index - 1] = S1.charAt(i - 1);
	        i--;
	        j--;
	        index--;
	      }

	      else if (LCS[i - 1][j] > LCS[i][j - 1])
	        i--;
	      else
	        j--;
	    }

	    System.out.println("S1 : " + S1);
	    System.out.println("S2 : " + S2);
	    System.out.print("LCS: ");
	    for (int k = 0; k <= temp; k++)
	    System.out.print(lcs[k]);
	    System.out.println("");
	  }
	
	public static void main(String[] args) {
	    String S1 = "ABCBDAB";
	    String S2 = "BDCABA";
	    int m = S1.length();
	    int n = S2.length();
	    lcs(S1, S2, m, n);
	  }
}
