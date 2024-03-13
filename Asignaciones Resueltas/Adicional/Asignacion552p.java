import java.io.*;
class Asignacion522 {

   private float v[]=new float[10];
   void asignar(int p, float dato){
   	v[p]=dato;
   }
   float mostrar_elemento(int p){
   	return v[p];
   }
   float calcular_suma(){
   	float s= 0;
   	int i;

   	for(i=0; i<10;i++)
   		s=s+v[i];
   		return s;
   	}

}
 class Asignacion522p{
 	 public static void main(String[] args) {
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

     Asignacion522 o = new Asignacion522();
     int i;
     float d;
     for(i=0;i<10;i++){

     	try{
     		System.out.println("Entre un elemento");
     		d=Float.parseFloat(br.readLine());
     		o.asignar(i,d);
     	}
     	catch(IOException e){
     	System.out.println("Error... entrada de datos\n" +e);
     	}
     	catch(NumberFormatException e){
     	System.out.println("Error... no se pudo convertir el dato ingresado en tipo flotante\n" +e);
     	}
     }
     System.out.println("Elementos del vector a sumar\n");
     for(i=0;i<10;i++){
     	System.out.println(" "+"v["+i+"]="+o.mostrar_elemento(i));
     }
  	 System.out.println("Suma de los elementos"+ o.calcular_suma());
     }

 }
