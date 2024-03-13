
import java.io.*;

class Asignacion531p{
	private float m[][];
	private int cfc;
	
	Asignacion531p(int cfc){
		this.cfc=cfc;
		m=new float [cfc][cfc];
	}
	void asignar(int f,int c, float d){
		m[f][c]=d;
	}
	String determinar_simetria(){
		int i,j; boolean n=true;
		for(i=0;i<cfc;i+=1)
			for(j=0;j<cfc;j+=1)
				if(m[i][j]!=m[j][i]){
					n=false;i=cfc+1;j=cfc+1;}
					
		if(n)
			return "Es Simetrico";
		else
			return "No es Simetrico";
			
	}
}


public class Asignacion531 {

    public static void main(String[] args) {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int i,j,cfc=0; float d; boolean error;
       do{
       	error=false;
       	try{
       		System.out.println("Introduzca la cantidad de fila y columnas de la matriz");
       		cfc=Integer.parseInt(br.readLine());
       	}catch(Exception e){ System.out.println("Error de entrada o conversion "+e);error=true;
       	}
       }while(error||cfc<0);
       Asignacion531p obj=new Asignacion531p(cfc);
       for(i=0;i<cfc;i+=1)
       	for(j=0;j<cfc;j+=1)
       		try{
       			System.out.println("Introduzca un numero flotante, Posición: "+i+", "+j);d=Float.parseFloat(br.readLine());obj.asignar(i,j,d);}
       	catch(Exception e){System.out.println("Error... en la entrada o conversión"+e);j-=1;};		
       	System.out.println("\n\n La matriz: "+obj.determinar_simetria()); 
    }
}
