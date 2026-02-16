import java.util.ArrayList;
import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies = new ArrayList<>();

    public Character(String type, AttackStrategy attackStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
    }

    public void addDefenseStrategy(DefenseStrategy strategy) {
        this.defenseStrategies.add(strategy);
    }

    public void attack() {
        System.out.print(type + ": ");
        attackStrategy.attack();
    }

    public void defend() {
        System.out.println(type + " is defending:");
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}