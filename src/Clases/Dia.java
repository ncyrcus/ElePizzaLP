package Clases;

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
        clientesAtendidos=0;
        clientesSentados=0;
        clientesFelices=0;
        clientesPotenciales=0;
        clientesRecibidos=0;
        costo=0;
        ingreso=0;
        sueldo=0;
        resultado=0;
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
