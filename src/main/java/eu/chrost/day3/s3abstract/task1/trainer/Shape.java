package eu.chrost.day3.s3abstract.task1.trainer;

abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract public double getArea();

    public String getDescription() {
        return "Shape: " + name;
    }
}
