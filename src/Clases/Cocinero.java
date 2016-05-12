
public class Cocinero implements Empleado {
    private static int Sueldo=1000;
    private static int CantidadDeCocineros=0;
    @Override
    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+Sueldo);

    }

    @Override
    public void realizarEmpleo(Dia dia) {
        dia.setClientesRecibidos(dia.getClientesRecibidos()+80);

    }

    public int getCantidadDeCocineros() {
        return CantidadDeCocineros;
    }

    public void setCantidadDeCocineros(int cantidadCocineros) {
        CantidadDeCocineros = cantidadCocineros;
    }
}
