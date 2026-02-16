interface AttackStrategy {
    void attack();
}

class SwingSword implements AttackStrategy {
    public void attack() { System.out.println("Knight attacks with a sword!"); }
}

class CastSpell implements AttackStrategy {
    public void attack() { System.out.println("Wizard casts a spell!"); }
}

class ShootArrow implements AttackStrategy {
    public void attack() { System.out.println("Archer shoots an arrow!"); }
}