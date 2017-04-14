package aisd_4;

public class Main {

    public static void main(String[] args) {
	
//	Stos<String> stos = new Stos<String>();
//	System.out.println(stos.empty());
//	System.out.println(stos.peek());
//	stos.push("Bry쿮k");
//	System.out.println(stos.peek());
//	System.out.println(stos.search("Bry쿮k"));
//	
//	System.out.println();
//	
//	StosTonacy<String> stosTonacy = new StosTonacy<String>(10);
//	System.out.println(stosTonacy.push("Bry쿮k"));
//	System.out.println(stosTonacy.push("Ludek"));
//	stosTonacy.wyswietl();
//	System.out.println(stosTonacy.push("Pawlainho"));
//	stosTonacy.wyswietl();
//	System.out.println(stosTonacy.pop());
//	stosTonacy.wyswietl();
//	System.out.println(stosTonacy.search("Bry쿮k"));
//	System.out.println(stosTonacy.search("Ludek"));
//	
//	System.out.println();
	
	StosTonacyArray<String> stosTonacyArray = new StosTonacyArray<String>(2);
	System.out.println(stosTonacyArray.push("Bry쿮k"));
	System.out.println(stosTonacyArray.push("Ludek"));
	stosTonacyArray.show();
	System.out.println(stosTonacyArray.push("Pawlainho"));
	stosTonacyArray.show();
	System.out.println(stosTonacyArray.pop());
	stosTonacyArray.show();
	System.out.println(stosTonacyArray.search("Bry쿮k"));
	System.out.println(stosTonacyArray.search("Ludek"));
	System.out.println(stosTonacyArray.search("Pawlainho"));
	
//	StosTab<String> stosTab = new StosTab<String>(10);
//	System.out.println(stosTab.empty());
//	stosTab.push("Bry쿮k");
//	stosTab.push("Ludek");
//	stosTab.push("Kate");
//	System.out.println(stosTab.search("Ludek")); 
//	System.out.println(stosTab.peek());
//	System.out.println(stosTab.pop());
    }

}
