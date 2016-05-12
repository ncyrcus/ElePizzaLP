
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
        clientesPotenciales=0.0;
        clientesRecibidos=0;
        costo=0.0;
        ingreso=0.0;
        sueldo=0.0;
        resultado=0.0;
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

    public int getClientesSentados(){
        return clientesSentados;
    }

    public double getCosto() {
        return this.costo;
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

    public void setCosto(Comida comida)
    {
        this.costo=clientesAtendidos*comida.getCostoPreparacion()+sueldo;
    }

    public void setIngreso(Comida comida)
    {
        this.ingreso=clientesFelices*comida.getPrecioVenta();
    }

    public void setResultado() {
        this.resultado = ingreso-costo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
