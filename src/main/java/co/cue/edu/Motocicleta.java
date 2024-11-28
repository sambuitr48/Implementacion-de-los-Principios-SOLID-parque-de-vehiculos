package co.cue.edu;

public class Motocicleta implements Conducible {
    @Override
    public void mover() {
        System.out.println("La motocicleta está avanzando.");
    }
    @Override
    public void conducir() {
        System.out.println("La motocicleta está siendo conducida.");
    }
}


