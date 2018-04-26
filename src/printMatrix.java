import java.util.Random;

public class printMatrix 
{
	static int m1pos = 0;
	static int m2pos = 0;
	static String matrix1 = "";
	static String matrix2 = "";
	public static String generateMatrix(int n)
	{
		String complete = "";
		Random ran = new Random();
		for(int i = 0; i < n; i++)
		{
			String line = "";
			for(int j = 0; j < n; j++)
			{			
				line += " " + Integer.toString(ran.nextInt(10));
			}
			complete += line + "\n";
		}
		return complete;
	}
	
	public static void printMatrix(int n)
	{
		System.out.println("This is the first matrix: \n");
		matrix1 = generateMatrix(n);
		System.out.print(matrix1);
		System.out.println("\nThis is the second matrix: \n");
		matrix2 = generateMatrix(n);
		System.out.print(matrix2);
		
		String added = "";
		int maxlen = 0;
		//identifying which matrix is longer
		if(matrix1.length() > matrix2.length())
		{
			maxlen = matrix1.length();
		}
		else
		{
			maxlen = matrix2.length();
		}
		//figure out if this is necessary???
		//or if I can put all this into a while loop
		for(int i = 0; i < maxlen; i++)
		{
			if(Character.isDigit(matrix1.charAt(i)))
			{
				
			}
			System.out.println(addMatrix());
		}
		
	}

	//something in this method isn't allowing it to increment the m1/2position. I iz confuzed
	public static String addMatrix()
	{
		String m1value = "";
		for(int i = m1pos; i < matrix1.length(); i++)
		{
			if(Character.isDigit(matrix1.charAt(i)))
			{
				m1value += matrix1.charAt(i);
				if(Character.isDigit(matrix1.charAt(i + 1)))
				{
					m1value += matrix1.charAt(i + 1);
				}
				System.out.println("Position M1: " + i);
				System.out.println("Value M1: " + m1value);
				m1pos = i;
				break;
			}
		}
		//m1pos++;
		
		String m2value = "";
		for(int n = m2pos; n < matrix2.length(); n++)
		{
			if(Character.isDigit(matrix2.charAt(n)))
			{
				m2value += matrix2.charAt(n);
				if(Character.isDigit(matrix2.charAt(n + 1)))
				{
					m2value += matrix2.charAt(n + 1);
				}
				System.out.println("Position M2: " + n);
				System.out.println("Value M2: " + m2value);
				m2pos = n;
				break;
			}
		}
		//m2pos++;
		int added = Integer.parseInt(m1value) + Integer.parseInt(m2value);
		System.out.println(added);
		return Integer.toString(added);		
	}
}
