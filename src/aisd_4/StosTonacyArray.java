package aisd_4;

import java.util.ArrayList;

public class StosTonacyArray<E> {

    private ArrayList<E> list;
    int _size;

    StosTonacyArray(int size) {
	list = new ArrayList<E>(size);
	_size = size;
    }

    boolean empty() {
	return list.isEmpty();
    }

    Object peek() {
	return list.get(0);
    }

    Object pop() {
	return list.remove(0);
    }

    Object push(E item) {
	if (list.size() < _size)
	    list.add(0, item);
	else {
	    list.remove(_size - 1);
	    list.add(0, item);
	}
	return item;
    }

    int search(Object o) {
	return list.indexOf(o);
    }

    void show() {
	if (!list.isEmpty()) {
	    StringBuffer temp = new StringBuffer();
	    for (Object x : list)
		temp.append(list.indexOf(x) + " " + x + ", ");
	    System.out.println(temp.substring(0, temp.length() - 2));
	}
    }

}
