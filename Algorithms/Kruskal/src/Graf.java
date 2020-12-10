import java.util.Arrays;

public class Graf {

	int V;
	int E;
	Edge edge[];
	
	Graf(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i=0; i<e; ++i)
            edge[i] = new Edge();
    }
	
	int find(Subset subsets[], int i)
    {

        if (subsets[i].p != i)
            subsets[i].p = find(subsets, subsets[i].p);
 
        return subsets[i].p;
    }
	
	void Union(Subset subsets[], int x, int y)
    {
        int xr = find(subsets, x);
        int yr = find(subsets, y);
        
        if (subsets[xr].r < subsets[yr].r)
            subsets[xr].p = yr;
        else if (subsets[xr].r > subsets[yr].r)
            subsets[yr].p = xr;

        else
        {
            subsets[yr].p = xr;
            subsets[xr].r++;
        }
    }
	
	void Kruskal()
    {
        Edge result[] = new Edge[V]; 
        int e = 0; 
        int i = 0; 
        for (i=0; i<V; ++i)
            result[i] = new Edge();

        Arrays.sort(edge);
 
        Subset subsets[] = new Subset[V];
        for(i=0; i<V; ++i)
            subsets[i]=new Subset();
 

        for (int v = 0; v < V; ++v)
        {
            subsets[v].p = v;
            subsets[v].r = 0;
        }
 
        i = 0;

        while (e < V - 1)
        {
            Edge next_edge = new Edge();
            next_edge = edge[i++];
 
            int x = find(subsets, next_edge.s);
            int y = find(subsets, next_edge.d);

            if (x != y)
            {
                result[e++] = next_edge;
                Union(subsets, x, y);
            }
        }

        for (i = 0; i < e; ++i)
            System.out.println(result[i].s+" -- "+result[i].d+" == "+
                               result[i].w);
    }
}