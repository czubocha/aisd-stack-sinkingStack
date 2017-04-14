package aisd_4;

import java.util.LinkedList;

public class Stos<E> {
    
    private LinkedList<E> stos = new LinkedList<E>();
    
    boolean empty(){
	return stos.isEmpty();
    }
    
    E peek(){
	return stos.peek();
    }
    
    E pop(){
	return stos.pop();
    }
    
    E push(E item){
	stos.addFirst(item);
	return item;
    }
    
    int search(Object o){
	return stos.indexOf(o);
    }
    
}
