public abstract class Mammal extends Animal{
    private int runningSpeed;

    public Mammal(String name, int age, int runningSpeed) {
        super(name, age);
        this.runningSpeed = runningSpeed;
    }
    public abstract void show() ;
    public int getRunningSpeed() {
        return runningSpeed;
    }
    @Override
    public void hunt(Prey prey) {
        if (prey instanceof Birds) {
            System.out.println(getName() + " hunted " + prey.getName());
        } else {
            System.out.println(getName() + " can't hunt " + prey.getName());
        }
    }

}
