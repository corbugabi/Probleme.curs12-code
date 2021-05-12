package ro.fasttrackit.curs12;

public class Schedule {
    private final Month month;
    private final int day;

    public Schedule(Month month, int day){
        this.month = month;
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return day + " of " + month;
    }
}
