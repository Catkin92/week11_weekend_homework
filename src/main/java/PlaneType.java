public enum PlaneType {

    BOEING747(30, 3000),
    BOEING767(40, 6000),
    BOEING787(1, 20);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
