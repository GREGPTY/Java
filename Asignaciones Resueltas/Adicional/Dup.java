class Duplicar{
	protected int n;
	//private int n;
	public void asignar(int n){
		this.n=n;}
		public int operacion(){
			return(n+n);
		}
		/*public int r_n(){
			return n;
		}*/
}
class Triplicar extends Duplicar{	
	public int operacion(){
		return super.operacion()+n;
		//return super.operacion()+r_n();
	}
}

public class Dup {
    public static void main(String[] args) {
       Duplicar obj2 =new  Duplicar();
       Triplicar obj =new Triplicar();
       obj.asignar(10);
       obj2.asignar(10);
       System.out.println("El dato triplicado es: "+obj.operacion()+
       					  "\nEl dato Duplicado es: "+obj2.operacion());
    }
}
