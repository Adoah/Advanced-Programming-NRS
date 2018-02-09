
public class Main {

	public static void main(String[] args) {
		CustomArrayList arraylist = new CustomArrayList();
		arraylist.add(3);
		arraylist.add(15);
		arraylist.add(8972134);
		arraylist.add(123);
		arraylist.add(974);
		arraylist.add(3);
		arraylist.add(15);
		arraylist.add(8972134);
		arraylist.add(123);
		arraylist.add(974);
		arraylist.remove(3);
		arraylist.remove(2);
		arraylist.add(2345523);
		arraylist.remove(0);
		arraylist.addAt(3, 28);
		System.out.println(arraylist.toString());
	}

}
