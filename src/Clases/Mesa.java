package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public abstract class Mesa {
    private static int cantidadMesa=0;
    private int capacidad;



    public abstract void contabilizar(); //con un parametro llamado dia que debe ser una clase
    public abstract void comprarMesa();
    public abstract void venderMesa();
    public void algo(int cantidadMesa){
        this.cantidadMesa=cantidadMesa;
    }
}
