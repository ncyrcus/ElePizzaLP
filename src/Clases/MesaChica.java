package Clases;

public class MesaChica extends Mesa {
    private int capacidad = 5;
    private static int cantidadMesasChicas=0;
    private double costoMesaChica=500.0;


    public void comprarMesa(Dia dia)
    {
      if (cantidadMesa<=9)
      {
        dia.setCosto(dia.getCosto()+ costoMesaChica); //se agrega la compra a los costos del dia
        cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
        cantidadMesasChicas+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
        System.out.println("Se ha comprado una mesa chica, actualmente hay " + cantidadMesasChicas + " mesas chicas");
      }
      else
      {
        System.out.println("No se pueden comprar mas mesas");
      }

    }

    public void venderMesa(Dia dia)
    {
      if(cantidadMesa>0)
      {
        dia.setCosto(dia.getCosto()-costoMesaChica); //se quita una compra a los costos del dia
        cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
        cantidadMesasChicas-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
        System.out.println("Se ha vendido una mesa chica, actualmente hay " + cantidadMesasChicas + " mesas chicas");
      }

      else
      {
        System.out.println("No se pueden vender mas mesas");
      }
    }

    public void contabilizar(Dia dia)
    {
      dia.setClientesSentados(dia.getClientesSentados()+(cantidadMesasChicas*capacidad*10));
    }

    public int getCapacidad() {
        return capacidad;
    }
}
