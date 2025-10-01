import org.junit.jupiter.api.Test;

import ucu.edu.ua.GameManager;
import ucu.edu.ua.Hobbit;
import ucu.edu.ua.King;
import ucu.edu.ua.Elf;
import ucu.edu.ua.Character;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {
    @Test
    public void fight1() {
        Character c1 = new Hobbit();
        Character c2 = new King();

        GameManager gm = new GameManager();
        gm.fight(c1, c2);

        assertFalse(c1.isAlive());
        assertTrue(c2.isAlive());
    }

    @Test
    public void fight2() {
        Character c1 = new Hobbit();
        Character c2 = new Elf();

        GameManager gm = new GameManager();
        gm.fight(c1, c2);

        assertFalse(c1.isAlive());
        assertTrue(c2.isAlive());
    }

    
}