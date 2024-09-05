public class Main {
    public static void main(String[] args) {


        // Test cases / Validation
//        getDurationString(-756545);
//        getDurationString(-45,45);
//        getDurationString(45,-45);

        System.out.println(getDurationString(60));
        System.out.println(getDurationString(45684));
        System.out.println(getDurationString(546,50));
        System.out.println(getDurationString(645));
        System.out.println(getDurationString(500));

    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            System.out.println("There can not be a negative amount of seconds.");
            return "0";
        }

        int minutes = seconds / 60;
        seconds = seconds - (minutes * 60);

        return getDurationString(minutes,seconds);
    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0) {
            System.out.println("There can not be a negative amount of minutes.");
            return "0";
        }
        if (seconds < 0 || seconds > 60) {
            System.out.println("Seconds must be between 0 and 59.");
            return "0";
        }

        int hours = minutes / 60;
        minutes = minutes - (hours * 60);

        return (hours + "h " + minutes + " m " + seconds + " s");
    }

}
