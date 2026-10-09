
public class Main {
    public static void main(String[] args) {
        Paquete p1 = new Paquete("P001", "Mendoza", "En Depósito");
        Paquete p2 = new Paquete("P002", "San Juan", "En Depósito");
        Paquete p3 = new Paquete("P003", "San Luis", "En Depósito");

        CamionDeReparto camion1 = new CamionDeReparto(p1, p2);
        CamionDeReparto camion2 = new CamionDeReparto(p3, null);

        CentroLogistico centro = new CentroLogistico(camion1, camion2);

        centro.difundirActualizacion("En Tránsito");

        System.out.println(p1.getCodigo() + ": " + p1.getEstadoActual());
        System.out.println(p2.getCodigo() + ": " + p2.getEstadoActual());
        System.out.println(p3.getCodigo() + ": " + p3.getEstadoActual());
    }
}