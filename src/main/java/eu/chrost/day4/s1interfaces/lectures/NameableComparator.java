package eu.chrost.day4.s1interfaces.lectures;

import java.util.Comparator;

public class NameableComparator implements Comparator<Nameable> {
    @Override
    public int compare(Nameable o1, Nameable o2) {
        String firstName = null;
        if (o1 != null) {
            firstName = o1.getName();
        }
        String secondName = null;
        if (o2 != null) {
            secondName = o2.getName();
        }
        if (firstName == null && secondName == null) {
            return 0;
        } else if (firstName == null) {
            return 1;
        } else if (secondName == null) {
            return -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
