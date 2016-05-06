package Clases;

public abstract class Mesa {
    static int cantidadMesa=0;
    private static int capacidad=9;

    public abstract void contabilizar(Dia dia);
    public abstract void comprarMesa(Dia dia);
    public abstract void venderMesa(Dia dia);

}
