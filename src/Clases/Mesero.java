package Clases;
/**
 * Created by Neekuu on 28-04-2016.
 */
public class  Mesero implements Empleado {

    private static int Sueldo=500;
    private static int cantidadDeMeseros=0;


    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+Sueldo);

    }


    public void realizarEmpleo(Dia dia) {
        dia.setClientesRecibidos(dia.getClientesRecibidos()+150);

    }

    public int getCantidadDeMeseros() {
        return cantidadDeMeseros;
    }

    public void setCantidadDeMeseros(int cantidadDeMeseros) {
        Mesero.cantidadDeMeseros = cantidadDeMeseros;
    }
}
