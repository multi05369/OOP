
public class Programmer extends Employee{
    private int happiness;
    
    public void coding(String str) {
        if (this.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            this.setEnergy(this.getEnergy() - 30);
            this.setHappiness(this.getHappiness() - 30);
        } else {
            System.out.println("Error Error Error");
            this.setEnergy(this.getEnergy() - 30);
            this.setHappiness(this.getHappiness() - 30);
        }
    }
    public void coding(char str) {
        this.coding(String.valueOf(str));
    }
    public int getHappiness() { return this.happiness;}
    public void setHappiness(int happiness) { this.happiness = happiness;}
}
