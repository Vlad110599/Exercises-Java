
public class Edge implements Comparable<Edge>{

	int s;
	int d;
	int w;
	
	public int compareTo(Edge comparEdge) {
		
		return this.w-comparEdge.w;
	}

}