
public class Cocinero implements Empleado {
    private static int Sueldo=1000;
    private static int CantidadDeCocineros=0;

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
        dia.setClientesRecibidos(dia.getClientesRecibidos()+80);
    }

    /******** Metodo: getCantidadDeCocineros ********************
      Descripcion: retorna la cantidad de cocineros presentes

      Parametros:
      Sin parametros

      Retorno: retorna la la variable CantidadDeCocineros, de tipo int
      ************************************************/
    public int getCantidadDeCocineros() {
        return CantidadDeCocineros;
    }

    /******** Metodo: setCantidadDeCocineros ********************
      Descripcion: modifica la cantidad de cocineros presentes

      Parametros:
      cantidadCocineros int

      Retorno: metodo void sin retorno
      ************************************************/
    public void setCantidadDeCocineros(int cantidadCocineros) {
        CantidadDeCocineros = cantidadCocineros;
    }
}
