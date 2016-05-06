package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class MesaMediana extends Mesa{
    private int capacidad = 10;
    private static int cantidadMesasMedianas=0;
    private double costoMesaMediana=500.0;


    public void comprarMesa(Dia dia)
    {
        if (super.cantidadMesa<=9)
        {
            dia.setCosto(dia.getCosto()+ (int)costoMesaMediana); //se agrega la compra a los costos del dia
            super.cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
            cantidadMesasMedianas+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
            //System.out.println("Se ha comprado una mesa chica, actualmente hay " + cantidadMesasMedianas + " mesas chicas");
        }
        else
        {
            System.out.println("No se pueden comprar mas mesas medianas");
        }

    }

    public void venderMesa(Dia dia)
    {
        if(super.cantidadMesa>0)
        {
            dia.setCosto(dia.getCosto()-(int)costoMesaMediana); //se quita una compra a los costos del dia
            super.cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
            cantidadMesasMedianas-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
            //System.out.println("Se ha vendido una mesa chica, actualmente hay " + cantidadMesasChicas + " mesas chicas");
        }

        else
        {
            System.out.println("No se pueden vender mas mesas medianas");
        }
    }

    public void contabilizar(Dia dia)
    {
        dia.setClientesSentados(dia.getClientesSentados()+(capacidad*cantidadMesasMedianas*10));
    }

}