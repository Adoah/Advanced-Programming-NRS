public class CustomArrayList 
{
	private int array[] = new int[3];
	private int size = 0;
	
	public CustomArrayList()
	{
		
	}
	
	public void add(int num)
	{
		if(size > array.length - 1)
		{
			doubleSize();
			array[size] = num;
			size++;
		}
		else
		{
			array[size] = num;
			size++;
		}
	}
	public void addLast(int num)
	{
		if(size > array.length - 1)
		{
			doubleSize();
			array[size] = num;
			size++;
		}
		else
		{
			array[size] = num;
			size++;
		}
	}
	
	private void doubleSize()
	{
		//creates temporary array
		int temp[] = new int[array.length];
		//copies array over
		System.arraycopy(array, 0, temp, 0, array.length);
		//doubles original array size
		array = new int[array.length * 2];
		//copies temp to new doubled array
		System.arraycopy(temp, 0, array, 0, temp.length);
	}
	public void remove(int index)
	{
		//stagger everything back
		for(int i = index; i < size; i++)
		{
			array[i] = array[i+1];
		}
		//decrement size
		size--;
	}
	public void addAt(int index, int num)
	{
		if(size > array.length - 2)
		{
			doubleSize();
			for(int i = array.length; i > index; i--)
			{
				array[i+1] = array[i];
			}
			array[index] = num;
			size++;
		}
		else
		{
			for(int i = size; i > index; i--)
			{
				array[i+1] = array[i];
			}
			array[index] = num;
			size++;
		}
	}
	public void addFirst(int num)
	{
		addAt(num, 0);
	}
	public int get(int index)
	{
		if(index <= size)
		{	
			return this.array[index];
		}
		else
		{
			return -1;
		}
	}
	public int size()
	{
		return this.size;
	}
	public String toString()
	{
		String result = "";
		for(int i = 0; i < size; i++)
		{
			result = result + Integer.toString(array[i]) + " ";
		}
		return result;
	}
}
