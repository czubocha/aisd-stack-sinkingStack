package aisd_4;

public class StosTab<E> {

    private Object[] tab;
    private int top;

    StosTab(int rozmiar) {
	tab = new Object[rozmiar];
	top = -1;
    }

    boolean empty() {
	return top == -1;
    }

    Object peek() {
	return tab[top];
    }

    Object pop() {
	return tab[top--];
    }

    Object push(E item) {
	tab[++top] = item;
	return item;
    }

    int search(Object o) {
	for (int i = 0; i <= top; i++)
	    if (tab[i] == o)
		return top - i;
	return -1;
    }

}
