import java.util.*;
import java.lang.*;
import java.io.*;

public class Prim {

	private static final int V=5;
	
	int minKey(int key[], Boolean Set[])
    {
        int min = Integer.MAX_VALUE;
        int m=-1;
 
        for (int v = 0; v < V; v++)
            if (Set[v] == false && key[v] < min)
            {
                min = key[v];
               m = v;
            }
 
        return m;
    }
	
	void print(int p[], int n, int g[][])
    {
        System.out.println("Muchie   Cost");
        for (int i = 1; i < V; i++)
            System.out.println("["+p[i]+","+ i+"]"+"    "+
                               g[i][p[i]]);
    }
	
	void prim(int graf[][])
    {
 
        int p[] = new int[V];
 
        int key[] = new int [V];
 
        Boolean Set[] = new Boolean[V];
 
        for (int i = 0; i < V; i++)
        {
            key[i] = Integer.MAX_VALUE;
            Set[i] = false;
        }
 
        key[0] = 0; 
        p[0] = -1; 
 
        for (int count = 0; count < V-1; count++)
        {

            int u = minKey(key, Set);
 
            Set[u] = true;

            for (int v = 0; v < V; v++)

                if (graf[u][v]!=0 && Set[v] == false && graf[u][v] <  key[v])
                {
                    p[v]  = u;
                    key[v] = graf[u][v];
                }
        }
 
        print(p, V, graf);
    }
}
