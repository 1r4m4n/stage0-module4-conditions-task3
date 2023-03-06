package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
    int r = month / 3;
    if (r == 1) {
        System.out.println("Spring");
    }
    if (r == 2) {
        System.out.println("Summer");
    }
    if (r == 3) {
        System.out.println("Autumn");
    }
    if (month == 1 || month == 2 || month == 12) {
        System.out.println("Winter");
    }
    if (month > 12) {
        System.out.println("wrong number!");
    }
    }
}
