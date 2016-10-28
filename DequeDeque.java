import java.util.ArrayDeque;
import java.util.Deque;

//ADD EXCEPTION HANDLING 
public class DequeDeque<E> implements DequeADT<E>{
	protected Deque<E> D;
	
	public DequeDeque(){
		D = new ArrayDeque<E>();
	}

	public int size() {
		return D.size();
	}

	public boolean isEmpty() {
		return D.isEmpty();
	}

	public void addFirst(E element) {
		D.addFirst(element);
		
	}

	public void addLast(E element) {
		D.addLast(element);
		
	}

	public E getFirst() {
		return D.getFirst();
	}

	public E getLast() {
		return D.getLast();
	}

	public E removeFirst() {
		return D.removeFirst();
	}

	public E removeLast() {
		return D.removeLast();
	}

}
