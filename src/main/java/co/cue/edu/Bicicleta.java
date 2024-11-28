package co.cue.edu;

public class Bicicleta implements Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta está siendo pedaleada.");
    }

    @Override
    public void realizarAcciones() {
        mover();
    }
}
