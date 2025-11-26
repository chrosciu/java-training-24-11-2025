package eu.chrost.day3.s3abstract.lectures;

public class Dachshund extends Dog {
    public Dachshund(String name) {
        super(name);
    }

    // This would cause a compilation error because greet() is final in Dog
//    @Override
//    public String greet() {
//        return "Wuff! I'm a Dachshund named: " + name;
//    }
}
