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
		System.out.println("This is the second matrix: \n");
		matrix2 = generateMatrix(n);
		System.out.print(matrix2);
		
		String added = "";
		int maxlen = 0;
		if(matrix1.length() > matrix2.length())
		{
			maxlen = matrix1.length();
			strcpy(added, matrix1);
		}
		else
		{
			maxlen = matrix2.length();
			strcpy(added, matrix2);
		}
		
		for(int i = 0; i < maxlen; i++)
		{
			System.out.println(addMatrix());
		}
		
	}
	private static void strcpy(String added, String matrix12) {
		// TODO Auto-generated method stub
		
	}

	public static String addMatrix()
	{
		String m1value = "";
		String m1pos1 = "";
		for(int i = m1pos; i < matrix1.length(); i++)
		{
			if(matrix1.charAt(i) == ' ')
			{
				m1pos1 += matrix1.charAt(i + 1);
				if(matrix1.charAt(i + 2) == ' ')
				{
					
				}
				else
				{
					m1pos1 += matrix1.charAt(i + 2);
				}
				m1pos = i;
				break;
			}
		}
		
		String m2value = "";
		String m2pos1 = "";
		for(int i = m2pos; i < matrix2.length(); i++)
		{
			if(matrix2.charAt(i) == ' ')
			{
				m2pos1 += matrix2.charAt(i + 1);
				if(matrix2.charAt(i + 2) == ' ')
				{
					
				}
				else
				{
					m2pos1 += matrix2.charAt(i + 2);
				}
				m2pos = i;
				break;
			}
		}
		int added = Integer.parseInt(m1pos1) + Integer.parseInt(m2pos1);
		System.out.println(added);
		return Integer.toString(added);		
		
	}
}
