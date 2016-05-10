package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class Cocinero implements Empleado {
    static int Sueldo=1000;

    @Override
    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+ Sueldo);

    }

    @Override
    public void realizarEmpleo(Dia dia) {
        dia.setClientesRecibidos(dia.getClientesRecibidos()+80);

    }

}
