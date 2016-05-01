package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public abstract class Mesa {
    static int cantidadMesa=0;
    int capacidad;
    abstract void contabilizar(); //con un parametro llamado dia que debe ser una clase
    abstract void comprarMesa();
    abstract void venderMesa();
}
