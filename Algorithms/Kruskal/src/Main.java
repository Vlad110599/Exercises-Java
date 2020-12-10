public class Main {

	public static void main (String[] args)
    {
        int V = 4;
        int E = 5;
        Graf graf = new Graf(V, E);
 
        //edge 0-1
        graf.edge[0].s = 0;
        graf.edge[0].d = 1;
        graf.edge[0].w = 10;
 
        //edge 0-2
        graf.edge[1].s = 0;
        graf.edge[1].d = 2;
        graf.edge[1].w = 6;
 
        //edge 0-3
        graf.edge[2].s = 0;
        graf.edge[2].d = 3;
        graf.edge[2].w = 5;
 
        //edge 1-3
        graf.edge[3].s = 1;
        graf.edge[3].d = 3;
        graf.edge[3].w = 15;
 
        //edge 2-3
        graf.edge[4].s = 2;
        graf.edge[4].d = 3;
        graf.edge[4].w = 4;
 
        graf.Kruskal();
    }
	
}

