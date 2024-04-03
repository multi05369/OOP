
public class Hufflepuff extends Houses implements Magicable{
    public Hufflepuff() {
        super("Hufflepuff", "YELLOW");
    }
    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        target.setHP(target.getHP() - (player.getAttackDamage() + spell.getDamage()));
        if (spell.getName().equals("Incendio")) {
            player.setMana(player.getMana() - 3);
        }
        else if (spell.getName().equals("Expelliarmus")) {
            player.setMana(player.getMana() - 4);
        }
        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName() + ")!");
    }
    @Override
    public void defense(Player player, Player damager) {
        player.setHP(player.getHP() + 4);
        player.setMana(player.getMana() + 3);
        System.out.println("[" + player.getName() + "]: Protego !");
    }
}
