package eu.chrost.day2.s4records.task1.trainer;

record Car(String brand, String model, int year) {

    public Car(String brand, String model) {
        this(brand, model, 2000);
    }

    public Car() {
        this("Unknown", "Unknown");
    }

    public boolean isOlderThan(int year) {
        return this.year < year;
    }
}
