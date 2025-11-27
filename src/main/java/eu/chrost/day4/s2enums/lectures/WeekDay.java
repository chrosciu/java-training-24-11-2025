package eu.chrost.day4.s2enums.lectures;

public enum WeekDay implements Greetable {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY {
        @Override
        public String greet() {
            return "TGIF! Today is " + this.name();
        }
    },
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    WeekDay() {
        this.isWeekend = false;
    }

    WeekDay(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    @Override
    public String greet() {
        return "Hello, today is " + this.name();
    }
}
