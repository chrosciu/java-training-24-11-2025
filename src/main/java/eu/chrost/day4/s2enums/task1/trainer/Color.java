package eu.chrost.day4.s2enums.task1.trainer;

public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    BLACK,
    WHITE;

    public boolean isMonochromatic() {
        return this == BLACK || this == WHITE;
    }
}