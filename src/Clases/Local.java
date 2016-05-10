
import java.util.ArrayList;

public class Local {

  private double popularidad;
  private double dineroActual;

  private ArrayList<Dia> listaDias;
  private ArrayList<Empleado> listaEmpleados;
  private ArrayList<Mesa> listaMesas;
  private ArrayList<Decoracion> listaDecoraciones;

  public Local()
  {
    dineroActual=100000;
    popularidad = 0.0;
    listaDias = new ArrayList<Dia>();
    listaEmpleados = new ArrayList<Empleado>();
    listaMesas = new ArrayList<Mesa>();
    listaDecoraciones = new ArrayList<Decoracion>();
  }

  public void mejorarComida(Comida comidita)
  {
    comidita.setPrecioVenta(comidita.getPrecioVenta()+ 20.0);
    comidita.setCostoPreparacion(comidita.getCostoPreparacion()+ 10.0);
    System.out.println("Se ha mejorado la comida del local, ahora se vende a : " + comidita.getPrecioVenta()+" pesos");
  }

  public double getPopularidad() {
      return popularidad;
  }

  public double getDineroActual() {
      return dineroActual;
  }

  public void setPopularidad(double popularidad){
      this.popularidad=popularidad;
  }
  public Dia getDiaActual( ){
      return listaDias.get(listaDias.size()-1);
  }

  public void setDineroActual(double dineroActual){
      this.dineroActual=dineroActual;
  }
  public void contratarMesero(){
      Empleado a=new Mesero();
      listaEmpleados.add(a);
  }
  public void contratarCocinero(){
      Empleado b=new Cocinero();
      listaEmpleados.add(b);
  }
  public void nuevoDia(){
      Dia dia=new Dia();
      listaDias.add(dia);

  }
  public void pagarAEmpleados(){
      for(int i= 0; i<listaEmpleados.size();i++){
          listaEmpleados.get(i).pagoSueldo(getDiaActual());
      }
  }
  public void comprarMesa(){

  }



}
