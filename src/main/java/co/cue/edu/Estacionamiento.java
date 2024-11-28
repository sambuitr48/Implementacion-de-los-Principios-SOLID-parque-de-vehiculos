package co.cue.edu;
import java.util.ArrayList;
import java.util.List;

public class Estacionamiento {
    private List<Vehiculo> vehiculos;

    public Estacionamiento() {
        this.vehiculos = new ArrayList<>();
    }

    // Agregar un vehículo al estacionamiento
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado al estacionamiento.");
    }

    // Mostrar las acciones de todos los vehículos
    public void mostrarAcciones() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
            if (vehiculo instanceof Conducible) {
                ((Conducible) vehiculo).conducir();
            }
        }
    }
}
