package ro.fasttrackit.curs12;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(Month.APR,10);
        System.out.println(schedule);

        Month month = schedule.getMonth();
        System.out.println("The " + month.getNumber() + " month in the year");
    }
}
