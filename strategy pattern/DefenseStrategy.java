interface DefenseStrategy {
    void defend();
}

class Shield implements DefenseStrategy {
    public void defend() { System.out.println("Using a shield to defend!"); }
}

class Dodge implements DefenseStrategy {
    public void defend() { System.out.println("Dodging to avoid attack!"); }
}

class CreateMagic implements DefenseStrategy {
    public void defend() { System.out.println("Creating a magic barrier for defense!"); }
}