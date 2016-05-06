package Clases;

public class MesaMediana extends Mesa {
  private int capacidad = 10;
  private static int cantidadMesasMedianas=0;
  private double costoMesaMediana=1000.0;


  public void comprarMesa(Dia dia)
  {
    if (cantidadMesa<=9)
    {
      dia.setCosto(dia.getCosto()+ costoMesaMediana); //se agrega la compra a los costos del dia
      cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
      cantidadMesasMedianas+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha comprado una mesa mediana, actualmente hay " + cantidadMesasMedianas + " mesas medianas");
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
      dia.setCosto(dia.getCosto()-costoMesaMediana); //se quita una compra a los costos del dia
      cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
      cantidadMesasMedianas-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha vendido una mesa mediana, actualmente hay " + cantidadMesasMedianas + " mesas medianas");
    }

    else
    {
      System.out.println("No se pueden vender mas mesas");
    }
  }

  public void contabilizar(Dia dia)
  {
    dia.setClientesSentados(dia.getClientesSentados()+(cantidadMesasMedianas*capacidad*10));
  }
  public int getCapacidad() {
        return capacidad;
    }
}
