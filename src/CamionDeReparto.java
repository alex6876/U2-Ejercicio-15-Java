
public class CamionDeReparto {
    private Paquete paquete1;
    private Paquete paquete2;

    public CamionDeReparto(Paquete paquete1, Paquete paquete2) {
        this.paquete1 = paquete1;
        this.paquete2 = paquete2;
    }

    public void actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado) {
        if (paquete1 != null && paquete1.getCodigo().equals(codigoPaquete)) {
            paquete1.setEstado(nuevoEstado);
        }

        if (paquete2 != null && paquete2.getCodigo().equals(codigoPaquete)) {
            paquete2.setEstado(nuevoEstado);
        }
    }

    public void actualizarTodosLosPaquetes(String nuevoEstado) {
        if (paquete1 != null) {
            paquete1.setEstado(nuevoEstado);
        }

        if (paquete2 != null) {
            paquete2.setEstado(nuevoEstado);
        }
    }
}