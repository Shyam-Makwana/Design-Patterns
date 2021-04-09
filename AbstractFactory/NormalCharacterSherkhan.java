package AbstractFactory;

/*
 * @author Shyam Makwana
 */

public class NormalCharacterSherkhan implements NormalCharacter{
    public NormalCharacterSherkhan()
    {
        System.out.println("NormalCharacterSherkhan()");
    }
    public void render()
    {
        System.out.println("NormalCharacterSherkhan:render()");
    }
}
