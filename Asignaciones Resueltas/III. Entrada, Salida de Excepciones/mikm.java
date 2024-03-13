import java.io.*;
class DIS{
	private double mi;
	
	void conv(double mi2){
		mi=mi2;
		
	}
	double conver(){
		double g2;
		g2=mi*1.609f;
		return g2;
	}
}

public class mikm {
        
    public static void main(String[] args) {
       BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		String srt; 
		double dis,s;
		DIS obj =new DIS();
      	
      	try{
		System.out.println("Introduce the miles=\n ");
		srt=br.readLine();
		s=Double.parseDouble(srt);
		obj.conv(s);
		dis=obj.conver();
      System.out.println("The full distance is= "+dis+"km");
	}
     catch(IOException j){
     	System.out.println("It's not the corresponding data");
     }
     catch(NumberFormatException j){
     	System.out.println("Error of Conversion");
     }
    }
}
