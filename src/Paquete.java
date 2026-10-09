public class Paquete {
     String codigo;
     String dirección;
     String estadoActual; //En Deposito, En transito o entrega.

    public Paquete(String codigo, String dirección, String estadoActual) {
        this.codigo = codigo;
        this.dirección = dirección;
        this.estadoActual = estadoActual;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return dirección;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstado(String estadoActual) {
        this.estadoActual = estadoActual;
    }

}
