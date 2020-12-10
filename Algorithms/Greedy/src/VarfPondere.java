import java.util.ArrayList;

public class VarfPondere {
    
    int p;
    int v;
    
    VarfPondere(int poz, int val){
        this.p=poz;
        this.v=val;
    }
    
    public static VarfPondere getMax(ArrayList<Integer> A){
    	
        int max=-1;
        int poz=0;
   
        for(int i = 0; i < A.size(); i++){
            if(A.get(i)>max){
                max=A.get(i);
                poz=i;
            }
        }
        
        if(A.size()>1) {
        	A.remove(poz);
        }

        return new VarfPondere(poz,max);
    }
}
