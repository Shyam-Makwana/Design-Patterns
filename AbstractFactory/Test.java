package AbstractFactory;

/*
 * @author Shyam Makwana
 */

public class Test {
    public static void main(String[] s)
    {
        Animation a=new Animation();
        a.addCharacter("Mowgli","Normal");
        a.addCharacter("Mowgli","Color");
        a.addCharacter("Sherkhan","Normal");
        a.addCharacter("Sherkhan","Color");
        System.out.println("");
        a.reRender();
    }
}
