/*
 *Torres Greg
 *Sanchez Ernesto
 *Avila Anthony
 *De Gracia Bryan
 *Gonzalez Enrique
 **/
import java.io.*;
 class Poligono{
 	private float ancho,altura;
 			void set_atributos(float a, float b){
 				ancho=a;altura=b;}
 			float re_ancho(){
 				return ancho;
 			}
 			float re_altura(){
 				return altura;
 			}			
 }
 class Rectangulo extends Poligono{
 	float arear(){
 		return(re_ancho()*re_altura());
 	}
 }
 class Triangle extends Poligono{
 	float areat(){
 		return((re_ancho()*re_altura())/2);
 	}
 }

public class Asignacion_1_1{
    public static void main(String[] args) {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int a=0;
    	float an=0,al=0;
    	boolean error;
    	Triangle tria=new Triangle();
        Rectangulo recta= new Rectangulo();
        	do{
        try{System.out.println("Ancho: ");
        an=Float.parseFloat(br.readLine());error=false;
        }catch(Exception e){System.out.println("Error..."+e);error=true;}}while(error==true);
        do{
        try{System.out.println("Alto: ");
        al=Float.parseFloat(br.readLine());error=false;
        }catch(Exception e){System.out.println("Error..."+e);error=true;}}while(error==true);
            
            do{
        	do{
        try{System.out.println("1. Triangulo \t2. Rectangulo \t3. Salir");
        a=Integer.parseInt(br.readLine());error=false;
        }catch(Exception e){System.out.println("Error..."+e);error=true;}}while(error==true);
        switch(a){
        	case 1:	tria.set_atributos(an,al);
        	System.out.println("El area del triangulo es: "+tria.areat());	break;
        	case 2:	recta.set_atributos(an,al);
        	System.out.println("El area del rectangulo es: "+recta.arear());	break;
        	case 3: 	break;
        	default: System.out.println("Opción no valida"); break;
        }}while((a<3)&&(a>0));
        
    }
}
