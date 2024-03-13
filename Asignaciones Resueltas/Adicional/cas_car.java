
/*
 *sobrecarga de metodos nombre de metodos inguales pero parametros diferentes (cantidad y/o tipos diferentes)
 *sobreescrituras nombresde metodos iguales y parametros iguales(cantidad y/o tipo de dato)
 *sobreescritura de datos  -> datos iguales
 *super.datos -> para miembros dato
 *super.metodo(con o sin parametros)
 **/
class P{
	private int casas;
	public void asignar(int casas){
		this.casas=casas;}
		public int get_casas(){
			return(casas);
		}
}
class H extends P{
	private int carros;
	private int casas;
		public void asignar(int casas, int carros,int casas2){//metodo sobrecargado 
			asignar (casas);
			this.carros=carros;
			this.casas=casas2; 
		}
	public int get_carros(){
		return (carros);
	}
	public int get_casas(){
		return casas;
	}
	public int sum_casas(){
		return super.get_casas()+casas;
	}
}
//se sobrecarga cuando en la variable(void) se llama igual
public class cas_car {

    public static void main(String[] args) {
        H obj = new H();
        obj.asignar(2,4,6);
        System.out.println(	"Contenido del objeto obj"+
        					"\nCantidad de casas: "+obj.get_casas()+
        					"\nCantidad de carros:"+obj.get_carros()+
        					"\nCantidad de casas del hijo: "+obj.sum_casas());
    }
}
/*los constructores se ocultan por eso se utiliza "super."
 * 
*/