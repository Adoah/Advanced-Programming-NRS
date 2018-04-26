
public class Main {

	public static void main(String[] args) {
		
		/*CustomArrayList arraylist = new CustomArrayList();
		
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
		
		/*
		CustomStack stack = new CustomStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		*/
		
		//printMatrix.printMatrix(7);
		
		Room[][] roomArr = new Room[5][5];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				Room room = new Room(i, j);
				roomArr[i][j] = room;
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.println(roomArr[i][j].getPosition());
			}
		}
		
	}

}
