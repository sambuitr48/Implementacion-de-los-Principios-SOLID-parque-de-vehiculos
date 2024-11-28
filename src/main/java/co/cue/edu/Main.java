package co.cue.edu;

public class Main {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento();

        Vehiculo bicicleta = new Bicicleta();
        Conducible coche = new Coche();
        Conducible motocicleta = new Motocicleta();

        estacionamiento.agregarVehiculo(bicicleta);
        estacionamiento.agregarVehiculo(coche);
        estacionamiento.agregarVehiculo(motocicleta);

        estacionamiento.mostrarAcciones();
    }
}
