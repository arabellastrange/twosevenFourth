
/**
* this class is incomplete - include missing methods in
* assignment 1D task 3
*/
public class NodeDeque<E> implements DequeADT<E> {
  
  protected DLNode<E> header, trailer;  // sentinels
  protected int size;    // number of elements
  
  public NodeDeque() {  // initialize an empty deque
    header = new DLNode<E>(); // dummy node
    trailer = new DLNode<E>();  // dummy node
    // make header node point to trailer node
    header.setNext(trailer);  
    // make trailer node point to header node
    trailer.setPrev(header);  
    size = 0;
  }

  public boolean isEmpty() {    
    if (size == 0)
      return true;
    return false;
  }

  public int size() {   
    return size;
  }

  /** 
  * Returns the first element 
  * @throws EmptyDequeException
  */
  public E getFirst(){  
    if (isEmpty())
      throw new EmptyDequeException("Deque is empty.");
    return header.getNext().getElement();
  }

  /**
  * Inserts an element to be the first in the deque.
  */
  public void addFirst(E element) {  
    DLNode<E> second = header.getNext();
    DLNode<E> first = new DLNode<E>(element,header,second);
    second.setPrev(first);
    header.setNext(first);
    size++;
  }

  /** 
  * Removes the last element
  * @throws EmptyDequeException
  */
  public E removeLast(){
    if (isEmpty())
      throw new EmptyDequeException("Deque is empty.");
    DLNode<E> last = trailer.getPrev();
    E element = last.getElement();
    DLNode<E> secondtolast = last.getPrev();
    trailer.setPrev(secondtolast);
    secondtolast.setNext(trailer);
    size--; 
    return element;
  }

public void addLast(E element) {
    DLNode<E> secondtolast = trailer.getPrev();
    DLNode<E> last = new DLNode<E>(element,trailer,secondtolast);
    secondtolast.setNext(last);
    trailer.setPrev(last);
    size++;
	
}

public E getLast() {
    if (isEmpty()){
        throw new EmptyDequeException("Deque is empty.");
        }
    return trailer.getPrev().getElement();
}

public E removeFirst() {
	if (isEmpty()){
	      throw new EmptyDequeException("Deque is empty.");
	    }
    DLNode<E> first = header.getNext();
    E element = first.getElement();
    DLNode<E> second = first.getNext();
    header.setNext(second);
    second.setPrev(header);
    size--; 
    return element;
}
}
