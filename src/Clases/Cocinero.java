package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class Cocinero implements Empleado {
    static int Sueldo=666;

    @Override
    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+this.Sueldo);

    }

    @Override
    public void realizarEmpleo(Dia dia) {
        dia.setClientesRecibidos(dia.getClientesRecibidos()+80);

    }

}
