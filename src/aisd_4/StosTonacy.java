package aisd_4;

public class StosTonacy<E> {

    private Object[] tab;

    StosTonacy(int rozmiar) {
	tab = new Object[rozmiar];
    }

    boolean empty() {
	return tab[0] == null;
    }

    Object peek() {
	return tab[0];
    }

    Object pop() {
	Object temp = tab[0];
	for (int i = 0; i < tab.length - 1; i++)
	    tab[i] = tab[i + 1];
	tab[tab.length - 1] = null;
	return temp;
    }

    Object push(E item) {
	for (int i = tab.length - 1; i > 0; i--)
	    tab[i] = tab[i - 1];
	tab[0] = item;
	return item;
    }

    int search(Object o) {
	int index = 0;
	for (Object x : tab) {
	    if (x == o)
		return index;
	    index++;
	}
	return -1;
    }

    void wyswietl() {
	StringBuffer temp = new StringBuffer();
	for (Object x : tab)
	    temp.append(x + ", ");
	System.out.println(temp.substring(0, temp.length() - 2));
    }

}
