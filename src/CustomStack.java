public class CustomStack 
{
	CustomArrayList arraylist = new CustomArrayList();
	public CustomStack()
	{
		
	}
	
	public void push(int num)
	{
		arraylist.add(num);
	}
	
	public void pop()
	{
		arraylist.remove(arraylist.size() - 1);
	}
	
	public int peek()
	{
		return arraylist.get(arraylist.size() - 1);
	}
	
	public String toString()
	{
		String result = "";
		for(int i = arraylist.size() - 1; i >= 0; i--)
		{
			result = result + Integer.toString(this.arraylist.get(i)) + " ";
		}
		return result;
	}
}
