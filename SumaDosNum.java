import java.io.*;
import java.lang.*;

public class SumaDosNum
{
	public static void main(String args[]) throws IOException
	{
	     
		 int x;
		 int y;
		 int z=0;
		 
		 BufferedReader entradadatos = new BufferedReader(new InputStreamReader(System.in)); // objeto para entrada de datos
		 
		 System.out.println("Insertar el primer número:");
			x = Integer.parseInt(entradadatos.readLine());
			 System.out.println("Insertar el primer número: ");
			y = Integer.parseInt(entradadatos.readLine());
			z=x+y;
			
			System.out.println("El resultado de la suma de " + x + "+" + y + "=" + z );
	}
	
}