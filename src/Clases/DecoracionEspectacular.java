package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class DecoracionEspectacular extends Decoracion {
    private static int costoDecoracionEspectacular=2000;
    private static double popularidad = 1.0;
    private static int cantidadDE=0;
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionEspectacular-300);
        local.setPopularidad(local.getPopularidad()-popularidad);
    }


    public void comprarDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()-costoDecoracionEspectacular);
        local.setPopularidad(local.getPopularidad()+popularidad);
    }

    public int getCantidadDE() {
        return cantidadDE;
    }

    public void setCantidadDE(int cantidadDE) {
        DecoracionEspectacular.cantidadDE = cantidadDE;
    }
}
