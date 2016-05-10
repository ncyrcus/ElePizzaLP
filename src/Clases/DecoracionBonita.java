
/**
 * Created by Neekuu on 28-04-2016.
 */
public class DecoracionBonita extends Decoracion{
    private static int costoDecoracionBonita=1000;
    private static double popularidad = 0.5;
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionBonita-150);
        local.setPopularidad(local.getPopularidad()-popularidad);
    }


    public void comprarDecoracion(Local local) {
       local.setDineroActual(local.getDineroActual()-costoDecoracionBonita);
       local.setPopularidad(local.getPopularidad()+popularidad);
    }

}
