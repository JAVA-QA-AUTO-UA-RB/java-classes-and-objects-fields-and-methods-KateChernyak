public class SuperHero {
    String name;
    int attackPower;
    int defensePower;
    int health = 100;


    public void attack(SuperHero opponent) {
        System.out.println("SuperHero  " + name + "  attacks");
        opponent.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        System.out.println("SuperHero  " + name + "  receives" + damage + "  damage");
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStats() {
        System.out.println("SuperHero  " +name+ "  after attack has" + health+ "  health" );
    }
}