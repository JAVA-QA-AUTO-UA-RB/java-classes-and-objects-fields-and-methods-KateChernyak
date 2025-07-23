public class SuperHero {
    String name;
    int attackPower;
    int defensePower;
    int health = 100;


    public void attack(SuperHero opponent) {
        System.out.println("SuperHero   " + name + "   attacks ");
        opponent.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0 ) {
            health = 0;
            System.out.println("SuperHero  " + name + " took " + damage + "damages. Current health:  " + health);
        }
        if (health == 0){
        System.out.println("SuperHero  " + name + " died in an epic battle");
    }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStats() {
        System.out.println("SuperHero  " + name + "  after attack has " + health + "  health" );
    }
}