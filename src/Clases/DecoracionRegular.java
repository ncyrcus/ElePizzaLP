package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class DecoracionRegular extends  Decoracion {

    private static int costoDecoracionRegular=500;
    private static double popularidad = 0.25;
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionRegular-75);
        local.setPopularidad(local.getPopularidad()-popularidad);
    }

    @Override
    public void comprarDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()-costoDecoracionRegular);
        local.setPopularidad(local.getPopularidad()+popularidad);
    }
}
