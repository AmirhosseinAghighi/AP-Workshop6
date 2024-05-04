import java.util.HashSet;

public abstract class Animal {
    private String name;
    private int age;
    private static HashSet<Animal> animalSet = new HashSet<>();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalSet.add(this);
    }

    public void show() {
        System.out.println(name + " is " + age + " years old.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static HashSet<Animal> getAllAnimals() {
        return animalSet;
    }

    public abstract void hunt(Prey prey);
}
