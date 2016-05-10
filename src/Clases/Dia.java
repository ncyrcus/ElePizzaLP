package Clases;

public class Dia {
    private double clientesPotenciales;
    private int clientesSentados;
    private int clientesAtendidos;
    private int clientesRecibidos;
    private int clientesFelices;
    private double sueldo;
    private double ingreso;
    private double costo;
    private double resultado;

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

    public double getClientesPotenciales() {
        return clientesPotenciales;
    }

    public int getClientesRecibidos() {
        return clientesRecibidos;
    }

    public int getClientesSentados() {
        return clientesSentados;
    }

    public double getCosto() {
        return costo;
    }

    public double getIngreso() {
        return ingreso;
    }

    public double getResultado() {
        return resultado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }

    public void setClientesFelices() {
        this.clientesFelices = Math.min((int)clientesPotenciales,Math.min(clientesAtendidos,Math.min(clientesRecibidos,clientesSentados)));
    }

    public void setClientesPotenciales(double clientesPotenciales) {
        this.clientesPotenciales = clientesPotenciales;
    }

    public void setClientesRecibidos(int clientesRecibidos) {
        this.clientesRecibidos = clientesRecibidos;
    }

    public void setClientesSentados(int clientesSentados) {
        this.clientesSentados = clientesSentados;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
