package Prototype_Pattern;

public class MainPrototype {
    public static void main(String[] args) {

        Animal originalAnimal = new Animal("Jimy", "black", "Cat");
        System.out.println("Original Animal: " + originalAnimal);


        Animal clonedAnimal = originalAnimal.clone();
        System.out.println("Cloned Animal: " + clonedAnimal);


        clonedAnimal = new Animal(clonedAnimal.getName("Jimy"), "red", clonedAnimal.getType("Cat"));
        System.out.println("Modified Cloned Animal: " + clonedAnimal);


        System.out.println("Original Animal after modification: " + originalAnimal);
    }
}

