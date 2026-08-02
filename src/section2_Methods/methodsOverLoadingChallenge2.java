package section2_Methods;

public class methodsOverLoadingChallenge2 {
    public static void main(String[] args) {

        System.out.println(getDurationString(5489));
        System.out.println(getDurationString(546, 48));

    }

    public static String getDurationString(int seconds) {

        if  (seconds < 0) {
            return "Invalid data for seconds";
        }

        int minutes = seconds / 60;
        int remainingSecond = seconds % 60;
        return getDurationString(minutes, remainingSecond);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid data for minutes or seconds";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return (hours + "h " + remainingMinutes + "m " + seconds + "s");
    }

}
