package Clases;

/**
 * Created by Neekuu on 28-04-2016.
 */
public class Dia {
    private int clientesPotenciales;
    private int clientesSentados;
    private int clientesAtendidos;
    private int clientesRecibidos;
    private int clientesFelices;
    private int sueldo;
    private int ingreso;
    private int costo;
    private int resultado;
    public Dia(){
        setClientesAtendidos(0);
        setClientesSentados(0);
        setClientesFelices(0);
        setClientesPotenciales(0);
        setClientesRecibidos(0);
        setCosto(0);
        setIngreso(0);
        setSueldo(0);
        setResultado(0);
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public int getClientesFelices() {
        return clientesFelices;
    }

    public int getClientesPotenciales() {
        return clientesPotenciales;
    }

    public int getClientesRecibidos() {
        return clientesRecibidos;
    }

    public int getClientesSentados() {
        return clientesSentados;
    }

    public int getCosto() {
        return costo;
    }

    public int getIngreso() {
        return ingreso;
    }

    public int getResultado() {
        return resultado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }

    public void setClientesFelices(int clientesFelices) {
        this.clientesFelices = clientesFelices;
    }

    public void setClientesPotenciales(int clientesPotenciales) {
        this.clientesPotenciales = clientesPotenciales;
    }

    public void setClientesRecibidos(int clientesRecibidos) {
        this.clientesRecibidos = clientesRecibidos;
    }

    public void setClientesSentados(int clientesSentados) {
        this.clientesSentados = clientesSentados;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


}
