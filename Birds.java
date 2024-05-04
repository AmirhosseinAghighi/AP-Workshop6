public abstract class Birds extends Animal {
    private int flightHeight;

    public Birds(String name, int age, int flightHeight) {
        super(name, age);
        this.flightHeight = flightHeight;
    }

    @Override
    public void show() {
        System.out.println(getName() + " is a bird at the age of " + getAge() + " and flies at a height of " + flightHeight + " meters.");
    }

    public int getFlightHeight() {
        return flightHeight;
    }

    @Override
    public void hunt(Prey prey) {
        if (prey instanceof Mammal) {
            System.out.println(getName() + " hunted " + prey.getName());
        } else {
            System.out.println(getName() + " can't hunt " + prey.getName());
        }
    }
}
