package Clases;
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

  public void setDineroActual(double dineroActual){
      this.dineroActual=dineroActual;
  }


}
