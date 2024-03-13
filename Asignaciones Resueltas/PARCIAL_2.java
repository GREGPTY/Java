import java.io.*;

class MA{
	private float e1,e2,e3;
	
	void dar(float b1, float b2, float b3){
		e1=b1;
		e2=b2;
		e3=b3;
	}
	float resp(){
		float r=0;
		if(e1>e2){
			if(e1>e3){
				r=e1;
				}
			else{
				r=e3;
				}
		}
		else if(e2>e3)
				r=e2;
		else if(e3>e1){
			if(e3>e2){
				r=e3;
			}
			else
				r=e2;
		}
		
		
		return r;
	}
}

class PARCIAL_2{

    public static void main(String[] args) {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       
       float b1=0,b2=0,b3=0,re=0;
        boolean error;
        char opt=' ';
        MA obj = new MA();
do{
try{
 //------------------------------------------------------------------------------------------------------------------------       
        //Boy1
        do{
        try{
        System.out.println("Introduce the boy 1 stature: ");
        b1=Float.parseFloat(br.readLine());
        error=false;	
        }
        catch(IOException e){System.out.println("Read Error: "+e);error=true;}
        catch(NumberFormatException e){System.out.println("Conversion Error: "+e);error=true;} 
    }while(error==true);
//--------------------------------------------------------------------------------------------------------------------------    
    //Boy2
        do{
        try{
        System.out.println("Introduce the boy 2 stature: ");
        b2=Float.parseFloat(br.readLine());
        error=false;	
        }
        catch(IOException e){System.out.println("Read Error: "+e);error=true;}
        catch(NumberFormatException e){System.out.println("Conversion Error: "+e);error=true;} 
    }while(error==true); 
//--------------------------------------------------------------------------------------------------------------------------    
    //Boy3
        do{
        try{
        System.out.println("Introduce the boy 3 stature: ");
        b3=Float.parseFloat(br.readLine());
        error=false;	
        }
        catch(IOException e){System.out.println("Read Error: "+e);error=true;}
        catch(NumberFormatException e){System.out.println("Conversion Error: "+e);error=true;} 
    }while(error==true);
//------------------Process of Send and Get--------------------------------------------------------------    
    obj.dar(b1,b2,b3);
//	re=obj.resp();
    System.out.println("The Stature Most Bigger is: "+obj.resp()+"\n\nYou Will Continue? Yes: s or Not: n: ");
    opt=(char)br.read();
    br.skip(1);
    if(opt!='s'&&opt!='n'){
    System.out.println("Option not Available\t Choise Yes: s or Not: n: ");
    opt=(char)br.read();
    br.skip(1);}

 }catch(Exception e){System.out.println("Error..."+e);} 
  }while(opt=='s');

  	}
}
