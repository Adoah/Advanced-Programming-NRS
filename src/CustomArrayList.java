import java.lang.reflect.Array;

public class CustomArrayList <T>
{
	private Object array[] = new Object[3];
	private int size = 0;
	
	public CustomArrayList()
	{
		
	}
	
	public void add(T num)
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
	public void addLast(T num)
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
	public void replace(int index, T num)
	{
		array[index] = num;
	}
	private void doubleSize()
	{
		//creates temporary array
		Object temp[] = new Object[array.length];
		//copies array over
		System.arraycopy(array, 0, temp, 0, array.length);
		//doubles original array size
		array = new Object[array.length * 2];
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
	public void addAt(int index, T num)
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
	public void addFirst(T num)
	{
		addAt(0, num);
	}
	public T get(int index)
	{	
			return (T) this.array[index];
	}
	public int size()
	{
		return this.size;
	}
	/*
	public String toString()
	{
		String result = "";
		for(int i = 0; i < size; i++)
		{
			result = result + Integer.toString(array[i]) + " ";
		}
		return result;
	}
	*/
}
