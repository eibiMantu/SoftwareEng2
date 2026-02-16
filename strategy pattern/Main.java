public class Main {
    public static void main(String[] args) {
        // Knight Setup
        Character knight = new Character("Knight", new SwingSword());
        knight.addDefenseStrategy(new Shield());
        knight.addDefenseStrategy(new Dodge());
        knight.addDefenseStrategy(new CreateMagic());

        // Wizard Setup
        Character wizard = new Character("Wizard", new CastSpell());
        wizard.addDefenseStrategy(new CreateMagic());

        // Archer Setup
        Character archer = new Character("Archer", new ShootArrow());
        archer.addDefenseStrategy(new Dodge());

        // Test Output
        knight.attack();
        knight.defend();
        System.out.println("--------------------");
        wizard.attack();
        wizard.defend();
        System.out.println("--------------------");
        archer.attack();
        archer.defend();
    }
}