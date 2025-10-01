package ucu.edu.ua;


public class Hobbit extends Character {

    public Hobbit () {
        super(0, 3, new HobbitKickStartegy());
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }

}
