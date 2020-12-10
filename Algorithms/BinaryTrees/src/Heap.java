import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Heap<T> {

private ArrayList<T> element;
    
	public Heap() {
		element = new ArrayList<T>();
	}
	
	private void percolate() {
		int k = element.size() - 1;
		while (k > 0) {
			int p = (k-1)/2;
			T item = element.get(k);
			T parent = element.get(p);
			if (((Comparable) item).compareTo(parent) > 0) {
				element.set(k, parent);
				element.set(p, item);
				k = p;
			} else {
				break;
			}
		}
	}
	
	private void siftDown() {
		int k = 0;
		int j = 2*k+1;
		while (j < element.size()) {
			int max=j, r=j+1;
			if (r < element.size()) {
				if (((Comparable) element.get(r)).compareTo(element.get(j)) > 0) {
					max++;
				}
			}
			if (((Comparable) element.get(k)).compareTo(element.get(max)) < 0) {
					T temp = element.get(k);
					element.set(k, element.get(max));
					element.set(max, temp);
					k = max;
					j = 2*k+1;
			} else {
				break;
			}
		}
	}
	
	public void insert(T item) {
		element.add(item);
	}
	
	public T makeheap() 
			throws NoSuchElementException {
				if (element.size() == 0) {
					throw new NoSuchElementException();
				}
				if (element.size() == 1) {
					return element.remove(0);
				}
				T hold = element.get(0);
				element.set(0, element.remove(element.size()-1));
				siftDown();
				return hold;
			}
	
	public T slowmakeheap() 
			throws NoSuchElementException {
				if (element.size() == 0) {
					throw new NoSuchElementException();
				}
				if (element.size() == 1) {
					return element.remove(0);
				}
				T hold = element.get(0);
				element.set(0, element.remove(element.size()-1));
				percolate();
				return hold;
			}

    public boolean isEmpty() {
		return element.isEmpty();
		
	}
	
	public String toString() {
		return element.toString();
	}
	
}
