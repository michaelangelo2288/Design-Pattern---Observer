import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DogTest {
    @Test
    public void testDogSuper() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animal2 = new Dog();
        dog.setColor("black");

        System.out.println("dog.getColor(): " + dog.getColor());
        System.out.println("animal.getColor(): " + animal.getColor());
        System.out.println("animal2.getColor(): " + animal2.getColor());
        System.out.println("animal2.color: " + animal2.color);
        Animal dogCastedToAnimal = (Animal) dog;
        System.out.println("casted: " + dogCastedToAnimal.getColor());

        dog.printColor();

        String[] animals = {"tiger", "dog", "cat", "mouse"};
        List<String> list = Arrays.asList(animals);
        System.out.println(list.stream()
            .filter(a ->  a.contains("cat") || a.contains("dog"))
            .collect(Collectors.toList()));

        String s;
        list.stream().forEach(a -> {
            if(a.equals("dog"))
                System.out.println(a);
        });

        System.out.println("\nMethod referencing:");
        list.stream().forEach(System.out::println);

        System.out.println("\nMethod referencing + map():");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\nMethod referencing + map():");
        list.stream().map(a -> "animal is: " + a + " jumps").forEach(System.out::println);

        String pet = "dog";
        System.out.println("From Supplier<String> passed into testMethod1(). returned: "
                + testMethod1(() -> "dog"));
    }

    private String testMethod1(Supplier<String> pet) {
        System.out.println("do some stuff");
        return pet.get();
    }

}
