
public class  Mesero implements Empleado {

    private static int Sueldo=500;
    private static int cantidadDeMeseros=0;



    /******** Metodo: pagoSueldo ********************
    Descripcion: modifica el valor de tipo double "sueldo", atributo de la clase dia

    Parametros:
    dia Dia

    Retorno: metodo void sin retorno
    ************************************************/
    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+Sueldo);

    }

    /******** Metodo: realizarEmpleo ********************
    Descripcion: modifica el valor de clientesRecibidos, atributo de la clase dia

    Parametros:
    dia Dia

    Retorno: metodo void sin retorno
    ************************************************/
    public void realizarEmpleo(Dia dia) {
        dia.setClientesRecibidos(dia.getClientesRecibidos()+150);

    }

    /******** Metodo: getCantidadDeCocineros ********************
      Descripcion: retorna la cantidad de meseros presentes

      Parametros:
      Sin parametros

      Retorno: retorna la la variable cantidadDeMeseros, de tipo int
      ************************************************/
    public int getCantidadDeMeseros() {
        return cantidadDeMeseros;
    }


    /******** Metodo: setCantidadDeCocineros ********************
      Descripcion: modifica la cantidad de meseros presentes

      Parametros:
      cantidadDeMeseros int

      Retorno: metodo void sin retorno
      ************************************************/
    public void setCantidadDeMeseros(int cantidadDeMeseros) {
        Mesero.cantidadDeMeseros = cantidadDeMeseros;
    }
}
