package sample.Behaviors;

public enum Behaviors {
    Herbaceous(1),
    Predator(2);
    int id;
    Behaviors(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
