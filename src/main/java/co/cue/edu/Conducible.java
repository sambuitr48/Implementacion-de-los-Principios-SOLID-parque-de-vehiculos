package co.cue.edu;

public interface Conducible extends Vehiculo {
    @Override
    default void realizarAcciones() {
        mover();
        conducir();
    }
    void conducir();
}
