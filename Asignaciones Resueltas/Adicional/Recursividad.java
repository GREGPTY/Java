import java.io.*;

class v1{
	//int a[]={9,8,7,6,5};int j=3;
	static  void imprimir(int[]a,int j){
     	if (j > -1)
     	{imprimir(a,j-1);
     	}
     	System.out.println(a[j+1]);}
}
class v2{
	//int b[]={9,8,7,6,5}; int j=4;	
	static  void imprimir(int[]b,int j){
     	if (j > -1)
     	{imprimir(b,j-1);
     	System.out.println(b[j]);}
     	}
	}
class v3{
	//int c[]={9,8,7,6,5};int j=4; 	
	static  void imprimir(int[]c,int j){
     	if (j > -1)
     	{System.out.println(c[j]);
     	imprimir(c,j-1);}
     	}
}

public class Recursividad {
    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int op=0,i=0;boolean error=true;
    //int a[]=new int[5];
    v1 obj= new v1();
    v2 obj2=new v2();
    v3 obj3=new v3();
    do{System.out.println("Elija 1 de los 3 disponibles:\t 1.Option: 1\t2. Option: 2\t3. Option: 3\t4.Exit");
    do{
    	try{
    op=Integer.parseInt(br.readLine());error=false;}catch(Exception e){System.out.println(e);error=true;}}while(error==true);
    switch(op){
              case 1:System.out.println("Option 1, Reply: ");
              	int a[]={9,8,7,6,5};int ii=3;
                  obj.imprimir(a,ii);
                  break;
              case 2:System.out.println("Option 2, Reply: ");
              	int b[]={9,8,7,6,5}; int iii=4;
                  obj2.imprimir(b,iii);
                  break;
              case 3:System.out.println("Option 3, Reply: ");
              	int c[]={9,8,7,6,5};int ie=4;
                  obj3.imprimir(c,ie);
                  break;
              case 4:System.out.println("Exit");	break;
              default:
                  System.out.println("Error\nOpcion invalida");
          }
         }while(op!=4);
    }
}
