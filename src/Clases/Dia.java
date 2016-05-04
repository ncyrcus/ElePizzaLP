package Clases;

public class Dia {
	private double popularidad;
	private double clientes_potenciales;
	private int clientes_sentados;
	private int clientes_atendidos;
	private int clientes_que_reciben_plato;
	private int clientes_felices;
	private double sueldos;
	private double ingreso;
	private double costo;
	private double resultado; // esto es ganancia o perdida?
	
	public Dia(){ //constructor
		popularidad=0.0;
		clientes_potenciales= 0.0;
		clientes_sentados=0;
		clientes_atendidos=0;
		clientes_que_reciben_plato=0;
		clientes_felices=0;
		sueldos=0.0;
		ingreso=0.0;
		costo=0.0;
		resultado=0.0;
	}
	
	//se agregan getters y setters 
    public void setpopularidad(double p){
    	popularidad=p;
    }
    
    public double getpopularidad(){
    	return popularidad;
    }
    
    public void setclientes_potenciales(double cp){
    	clientes_potenciales=cp;
    }
    
    public double getclientes_potenciales(){
    	return clientes_potenciales;
    }
    
    public void setclientes_sentados(int cs){
    	clientes_sentados=cs;
    }
    
    public int getclientes_sentados(){
    	return clientes_sentados;
    }
    
    public void setclientes_atendidos(int ca){
    	clientes_atendidos=ca;
    }
    
    public int getclientes_atendidos(){
    	return clientes_atendidos;
    }
    
    public void setclientes_que_reciben_plato(int cr){
    	clientes_que_reciben_plato=cr;
    }
    
    public int getclientes_que_reciben_plato(){
    	return clientes_que_reciben_plato;
    }
    
    public void setclientes_felices(int cf){
    	clientes_felices=cf;
    }
    
    public int getclientes_felices(){
    	return clientes_felices;
    }
    
    public void setsueldos(double s){
    	sueldos=s;
    }
    
    public double getsueldos(){
    	return sueldos;
    }
    
    public void setingreso(double i){
    	ingreso=i;
    }
    
    public double getingreso(){
    	return ingreso;
    }
    
    public void setcosto(double c){
    	costo=c;
    }
    
    public double getcosto(){
    	return costo;
    }
    
    public void setresultado(double r){
    	resultado=r;
    }
    
    public double getcosto(){
    	return resultado;
    }
    
    
}
