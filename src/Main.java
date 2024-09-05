public class Main {
    public static void main(String[] args) {

        System.out.println( 59 % 60);

        // Test cases / Validation
        getDurationString(-756545);
        getDurationString(-45,45);
        getDurationString(45,-45);
        getDurationString(546,60);

        //
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(130));
        System.out.println(getDurationString(546,50));
        System.out.println(getDurationString(645));
        System.out.println(getDurationString(500));

    }


    public static String getDurationString(int seconds){ // This method takes the seconds and finds the minutes, giving that information to the other Method.
        if (seconds < 0) {
            System.out.println("There can not be a negative amount of seconds.");
            return "";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds); //
    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0) {
            System.out.println("There can not be a negative amount of minutes.");
            return "0";
        }
        if (seconds < 0 || seconds > 59) {
            System.out.println("Seconds must be between 0 and 59.");
            return "0";
        }

        int hours = minutes / 60;
        minutes = minutes - (hours * 60);

        return (hours + "h " + minutes + "m " + seconds + "s");
    }

}
