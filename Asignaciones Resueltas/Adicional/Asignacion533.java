/**
 * @(#)Asignacion533.java
 *
 *
 * @author 
 * @version 1.00 2019/6/20
 */
import java.io.*;
class Asignacion533C{
	static int f = 5;static int c= 10;
	private int PR [][]= new int[f][c];
	private int v;
	void asig(int v,int f1,int c1)
	{PR[f1][c1]=v;}
	int V_M(){
		int max=PR[0][0];
		for(int a=0;a<f;a+=1)
			for(int e=0;e<c;e+=1)
				if(PR[a][e]>max)
					max=PR[a][e];
		return max;
	}
	int pos(int a, int e){
		return PR[a][e];
	}
	
}

public class Asignacion533 {
	static int f = 2;static int c= 5;

public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          int [][] BX = new int[f][c];
          int a=0,aa=0,dato;
        boolean error=true;
        Asignacion533C ob = new Asignacion533C();
        do{	
        	for(a=0;a<f;a+=1){
        		for(aa=0;aa<c;aa+=1){
        try{
        System.out.println("\n Ingrese el Dato de posicion "+a+", "+aa+".: ");
        dato=Integer.parseInt(br.readLine());error=false;
        ob.asig(dato,a,aa);}
        catch(IOException e){System.out.println("Read Error..."+e);error=true;aa-=1;}
        catch(NumberFormatException e){System.out.println("Conversion Error..."+e);error=true;aa-=1;}
		}}}while(error==true);
        

        
        System.out.println("\n La posición fue: "+ob.pos(a,aa)+
        	"\nValor máxima: "+ob.V_M());	
        		
        
    }
}
