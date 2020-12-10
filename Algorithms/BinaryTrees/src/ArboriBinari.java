import java.util.Stack;

public class ArboriBinari {

	public void preordine(Nod root) {
		if(root == null)
			return;
		
		Stack<Nod> s = new Stack<Nod>();
		s.push(root);
		
		while(!s.empty()) {
			
			Nod n = s.pop();
			System.out.printf("%d ",n.data);
			
			if(n.right != null){
				s.push(n.right);
			}
			if(n.left != null){
				s.push(n.left);
			}
		}
		
	}
	
	public void postordine(Nod root) {
		
		if( root == null ) return;
		 
		Stack<Nod> s = new Stack<Nod>( );
		Nod curent = root;
 
		while( true ) {
 
			if( curent != null ) {
				if( curent.right != null ) 
					s.push( curent.right );
				s.push( curent );
				curent = curent.left;
				continue;
			}
 
			if( s.isEmpty( ) ) 
				return;
			curent = s.pop( );
 
			if( curent.right != null && ! s.isEmpty( ) && curent.right == s.peek( ) ) {
				s.pop( );
				s.push( curent );
				curent = curent.right;
			} else {
				System.out.print( curent.data + " " );
				curent = null;
			}
		}
	}
	
	public void inordine(Nod root) {
		
		if(root == null)
			return;
 
		Stack<Nod> s = new Stack<Nod>();
		Nod nodcurent=root;
 
		while(!s.empty() || nodcurent!=null){
 
			if(nodcurent!=null)
			{
				s.push(nodcurent);
				nodcurent=nodcurent.left;
			}
			else
			{
				Nod n=s.pop();
				System.out.printf("%d ",n.data);
				nodcurent=n.right;
			}
		}
	}

}
