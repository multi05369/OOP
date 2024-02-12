
public abstract class Spell {
    private int damage;
    private final String name;
    
    public Spell() {
        this("");
        this.damage = 0;
    }
    public Spell(String name) {
        this.name = name;
        this.damage = 0;
    }
    public int getDamage() {
        return this.damage;
    }
    public String getName() {
        return this.name;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
