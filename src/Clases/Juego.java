
/**
 * Created by Neekuu on 28-04-2016.
 */

public class Juego {
    public static void main(String[]args){

      /**
       * se crean estas instancias de las clases dia y mesachica para ver si funciona, en mi escritorio si funciona
       * pero no me resulta cuando lo trato de ejecutar con el package Clases.
       * fe de ratas: esto se arregla si elimino la sentencia package Clases.* al principio de cada archivo
       *
       */

      Local localito=new Local();
      MesaGrande mesota = new MesaGrande();
      mesota.comprarMesa(localito);

    }

}
