package co.cue.edu;

public class Coche implements Conducible {
    @Override
    public void mover() {
        System.out.println("El coche está avanzando.");
    }
    @Override
    public void conducir() {
        System.out.println("El coche está siendo conducido.");
    }
}
