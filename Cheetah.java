public class Cheetah extends Mammal implements Hunter {
    private String special;

    public Cheetah(String name, int age, int runningSpeed, String special) {
        super(name, age, runningSpeed);
        this.special = special;
        Animal.getAllAnimals().add(this);
    }

    @Override
    public void show() {
        // Format: Name: [name], Age: [age], Running Speed: [runningSpeed], Special: [special]
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Running Speed: " + getRunningSpeed() + ", Special: " + special);
    }
}
