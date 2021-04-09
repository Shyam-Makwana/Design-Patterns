package Prototype;
import java.util.HashMap;

/*
 * @author Shyam Makwana
 */

public class AnimalCache {

    private static HashMap<String, Animal> animalMap = new HashMap<>();

    public static Animal getAnimal(String animalId) throws CloneNotSupportedException {
        Animal cachedAnimal = animalMap.get(animalId);
        return (Animal) cachedAnimal.clone();
    }

    public static void loadCache() {
        System.out.println("Starting objects creation and caching ");
        Lion lion = new Lion();
        lion.setId("1");
        animalMap.put(lion.getId(), lion);
        Fox fox = new Fox();
        fox.setId("2");
        animalMap.put(fox.getId(), fox);
        Bear bear = new Bear();
        bear.setId("3");
        animalMap.put(bear.getId(), bear);
        System.out.println("Objects creation and caching completed");
    }
}