public enum PlaneType {
    BOEING747(150, 1000),
    BOEING737(130, 900),
    AIRBUS320(120, 800);

    private final int capacity;
    private final int totalWeight;


    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
