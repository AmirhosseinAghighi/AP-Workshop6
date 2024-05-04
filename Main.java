import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Giraffe("Baby Giraffe", 1, 10, "Cute little giraffe"));
        animalList.add(new Parrot("Talking Parrot", 2, 20, "Can mimic human voice"));
        animalList.add(new Eagle("Golden Eagle", 3, 100, "Majestic predator of the skies"));
        animalList.add(new Giraffe("Mother Giraffe", 10, 60, "Loving and protective"));
        animalList.add(new Cheetah("Sprinting Cheetah", 5, 100, "Fastest land animal"));

        int index = 1;
        for (Animal animal : animalList) {
            System.out.print(index + ". ");
            animal.show();
            index++;
        }
        System.out.println("------");

        // Test cases for hunting:
        Giraffe giraffe = new Giraffe("Male Giraffe", 1, 10, "Strong neck for reaching leaves");
        Parrot parrot = new Parrot("Colorful Parrot", 2, 20, "Beautiful plumage");
        Eagle eagle = new Eagle("Majestic Eagle", 3, 100, "Keen eyesight for hunting");
        Cheetah cheetah = new Cheetah("Sleek Cheetah", 5, 100, "Sharp claws and incredible speed");

        giraffe.hunt(parrot);
        eagle.hunt(parrot);
        cheetah.hunt(parrot);
        cheetah.hunt(giraffe);
    }
}
