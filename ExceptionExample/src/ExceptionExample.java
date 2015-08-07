import java.io.*;

public class ExceptionExample {
	public static void main(String[] args) {
		
		try
		{
		FileInputStream fis = null;
		fis = new FileInputStream ("c:\\myfile.txt");
		
		int k;
		while ((k = fis.read()) != -1)
		{
			System.out.println((char)k);
		}
	} catch (FileNotFoundException e)
		{
			System.out.println("You fool!");
		}
		catch (IOException e)
		{
			System.out.println("You fool!");
		}
}
}