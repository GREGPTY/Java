/*
*                          Author's:  
*                                     Ernesto Sánchez
*                                     Greg Torres
*									  Anthony Avila
*                                     Enrique Gonzalez
*                                     Bryan de Gracia
 */
import java.io.*;
import java.text.*;
import java.*;
class Persona  {  
  	private String nombre; 
	private char cod_sexo; 
   	private int a_nac;
    public void  asignar  (String n, int a, char s)  
   	{ nombre = n; a_nac = a; cod_sexo=s;}   	
   		   
   	public String  get_nom()
   	{ return nombre;}
        
        public char get_cod_sexo()
       {return cod_sexo;}
   	  
   	public int  get_a()
   	{ return a_nac;}
   	
   	public int calcular_año_nac(int año_ac)
   	{return  año_ac   -    a_nac;
   	}    
 }  	  
 class Estudiante extends Persona {  
    private int totcredito, puntos;     
    private  String carrera; 
         
    public void  asignar (String n, int a, int t, int p, String carr, char s)   
    { asignar (n,a,s);
      totcredito = t; 
      puntos = p; 
      carrera = carr;     }  
        
    public double calcular_indice ()  
    { double indice; 
      indice =  (double) puntos/totcredito;   
      return indice ;   } 
      
    public int get_totcre(){
    	return totcredito;  }
    
    public int get_puntos() {
    	return puntos; }
   	
    public String get_carrera(){
    	return carrera;
    	 }    
   } 
   	//------------------------------------------------------------------------------------------------------------------  
	class Empleado extends Persona{
	private int a_e_e,h_t,an_act;private float ta;
	//a_e_e= año en que entro a la empresa, an_act= año actual,
    public void  asignar (String n, int a, char s, int a_e_e,int h_t,float ta,int an_act)   
    { asignar (n,a,s);
    this.a_e_e=a_e_e;
    this.h_t=h_t;
    this.ta=ta;
    this.an_act=an_act;
    	}
    public int an_ser_lab(){//año de servicio laborando
    	int an_lr;
    	an_lr=an_act-a_e_e;
    	return an_lr;
    }
    public String get_nom(){
    	return super.get_nom();
    }
    public float salario(){
    	return (h_t*ta);
    } 
   	public float porc(){
   		float r;
   		if(an_ser_lab()>20)
   			r=((float)(salario()*0.20));
   		else
   			r=(float)35.00;
   		return r;
   	}
   	public boolean juv(){
   		boolean h;
   		if(super.get_cod_sexo()=='M'){
   			if(super.calcular_año_nac(an_act)>60)
   				h=true;
   			else
   				h=false;	
   		}	
   		else{
   			if(super.calcular_año_nac(an_act)>55)
   				h=true;
   			else
   				h=false;
   		}
   		return h; 	
	}
	public String juv_s(){
		String D=" ";
		if (juv()==true) D="Sí";
		else D="No";
		return D;
	}
	public float sal_final(){
		float s_f;
		if(juv()==true)
			s_f=(salario()+porc()+50.00f);
		else
			s_f=(salario()+porc());
		
		return s_f;
	}
}
public class act_her_1_3 {

    public static void main(String[] args) {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int an=0,an_nac=0,tot_cred=0,puntos=0,a_e_e=0,h_t=0,an_act=0;
    float ta=0;
    String nam=" ",carr=" ";
    char sex=' ',cont=' ';
    boolean error=true,errorf=true;
    //Estudiante est= new Estudiante();
    Empleado emp= new Empleado();
    do{
    	
    do{
    	try{
    	System.out.println("Introduzca El Nombre del Empleado ");
    	nam=br.readLine();error=false;	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);
    do{do{
    	try{
    	System.out.println("Sexo: Masculino ' M ', Femenino ' F ' \t Recuerde que el es sensible a mayusculas");
    	sex=(char)br.read();
    	br.skip(1);error=false;	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);}while(sex!='F'&&sex!='M');
    do{
    	try{
    	System.out.println("Introduzca Año de nacimineto(Solo el año)");
    	an_nac=Integer.parseInt(br.readLine());error=false;	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);
    //datos a recivir empleado int a_e_e,int h_t,int ta,int an_act
    do{
    	try{
    	System.out.println("Año en que ingreso a la empresa(Solo el año)");
    	a_e_e=Integer.parseInt(br.readLine());
    	if(!(a_e_e<an_nac))error=false;
    	else{System.out.println("Error, usted no pudo ingresar antes de haber nacido"); error=true;}	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);
    do{
    	try{
    	System.out.println("Horas Trabajadas");
    	h_t=Integer.parseInt(br.readLine());error=false;	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);
    do{
    	try{
    	System.out.println("Tarifa por hora");
    	ta=Float.parseFloat(br.readLine());error=false;	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);
    do{
    	try{
    	System.out.println("Año Actual");
    	an_act=Integer.parseInt(br.readLine());error=false;	
    	}catch(Exception e){System.out.println("Error..."+e);error=true;}
    }while(error);
    emp.asignar(nam,an_nac,sex,a_e_e,h_t,ta,an_act);// mi void asignar datos orden= String n, int a, char s, int a_e_e,int h_t,int ta,int an_act
    //envie los datos a la class
    
    System.out.println(	"Hi Mr(s). "+emp.get_nom()+"\nSu salario: $"+emp.salario()+
    					"\nAños Laborando en la empresa: "+emp.an_ser_lab()+"\nBono Navideño: $"+emp.porc()+
    					"\nUsted "+emp.juv_s()+" es juvilado.");
    					if(emp.juv()==true)	System.out.println("Bono especial de: $50.00");
    System.out.println(	"Salario Final(con todo ya sumado): $"+emp.sal_final());
    do{do{errorf=false;
    	try{
    	System.out.println("Continuar? Si='S', No='N'\t Recuerde que el es sensible a mayusculas");
    	cont=(char)br.read();
    	br.skip(1);errorf=false;	
    	}catch(Exception e){System.out.println("Error..."+e);errorf=true;}
    }while(cont!='S'&&cont!='N');}while(errorf);}while(cont=='S');//si ella no quiere salir del programa
    
    }
}
