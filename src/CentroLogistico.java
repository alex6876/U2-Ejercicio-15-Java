
public class CentroLogistico {
    private CamionDeReparto camion1;
    private CamionDeReparto camion2;

    public CentroLogistico(CamionDeReparto camion1, CamionDeReparto camion2) {
        this.camion1 = camion1;
        this.camion2 = camion2;
    }

    public void difundirActualizacion(String nuevoEstado) {
        camion1.actualizarTodosLosPaquetes(nuevoEstado);
        camion2.actualizarTodosLosPaquetes(nuevoEstado);
    }
}
