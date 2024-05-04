public class Giraffe extends Mammal implements Prey{
    private String special ;
    public Giraffe(String name, int age , int RunningSpeed, String special) {
        super(name, age, RunningSpeed);
        this.special = special;
        Animal.getAnimals().add(this);
    }
    @Override
    public void show() {
        //Row. name, age, height of fly/speed, animal special :
        System.out.println(" name: " + getName() + ", age: " + getAge() + ", special: " + special);
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
