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

    /******** Metodo: Local ********************
      Descripcion: Constructor de la clase Local

      Parametros:
      Sin Parametros

      Retorno: Sin retorno
      ************************************************/
    public Local()
    {
    dineroActual=100000.0;
    popularidad = 0.0;
    popularidadBase = 2.0;
    listaDias = new ArrayList<Dia>();
    listaEmpleados = new ArrayList<Empleado>();
    listaMesas = new ArrayList<Mesa>();
    listaDecoraciones = new ArrayList<Decoracion>();
    }

    /******** Metodo: getPopularidad ********************
      Descripcion: retorna la popularidad del local

      Parametros:
      Sin Parametros

      Retorno: retorna la variable popularidad de tipo double
      ************************************************/
    public double getPopularidad() {
      return popularidad;
    }

    /******** Metodo: getDineroActual ********************
      Descripcion: retorna lel dinero actial del local

      Parametros:
      Sin Parametros

      Retorno: retorna la variable dineroActual de tipo double
      ************************************************/
    public double getDineroActual() {
      return dineroActual;
    }

    /******** Metodo: setPopularidad ********************
      Descripcion: modifica la popularidad del local

      Parametros:
      popularidad double

      Retorno: Sin retorno
      ************************************************/
    public void setPopularidad(double popularidad){
      this.popularidad=popularidad+popularidadBase;
    }

    /******** Metodo: getDiaActual ********************
      Descripcion: retorna el dia actual de la lista dia

      Parametros:
      Sin Parametros

      Retorno: retorna el dia actual, de tipo Dia
      ************************************************/
    public Dia getDiaActual( ){
      return listaDias.get(listaDias.size()-1);
    }

    /******** Metodo: setDineroActual ********************
      Descripcion: modifica el dinero actual del local

      Parametros:
      dineroActual double

      Retorno: Sin retorno
      ************************************************/
    public void setDineroActual(double dineroActual){
      this.dineroActual=dineroActual;
    }

    /******** Metodo: setDineroActual ********************
      Descripcion: recorre la lista de empleados para el pago del sueldo

      Parametros:
      Sin Parametros

      Retorno: Sin retorno
      ************************************************/
    private void pagarAEmpleados(){
      for(int i= 0; i<listaEmpleados.size();i++){
          listaEmpleados.get(i).pagoSueldo(getDiaActual());
      }
    }

    /******** Metodo: supervisarEmpleo ********************
      Descripcion: recorre la lista de empleados para realizar el empleo

      Parametros:
      Sin Parametros

      Retorno: Sin retorno
      ************************************************/
    private void supervisarEmpleo(){
      for(int i=0;i<listaEmpleados.size();i++){
          listaEmpleados.get(i).realizarEmpleo(getDiaActual());
      }
    }

    /******** Metodo: contarMesas ********************
      Descripcion: recorre la lista de mesas para contabilizarlas

      Parametros:
      Sin parametro

      Retorno: Sin retorno
      ************************************************/
    private void contarMesas(){
      for(int i=0;i<listaMesas.size();i++){
          listaMesas.get(i).contabilizar(getDiaActual());
      }
    }

    /******** Metodo: aumentarNivel ********************
      Descripcion: aumenta el nivel del local, verificando que hayan sido mas de 5 dias los clientes
                  felices que potenciales

      Parametros:
      Sin parametro

      Retorno: Sin retorno
      ************************************************/
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

    /******** Metodo: mejorarComida ********************
      Descripcion: aumenta el precio de venta y costo de preparacion de la comida del local

      Parametros:
      Sin parametros

      Retorno: Sin retorno
      ************************************************/
    public void mejorarComida(){
        pizzaDeLocal.setPrecioVenta(pizzaDeLocal.getPrecioVenta()+ 20.0);
        pizzaDeLocal.setCostoPreparacion(pizzaDeLocal.getCostoPreparacion()+ 10.0);
        System.out.println("Se ha mejorado la comida del local, ahora se vende a : " + pizzaDeLocal.getPrecioVenta()+" pesos");
    }

    /******** Metodo: contratarMesero ********************
      Descripcion: contrata un mesero, agregandolo a la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente los meseros
      ************************************************/
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
    /******** Metodo: cantidadMeseros ********************
      Descripcion: retorna la cantidad de meseros contratados en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de meseros del local, de tipo int
      ************************************************/
    public int cantidadMeseros(){
      return cMesero.getCantidadDeMeseros();
    }

    /******** Metodo: cantidadMesasGrandes ********************
      Descripcion: retorna la cantidad de mesas grandes presentes en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de mesas grandes del local, de tipo int
      ************************************************/
    public int cantidadMesasGrandes() {
        return cMesaGrande.getCantidadMesasGrandes();
    }

    /******** Metodo: cantidadMesasMedianas ********************
      Descripcion: retorna la cantidad de mesas medianas presentes en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de mesas medianas del local, de tipo int
      ************************************************/
    public int cantidadMesasMedianas() {
        return cMesaMediana.getCantidadMesasMedianas();
    }

    /******** Metodo: cantidadMesasChicas ********************
      Descripcion: retorna la cantidad de mesas chicas presentes en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de mesas chicas del local, de tipo int
      ************************************************/
    public int cantidadMesasChicas() {
        return cMesaChica.getCantidadMesasChicas();
    }


    /******** Metodo: contratarCocinero ********************
      Descripcion: contrata un cocinero, agregandolo a la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente los cocineros
      ************************************************/
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

    public int cantidadCocineros(){
      return cCocinero.getCantidadDeCocineros();
    }


    /******** Metodo: despedirMesero ********************
      Descripcion: despide un mesero, quitandolo de la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente los meseros
      ************************************************/
    public boolean despedirMesero(){
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

    /******** Metodo: despedirCocinero ********************
      Descripcion: despide un Cocinero, quitandolo de la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente los cocineros
      ************************************************/
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

    /******** Metodo: comprarMesaChica ********************
      Descripcion: compra una mesa chica, agregandola a la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las mesas
      ************************************************/
    public boolean comprarMesaChica(){
        if(cMesaChica.getCantidadMesa()<9){
            Mesa nueva= new MesaChica();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }

    /******** Metodo: comprarMesaMediana ********************
      Descripcion: compra una mesa mediana, agregandola a la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las mesas
      ************************************************/
    public boolean comprarMesaMediana(){
        if(cMesaMediana.getCantidadMesa()<9){
            Mesa nueva= new MesaMediana();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }

    /******** Metodo: comprarMesaGrande ********************
      Descripcion: compra una mesa grande, agregandola a la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las mesas
      ************************************************/
    public boolean comprarMesaGrande(){
        if(cMesaGrande.getCantidadMesa()<9){
            Mesa nueva= new MesaGrande();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }


    /******** Metodo: venderMesaChica ********************
      Descripcion: vende una mesa chica, quitandola de la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las mesas
      ************************************************/
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

    /******** Metodo: venderMesaMediana********************
      Descripcion: vende una mesa mediana, quitandola de la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las mesas
      ************************************************/

    public boolean venderMesaMediana(){
        if (cMesaMediana.getCantidadMesasMedianas()>0){
            int con=0;
            while (!(listaMesas.get(0) instanceof MesaMediana)){
                con++;
            }
            if (listaMesas.get(con) instanceof MesaMediana){
                listaMesas.get(con).venderMesa(this);
                listaMesas.remove(con);
                return true;
            }
        }
        return false;
    }


    /******** Metodo: venderMesaGrande********************
      Descripcion: vende una mesa grande, quitandola de la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las mesas
      ************************************************/
    public boolean venderMesaGrande(){
        if (cMesaGrande.getCantidadMesasGrandes()>0){
            int con=0;
            while (!(listaMesas.get(0) instanceof MesaGrande)){
                con++;
            }
            if (listaMesas.get(con) instanceof MesaGrande){
                listaMesas.get(con).venderMesa(this);
                listaMesas.remove(con);
                return true;
            }
        }
        return false;
    }


    /******** Metodo: comprarDecoracionRegular********************
      Descripcion: compra una decoracion regular, agregandola a la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las decoraciones
      ************************************************/
    public boolean comprarDecoracionRegular(){
        try {
            Decoracion a=new DecoracionRegular();
            a.comprarDecoracion(this);

            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    /******** Metodo: comprarDecoracionBonita********************
      Descripcion: compra una decoracion bonita, agregandola a la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las decoraciones
      ************************************************/
    public boolean comprarDecoracionBonita(){
        try {
            Decoracion a=new DecoracionBonita();
            a.comprarDecoracion(this);
            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    /******** Metodo: comprarDecoracionEspectacular********************
      Descripcion: compra una decoracion espectacular, agregandola a la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las decoraciones
      ************************************************/
    public boolean comprarDecoracionEspectacular(){
        try {
            Decoracion a=new DecoracionEspectacular();
            a.comprarDecoracion(this);
            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    /******** Metodo: venderDecoracionRegular********************
      Descripcion: vende una decoracion regular, quitandola de la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las decoraciones
      ************************************************/
    public boolean venderDecoracionRegular(){
        if (cDR.getCantidadDR()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionRegular)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionRegular){
                listaDecoraciones.get(con).venderDecoracion(this);
                listaDecoraciones.remove(con);

                return true;
            }
        }
        return false;
    }

    /******** Metodo: venderDecoracionBonita********************
      Descripcion: vende una decoracion bonita, quitandola de la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las decoraciones
      ************************************************/
    public boolean venderDecoracionBonita(){
        if (cDB.getCantidadDB()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionBonita)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionBonita){
                listaDecoraciones.get(con).venderDecoracion(this);
                listaDecoraciones.remove(con);

                return true;
            }


        }
        return false;
    }

    /******** Metodo: venderDecoracionEspectacular********************
      Descripcion: vende una decoracion espectacular, quitandola de la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las decoraciones
      ************************************************/
    public boolean venderDecoracionEspectacular(){
        if (cDE.getCantidadDE()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionEspectacular)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionEspectacular){
                listaDecoraciones.get(con).venderDecoracion(this);
                listaDecoraciones.remove(con);

                return true;
            }
        }
        return false;
    }


    /******** Metodo: venderDecoracionRegular********************
      Descripcion: Crea una nueva instancia de dia, agregandola a la lista dias

      Parametros:
      Sin parametros

      Retorno: Funcion void sin retorno
      ************************************************/
    public void nuevoDia(){
        Dia dia=new Dia();
        listaDias.add(dia);
    }


    /******** Metodo: venderDecoracionRegular********************
      Descripcion: llama a las funciones necesarias para realizar el dia trabajado

      Parametros:
      Sin parametros

      Retorno: Sin retorno
      ************************************************/
    public void realizarDia(){
      nuevoDia();
      Dia diaActual=getDiaActual();
      diaActual.setClientesPotenciales((popularidad+popularidadBase)*20);
      dineroActual=dineroActual+diaActual.getResultado();
      contarMesas();
      supervisarEmpleo();
      diaActual.setClientesFelices();
      pagarAEmpleados();
      diaActual.setIngreso(pizzaDeLocal);
      diaActual.setCosto(pizzaDeLocal);
      diaActual.setResultado();
      dineroActual=dineroActual+diaActual.getResultado();
      aumentarNivel();

    }

    public int getNumeroMesaChica(){
        return cMesaChica.getCantidadMesasChicas();
    }
    public int getNumeroMesaMediana(){
        return cMesaMediana.getCantidadMesasMedianas();
    }
    public int getNumeroMesaGrande(){
        return cMesaGrande.getCantidadMesasGrandes();
    }
    public int getNumeroDecoracionRegular(){
        return cDR.getCantidadDR();
    }
    public int getNumeroDecoracionBonita(){
        return cDB.getCantidadDB();
    }
    public int getNumeroDecoracionEspectacular(){
        return cDE.getCantidadDE();
    }

    public int getNumeroDia(){
        return listaDias.size();
    }
    public int getNumeroEstrellas(){
        return numeroEstrellas;

    }

    public int getPrecioComida(){
        return (int)pizzaDeLocal.getPrecioVenta();
    }
    public int getCostoComida(){
        return (int)pizzaDeLocal.getCostoPreparacion();
    }
    public int getPrecioMesaChica(){
        return (int)cMesaChica.getCostoMesa();
    }
    public int getPrecioMesaMediana(){
        return (int)cMesaMediana.getCostoMesa();
    }
    public int getPrecioMesaGrande(){
        return (int)cMesaGrande.getCostoMesa();
    }


    public int getPrecioDeRe(){
        return cDR.getCostoDecoracion();
    }
    public int getPrecioDeBo(){
        return cDB.getCostoDecoracion();
    }
    public int getPrecioDeEs(){
        return cDE.getCostoDecoracion();
    }























}
