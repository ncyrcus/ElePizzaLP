
public class Comida {

  private double precioVenta;
  private double costoPreparacion;


  /******** Metodo: Comida ********************
    Descripcion: constructor de la clase Comida

    Parametros:
    Sin parametros

    Retorno: Sin retorno
    ************************************************/
  public Comida(){
    precioVenta=40.0;
    costoPreparacion=10.0;
  }

  /******** Metodo: getPrecioVenta ********************
    Descripcion: retorna el precio de venta de la comida

    Parametros:
    Sin parametros

    Retorno: retorna el precio de venta, de tipo double
    ************************************************/
  public double getPrecioVenta() {
      return precioVenta;
  }

  /******** Metodo: getCostoPreparacion ********************
    Descripcion: retorna el costo de preparacion de la comida

    Parametros:
    Sin parametros

    Retorno: retorna el costo de preparacion, de tipo double
    ************************************************/
  public double getCostoPreparacion() {
      return costoPreparacion;
  }

  /******** Metodo: setPrecioVenta ********************
    Descripcion: modifica el precio de venta de la clase comida

    Parametros:
    precioVenta double

    Retorno: metodo void sin retorno
    ************************************************/
  public void setPrecioVenta(double precioVenta){
      this.precioVenta=precioVenta;
  }

  /******** Metodo: setCostoPreparacion ********************
    Descripcion: modifica el costo de preparacion del plato de comida

    Parametros:
    costoPreparacion double

    Retorno: metodo void sin retorno
    ************************************************/
  public void setCostoPreparacion(double costoPreparacion){
      this.costoPreparacion=costoPreparacion;
  }



}
