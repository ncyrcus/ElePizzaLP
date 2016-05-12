
public class DecoracionRegular extends  Decoracion {

    private static int costoDecoracionRegular=500;
    private static double popularidad = 0.25;
    private static int cantidadDR=0;
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionRegular-75);
        local.setPopularidad(local.getPopularidad()-popularidad);
    }


    public void comprarDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()-costoDecoracionRegular);
        local.setPopularidad(local.getPopularidad()+popularidad);
    }

    public  int getCantidadDR() {
        return cantidadDR;
    }

    public  void setCantidadDR(int cantidadDR) {
        DecoracionRegular.cantidadDR = cantidadDR;
    }
}
