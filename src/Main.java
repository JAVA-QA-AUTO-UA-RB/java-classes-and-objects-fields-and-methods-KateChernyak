public class Main {
    public static void main(String[] args) {

        SuperHero ironman = new SuperHero();
        SuperHero flash = new SuperHero();

        System.out.println(" The epic battle of SuperHeroes begins! ");
// В мене Марвел рулить))
        ironman.name = "IronMan";
        ironman.attackPower = 35;
        ironman.defensePower = 30;

        flash.name = "Flash";
        flash.attackPower = 25;
        flash.defensePower = 20;

        // Lets get it started))

        int round = 1;
        //System.out.println("Раунд " + round);

        while (flash.isAlive() && ironman.isAlive()) {
            System.out.println("Round " + round);
            flash.attack(ironman);
            if (!ironman.isAlive()) break;
            ironman.attack(flash);
            round++;
        }


        //ironman.attack(flash); // це я собі так писала після уроку для особистого розуміння
        //flash.attack(ironman);
        //flash.attack(ironman);
        //ironman.attack(flash);
        //ironman.attack(flash);

        if (ironman.isAlive()){
            System.out.println(" The Winner is IronMan! ");
        }
        else if (flash.isAlive()){
            System.out.println(" The Winner is Flash! ");
        } else {
            System.out.println(" This is a Draw. Lets try again  ");
        }
        flash.showStats();
        ironman.showStats();
    }
}
