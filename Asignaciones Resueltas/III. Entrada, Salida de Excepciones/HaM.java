
import java.io.*;

class HaM {

public static void main(String[] args)throws IOException, NumberFormatException  {
	 BufferedReader obj= new
    BufferedReader (new InputStreamReader (System.in));

		int m,h;

		float d;

       System.out.println("Introduzca las horas a evaluar = ");
       h=Integer.parseInt(obj.readLine()); //puede lanzar una IOException

		m=h*60;

      System.out.println("Los minutos son = " + m);
}
}