interface Prey {
    void flee();
}

interface Predator {
    void hunt();
}

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("Rabbit flees");
    }
}

class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("Fish flees");
    }

    @Override
    public void hunt() {
        System.out.println("Fish hunts");
    }
}

class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("Hawk hunts");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Fish f = new Fish();
        Hawk h = new Hawk();

        r.flee();
        f.flee();
        f.hunt();
        h.hunt();
    }
}