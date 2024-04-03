
public class Player {
    private Houses house;
    private int hp = 20;
    private int mana = 50;
    private final int attackDamage = 2;
    private final String name;
    
    public Player() {
        this("", 20);
        this.house = null;
        this.mana = 50;
    }
    public Player(String name) {
        this(name, 20);
        this.house = null;
        this.mana = 50;
    }
    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.house = null;
        this.mana = 50;
    }
    public int getAttackDamage() {
        return this.attackDamage;
    }
    public int getHP() {
        return this.hp;
    }
    public Houses getHouses() {
        return this.house;
    }
    public int getMana() {
        return this.mana;
    }
    public String getName() {
        return this.name;
    }
    public void setHP(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else if (hp > 20) {
            this.hp = 20;
        }
        else {
            this.hp = hp;
        }
    }
    public void setHouses(Houses houses) {
        this.house = houses;
    }
    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        }
        else if (mana > 50) {
            this.mana = 50;
        }
        else {
            this.mana = mana;
        }
    }
    public void attack(Player target, Spell spell) {
        if (this.getHouses() instanceof Gryffindor) {
            Gryffindor s1 = new Gryffindor();
            s1.attackSpell(this, target, spell);
        }
        else if (this.getHouses().getName().equals("Hufflepuff")) {
            Hufflepuff s2 = new Hufflepuff();
            s2.attackSpell(this, target, spell);
        }
        if (target.getHP() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + this.name);
        }
    }
    public boolean equals(Player player) {
        return (this.name.equals(player.name)) && (this.house.equals(player.house));
    }
    public void protectFromPlayer(Player target) {
        if (this.getHouses().getName().equals("Gryffindor")) {
            Gryffindor s3 = new Gryffindor();
            s3.defense(this, target);
        }
        else if (this.getHouses().getName().equals("Hufflepuff")) {
            Hufflepuff s4 = new Hufflepuff();
            s4.defense(this, target);
        }
    }
    @Override
    public String toString() {
        return "[Player] : " + this.getName() + " HP: " + this.getHP() + " Mana: " + this.getMana() + " || " + this.getHouses();
    }
}
