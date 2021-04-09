package AbstractFactory;

/*
 * @author Shyam Makwana
 */

public class ColorCharacterMowgli implements ColorCharacter{
    public ColorCharacterMowgli()
    {
        System.out.println("ColorCharacterMowgli()");
    }
    public void render()
    {
        System.out.println("ColorCharacterMowgli:render()");
    }
}
