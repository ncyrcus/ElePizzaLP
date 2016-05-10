package Clases;
//
public class MesaGrande extends Mesa {
  private static int capacidad = 15;
  private static int cantidadMesasGrandes=0;
  private double costoMesaGrande=1500.0;


  public void comprarMesa(Local local)
  {
    if (cantidadMesa<=9)
    {
      local.setDineroActual(local.getDineroActual()+ costoMesaGrande); //se agrega la compra a los costos del dia
      cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
      cantidadMesasGrandes+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha comprado una mesa grande, actualmente hay " + cantidadMesasGrandes + " mesas grandes");
    }
    else
    {
      System.out.println("No se pueden comprar mas mesas");
    }

  }

  public void venderMesa(Local local)
  {
    if(cantidadMesa>0)
    {
      local.setDineroActual(local.getDineroActual()-costoMesaGrande-300); //se quita una compra a los costos del dia
      cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
      cantidadMesasGrandes-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha vendido una mesa grande, actualmente hay " + cantidadMesasGrandes + " mesas grandes");
    }

    else
    {
      System.out.println("No se pueden vender mas mesas");
    }
  }

  public void contabilizar(Dia dia)
  {
    dia.setClientesSentados(dia.getClientesSentados()+(cantidadMesasGrandes*capacidad*10));
  }

    public static int getCapacidad() {
        return capacidad;
    }
}
