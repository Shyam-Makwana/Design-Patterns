package AbstractFactory;

/*
 * @author Shyam Makwana
 */

public class NormalCharacterMowgli implements NormalCharacter{
    public NormalCharacterMowgli()
    {
        System.out.println("NormalCharacterMowgli()");
    }
    public void render()
    {
        System.out.println("NormalCharacterMowgli:render()");
    }
}
