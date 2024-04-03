
public class Pigeous extends Bird{
    public Pigeous() {
        this("", 0);
        setPower(150);
    }
    public Pigeous(String name, int age) {
        super(name, age);
        setPower(150);
    }
    public void wingAttack(Animal a, int times) {
        for (int i = 1; i <= times; i++) {
            a.setPower(a.getPower() - 5);
        }
    }
    @Override
    public void eat(Food f) {
        setPower(getPower() + 2 * f.getPower());
    }
    @Override
    public void fly() {
        System.out.println(getName() + " fly fly . . . .");
    }
    @Override
    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }
}
