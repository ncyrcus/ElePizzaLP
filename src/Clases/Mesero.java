package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class  Mesero implements Empleado {

    static int Sueldo=500;

    @Override
    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+this.Sueldo);

    }

    @Override
    public void realizarEmpleo(Dia dia) {
        dia.setClientesRecibidos(dia.getClientesRecibidos()+150);

    }

}
