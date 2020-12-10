import java.util.*;
import java.lang.*;
import java.io.*;

public class Dijkstra {

	 private static final int V=5;
	
	 
	 int mindist(int dist[], Boolean Set[])
	    {
	        int min = Integer.MAX_VALUE;
	        int m=-1;
	 
	        for (int v = 0; v < V; v++)
	            if (Set[v] == false && dist[v] <= min)
	            {
	                min = dist[v];
	                m = v;
	            }
	 
	        return m;
	    }
	 
	 void print(int dist[], int n)
	    {
	        System.out.println("Varf    Distanta de la sursa");
	        for (int i = 0; i < V; i++)
	            System.out.println(i+"       "+dist[i]);
	    } 
	 
	 void dijkstra(int graf[][], int src)
	    {
	        int dist[] = new int[V]; 
	        Boolean Set[] = new Boolean[V];
	        for (int i = 0; i < V; i++)
	        {
	            dist[i] = Integer.MAX_VALUE;
	            Set[i] = false;
	        }

	        dist[src] = 0;

	        for (int count = 0; count < V-1; count++)
	        {

	            int u = mindist(dist, Set);
	            Set[u] = true;
	            for (int v = 0; v < V; v++)
	                 if (!Set[v] && graf[u][v]!=0 && dist[u] != Integer.MAX_VALUE &&  dist[u]+graf[u][v] < dist[v])
	                	 
	                	 dist[v] = dist[u] + graf[u][v];
	        }
	 
	        print(dist, V);
	    }

}
