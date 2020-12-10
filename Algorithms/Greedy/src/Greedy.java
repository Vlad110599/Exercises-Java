import java.util.ArrayList;

public class Greedy {

	public void interopt(ArrayList<Integer> Q){
		
        ArrayList<Integer> H=new ArrayList<Integer>();
        ArrayList<Integer> lu=new ArrayList<Integer>(2*Q.size()-1);
        ArrayList<Integer> st=new ArrayList<Integer>();
        ArrayList<Integer> dr=new ArrayList<Integer>();
		for(int i =0 ; i<Q.size(); i++)
		{
		  H.add(Q.get(i));
		  lu.add(Q.get(i));
		  st.add(0);
		  dr.add(0);
		}
		VarfPondere s;
        s = VarfPondere.getMax(H);
	        for(int i=Q.size();i<2*Q.size()-1;i++){	       
		        VarfPondere r;
		        r = VarfPondere.getMax(H);
	            lu.add(s.v+ r.v);
	            st.add(s.v);
	            dr.add(r.v);
	            s.v=s.v+r.v;
	        }

	        for(int i=Q.size();i<2*Q.size()-1;i++)
	            System.out.println(st.get(i)+" "+lu.get(i)+" "+dr.get(i));
	}

}
