package eu.chrost.day2.s3classes.lectures;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class ImmutablePoint {
    //pole typu final jest niezmienialne po przypisaniu wartości
    //i musi być zainicjalizowane w konstruktorze lub przy deklaracji
    final private double x;
    @Getter(AccessLevel.PROTECTED)
    final private double y;

    public void print() {
        System.out.println("ImmutablePoint(" + x + ", " + y + ")");
    }

}
