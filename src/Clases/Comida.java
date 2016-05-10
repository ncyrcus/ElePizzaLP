package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class Comida {

  private double precioVenta;
  private double costoPreparacion;

  public Comida(){
    precioVenta=40.0;
    costoPreparacion=10.0;
  }

  public double getPrecioVenta() {
      return precioVenta;
  }

  public double getCostoPreparacion() {
      return costoPreparacion;
  }
  public void setPrecioVenta(double precioVenta){
      this.precioVenta=precioVenta;
  }

  public void setCostoPreparacion(double costoPreparacion){
      this.costoPreparacion=costoPreparacion;
  }

}
