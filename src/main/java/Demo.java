import ucu.edu.ua.CharacterFactory;
import ucu.edu.ua.GameManager;

import java.lang.reflect.InvocationTargetException;
import ucu.edu.ua.Character;
public class Demo {
    public static void main(String args[]) 
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        GameManager.fight(c1, c2);

    }
}


