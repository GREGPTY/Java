//Hecho por Greg Torres 8-956-675 & Genesis Rodríguez 8-954-1871
import java.io.*;

class LUZ
{
	private int se;
	void asignar(int se2)
	{
		se= se2;
	}
	int conver()
		{	int dis2;
			dis2=se*300000;
			return dis2;
		}
}

class LUZV {

public static void main(String[] args)
{
	 BufferedReader br= new
    BufferedReader (new InputStreamReader (System.in));
		String srt; 
		int dis,s;
		float d;
		LUZ obj =new LUZ();
		//dato: luz vel = 300,000kms/s
	try{
		System.out.println("Introduzca el tiempo en segundos=\n ");
		srt=br.readLine();
		s=Integer.parseInt(srt);
		obj.asignar(s);
		dis=obj.conver();
      System.out.println("La distancia recorrida fueron= "+dis+"km");
	}
     catch(Exception e){
     	System.out.println("No es el dato correspondiente");
     }
}
}