import java.io.*;
class Numeros
{  private int    ne;
   private float  nf;
   void asignar(int ne2, float nf2)
   { ne =ne2;
     nf =nf2;
   }

   float sumar ()
   { float su;
     su=ne+nf;
     return su;
   }
   }

// Programa principal
class Ejemplob1
{ public static void main( String []args)throws IOException,  NumberFormatException
  { //si ocurre una IOException o NumberFormatException aparece el mensaje de error en ingl?s y de una forma muy t?cnica
    
  	
  	// crea un buffer, permitiendo leer desde el teclado cadenas
    BufferedReader br= new
    BufferedReader (new InputStreamReader (System.in));
    char r;
    String str;
    int  num1;
    float num2,s;
    Numeros obj = new Numeros();
    do{
    // Para leer cadenas de caracteres desde el teclado
    System.out.println("Introduzca un valor entero");
    str = br.readLine(); //puede lanzar una IOException

    // convierte de cadena a numero entero
    num1 = Integer.parseInt (str); //puede lanzar una NumberFormatException

    // Para leer cadenas de caracteres desde el teclado
    System.out.println("Introduzca un valor con decimales");
    str = br.readLine();  //puede lanzar una IOException

    // convierte de cadena a numero flotante
    num2 = Float.parseFloat (str); //puede lanzar una NumberFormatException

    obj.asignar(num1,num2);
    s=obj.sumar();
    System.out.println("La respuesta de la suma es:" + s);
    System.out.println("\n\nEntre s para continuar y cualquier otro caracter para terminar");
    r= (char) br.read();   //lectura de un caracter
    br.skip(1); 
    }while (r == 's');
    
    System.out.print("Termine");	
  }
}