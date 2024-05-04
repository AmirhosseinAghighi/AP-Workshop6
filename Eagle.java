public class Eagle extends Birds implements Hunter {
    private String special;

    public Eagle(String name, int age, int flightHeight, String special) {
        super(name, age, flightHeight);
        this.special = special;
        Animal.getAllAnimals().add(this);
    }

    @Override
    public void show() {
        // Format: Name: [name], Age: [age], Flight Height: [flightHeight], Special: [special]
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Flight Height: " + getFlightHeight() + ", Special: " + special);
    }
}
