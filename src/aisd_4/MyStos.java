package aisd_4;

public class MyStos<E> {

    Element head;

    class Element{
	private Element _next;
	private E _value;

	Element(E value) {
	    setValue(value);
	}

	Element(E value, Element next) {
	    setValue(value);
	    setNext(next);
	}

	@Override
	public String toString() {
	    return this.getValue().toString();
	}

	Element getNext() {
	    return _next;
	}

	void setNext(Element next) {
	    this._next = next;
	}

	E getValue() {
	    return _value;
	}

	void setValue(E value) {
	    this._value = value;
	}

    }

    boolean empty() {
	return head == null;
    }

    E push(E item) {
	if (head == null) {
	    head = new Element(item);
	    return item;
	}
	head = new Element(item, head);
	return item;
    }
    
    E peek(){
	return head.getValue();
    }
}
