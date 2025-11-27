package eu.chrost.day4.s1interfaces.lectures;

public sealed interface ExtraNameable extends Nameable permits Employee {
    String DEFAULT_FULL_NAME = "Unknown";

    default String getFullName() {
        return DEFAULT_FULL_NAME;
    }
}
