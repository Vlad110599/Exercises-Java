
public class Main {

	public static void main (String[] args)
    {
     
        Prim t = new Prim();
        int graf[][] = new int[][] {{0, 3, 0, 7, 0},
                                    {1, 0, 4, 9, 3},
                                    {0, 2, 0, 0, 6},
                                    {5, 4, 0, 0, 2},
                                    {0, 3, 9, 1, 0},
                                   };

        t.prim(graf);
    }
	
}
