public class Parrot extends Birds implements Prey{
private String special;
    public Parrot(String name, int age, int flightHeight, String special) {
        super(name, age, flightHeight);
        this.special = special;
        Animal.getAnimals().add(this);
    }
    @Override
    public void show() {
        //Row. name, age, height of fly/speed, animal special :
        System.out.println(" name: " + getName() + ", age: " + getAge() + ", height of fly: " + getFlightHeight() + " , " + special);
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
