package Clases;
import java.io.IOException;
import java.util.ArrayList;

public class Local {
    private int numeroEstrellas=1;
    private DecoracionRegular cDR= new DecoracionRegular();
    private DecoracionBonita cDB= new DecoracionBonita();
    private DecoracionEspectacular cDE= new DecoracionEspectacular();
    private Mesero cMesero=new Mesero();
    private Cocinero cCocinero=new Cocinero();
    private MesaChica cMesaChica = new MesaChica();
    private MesaMediana cMesaMediana = new MesaMediana();
    private MesaGrande cMesaGrande = new MesaGrande();
    private Comida pizzaDeLocal = new Comida();
    private double popularidad;
    private double popularidadBase;
    private double dineroActual;

    private ArrayList<Dia> listaDias;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Mesa> listaMesas;
    private ArrayList<Decoracion> listaDecoraciones;

    public Local()
    {
    dineroActual=100000;
    popularidad = 0.0;
    popularidadBase = 2.0;
    listaDias = new ArrayList<Dia>();
    listaEmpleados = new ArrayList<Empleado>();
    listaMesas = new ArrayList<Mesa>();
    listaDecoraciones = new ArrayList<Decoracion>();
    }



    public double getPopularidad() {
      return popularidad;
    }

    public double getDineroActual() {
      return dineroActual;
    }

    public void setPopularidad(double popularidad){
      this.popularidad=popularidad+popularidadBase;
    }
    public Dia getDiaActual( ){
      return listaDias.get(listaDias.size()-1);
    }

    public void setDineroActual(double dineroActual){
      this.dineroActual=dineroActual;
    }

    private void pagarAEmpleados(){
      for(int i= 0; i<listaEmpleados.size();i++){
          listaEmpleados.get(i).pagoSueldo(getDiaActual());
      }
    }
    private void supervisarEmpleo(){
      for(int i=0;i<listaEmpleados.size();i++){
          listaEmpleados.get(i).realizarEmpleo(getDiaActual());
      }
    }

    private void contarMesas(){
      for(int i=0;i<listaMesas.size();i++){
          listaMesas.get(i).contabilizar(getDiaActual());
      }
    }

    public  void aumentarNivel(){
      if(listaDias.size()>5){
        int contador=listaDias.size()-1;
        boolean flag=true;
        while(contador>listaDias.size()-7 && flag){
          Dia dia = listaDias.get(contador);
          if (!(dia.getClientesPotenciales()*0.8<=(double)dia.getClientesFelices())){
                flag=false;
          }
        }
        if (flag){
          numeroEstrellas++;
        }
      }
    }
    /*
    *Funciones Contratar , Despedir, Comprar, Vender y Mejorar
    *
     */
    public void mejorarComida(){
        pizzaDeLocal.setPrecioVenta(pizzaDeLocal.getPrecioVenta()+ 20.0);
        pizzaDeLocal.setCostoPreparacion(pizzaDeLocal.getCostoPreparacion()+ 10.0);
        System.out.println("Se ha mejorado la comida del local, ahora se vende a : " + pizzaDeLocal.getPrecioVenta()+" pesos");
    }
    public boolean contratarMesero(){
        try {
            Empleado a=new Mesero();
            listaEmpleados.add(a);
            cMesero.setCantidadDeMeseros(cMesero.getCantidadDeMeseros()+1);
            return true;
        }catch (RuntimeException e){
            return false;
        }

    }
    public boolean contratarCocinero(){
        try {
            Empleado b=new Cocinero();
            listaEmpleados.add(b);
            cCocinero.setCantidadDeCocineros(cCocinero.getCantidadDeCocineros()+1);
            return true;
          }catch (RuntimeException e) {
              return false;
            }


    }


    public boolean depedirMesero(){
        if (cMesero.getCantidadDeMeseros()>0){
            int con=0;
            while (!(listaEmpleados.get(0) instanceof Mesero)){
                con++;
            }
            if (listaEmpleados.get(con) instanceof Mesero){
                listaEmpleados.remove(con);
                cMesero.setCantidadDeMeseros(cMesero.getCantidadDeMeseros()-1);
                return true;
            }


        }
        return false;
    }
    public boolean despedirCocinero(){
        if (cCocinero.getCantidadDeCocineros()>0){
            int con=0;
            while (!(listaEmpleados.get(0) instanceof Cocinero)){
                con++;
            }
            if (listaEmpleados.get(con) instanceof Cocinero){
                listaEmpleados.remove(con);
                cCocinero.setCantidadDeCocineros(cCocinero.getCantidadDeCocineros()-1);
                return true;
            }


        }
        return false;

    }

    public boolean comprarMesaChica(){
        if(cMesaChica.getCantidadMesa()<9){
            Mesa nueva= new MesaChica();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }
    public boolean comprarMesaMediana(){
        if(cMesaMediana.getCantidadMesa()<9){
            Mesa nueva= new MesaMediana();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }
    public boolean comprarMesaGrande(){
        if(cMesaGrande.getCantidadMesa()<9){
            Mesa nueva= new MesaGrande();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }

    public boolean venderMesaChica(){
        if (cMesaChica.getCantidadMesasChicas()>0){
            int con=0;
            while (!(listaMesas.get(0) instanceof MesaChica)){
                con++;
            }
            if (listaMesas.get(con) instanceof MesaChica){
                listaMesas.get(con).venderMesa(this);
                listaMesas.remove(con);
                return true;
            }


        }
        return false;
    }


    public boolean comprarDecoracionRegular(){
        try {
            Decoracion a=new DecoracionRegular();
            a.comprarDecoracion(this);
            cDR.setCantidadDR(cDR.getCantidadDR()+1);
            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }


    }
    public boolean comprarDecoracionBonita(){
        try {
            Decoracion a=new DecoracionBonita();
            a.comprarDecoracion(this);
            listaDecoraciones.add(a);
            cDB.setCantidadDB(cDB.getCantidadDB()+1);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }
    public boolean comprarDecoracionEspectacular(){
        try {
            Decoracion a=new DecoracionEspectacular();
            a.comprarDecoracion(this);
            listaDecoraciones.add(a);
            cDB.setCantidadDB(cDB.getCantidadDB()+1);
            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    public boolean venderDecoracionRegular(){
        if (cDR.getCantidadDR()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionRegular)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionRegular){
                listaDecoraciones.remove(con);
                cDR.setCantidadDR(cDR.getCantidadDR()-1);
                return true;
            }


        }
        return false;
    }
    public boolean venderDecoracionBonita(){
        if (cDB.getCantidadDB()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionBonita)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionBonita){
                listaDecoraciones.remove(con);
                cDB.setCantidadDB(cDB.getCantidadDB()-1);
                return true;
            }


        }
        return false;
    }
    public boolean venderDecoracioEspectacular(){
        if (cDE.getCantidadDE()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionEspectacular)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionEspectacular){
                listaDecoraciones.remove(con);
                cDE.setCantidadDE(cDE.getCantidadDE()-1);
                return true;
            }


        }
        return false;
    }

    public void realizarDia(){
      nuevoDia();
      Dia diaActual=getDiaActual();
      diaActual.setClientesPotenciales(popularidad+popularidadBase);
      contarMesas();
      supervisarEmpleo();
      diaActual.setClientesFelices();
      pagarAEmpleados();
      diaActual.setIngreso(pizzaDeLocal);
      diaActual.setCosto(pizzaDeLocal);
      diaActual.setResultado();
    }






    public void nuevoDia(){
        Dia dia=new Dia();
        listaDias.add(dia);

    }






























}
