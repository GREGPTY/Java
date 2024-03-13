/*
 *ACTIVIDAD 5.2.5
 *
 *Greg Torres 		8-956-675
 *Anthony Avila		20-70-4203
 *Enrique Gonzalez	8-959-1507
 *Bryan De Gracia	8-954-226
 *
*/
import java.io.*;
class HoliN{
	private float A[]= new float[50];
	private float b;
	private int a;
	private static int CV= 49;
	
	void asign(int a1, float b1){
		a=a1;b=b1;	
		A[a]=b;
	}
	float canti(){
		float e=0,f=0,g=0,h=0,i=0,j=0;
		for(int d=1;d<=CV;d+=1){
			g=A[d+1]-A[d];
			i=A[d]-A[d+1];
			if(g>i){
				j=g;
			}
			else{
				j=i;
			}
			if(j>h){
				h=j;
			}}
		return h;
		} 
	/*
	float mostrar_ele1(){
		
	}*/
	/*
	float mostrar_ele2(){
		
	}*/
	
}

class Tarea25 {
	private static int CV2= 50;
    public static void main(String[] args) {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         HoliN o = new HoliN();
     int i; 	 
     float d;
     for(i=1;i<=CV2;i+=1){

     	try{
     		System.out.println("\nEntre el elemento de la posición: "+i+": ");
     		d=Float.parseFloat(br.readLine());
     		o.asign(i,d);
     	}
     	catch(IOException e){
     	System.out.println("Error... entrada de datos\n" +e);i-=1;
     	}
     	catch(NumberFormatException e){
     	System.out.println("Error... no se pudo convertir el dato ingresado en tipo flotante\n" +e);i-=1;
     	}
     	}
     	 System.out.println("Elementos del vector a sumar\n");
     /*for(i=1;i<50;i+=1){
     	System.out.println(" "+"v["+i+"]="+o.(i));
     }*/
  	 System.out.println("\nLa diferencia más grande entre 2 elementos consecutivos es: "+ o.canti());
     }
    }
