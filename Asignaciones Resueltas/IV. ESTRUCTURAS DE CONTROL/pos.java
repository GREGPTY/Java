/**
 * Greg Torres 8-956-675
 */

import java.io.*;
class post {
	private float n;
	void pnn(float n2){
		n=n2;
	}
	String posnene(){
		String re;
		if(n>0){
			return re="Positivo";
		}
		else if(n<0){
			return re="Negativo";
		}
		else{
			return re="Neutral";
		}
	}
}
class pos{

    public static void main(String[] args) {
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        String srt,na; 
		float ne,a;
		post obj =new post();
		for(a=1;a<=7;a+=1){
		
		try{
			System.out.println("Introduce un numero");
			srt=br.readLine();
			ne=Float.parseFloat(srt);
			obj.pnn(ne);
			na=obj.posnene();
			System.out.println("El valor es "+na+"");
			
     }
     catch(IOException j){
     	System.out.println("It's not the corresponding data");
     	a-=1;
     }
     catch(NumberFormatException j){
     	System.out.println("Error of Conversion");
     	a-=1;
		} 
		}
    }
}
