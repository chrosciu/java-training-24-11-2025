package eu.chrost.day3.s2inheritance.task1.trainer;

public class Car extends Vehicle {    
    private final int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", seats=" + seats + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + seats;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (seats != other.seats)
            return false;
        return true;
    }


    

  

    

    

    
}
