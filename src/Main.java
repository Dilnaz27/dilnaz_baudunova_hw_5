public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(70);
        boss.setProtection("shield");

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss protection: " + boss.getProtection());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage()
                    + " " + createHeroes()[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero wizard = new Hero(200, 50, "magic");
        Hero warrior = new Hero(250, 30);
        Hero bowman = new Hero(225, 40);
        Hero[] allHeroes = new Hero[]{wizard, warrior, bowman};
        return allHeroes;
    }
}