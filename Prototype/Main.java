package Prototype;

/*
 * @author Shyam Makwana
 */

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        AnimalCache.loadCache();
        Animal clonedAnimal = (Animal) AnimalCache.getAnimal("1");
        System.out.println("Animal : " + clonedAnimal.getType());
        clonedAnimal.render();
        clonedAnimal = (Animal) AnimalCache.getAnimal("2");
        System.out.println("Animal : " + clonedAnimal.getType());
        clonedAnimal.render();
        clonedAnimal = (Animal) AnimalCache.getAnimal("3");
        System.out.println("Animal : " + clonedAnimal.getType());
        clonedAnimal.render();
    }
}
