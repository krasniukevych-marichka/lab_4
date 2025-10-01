package ucu.edu.ua;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("The fight between " + c1 + " and " + c2 + " begins");
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println(c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is dead!");
                break;
            } else {
                System.out.println(c2.getClass().getSimpleName() + " is alive and ready to attack");
            }

            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName());
            c2.kick(c1);
            System.out.println(c1);
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is dead!");
                break;
            } else {
                System.out.println(c2.getClass().getSimpleName() + " is alive and ready to attack");
            }
        }
    }
}
