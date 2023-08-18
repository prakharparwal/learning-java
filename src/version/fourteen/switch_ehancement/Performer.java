package version.fourteen.switch_ehancement;

public class Performer {

    public static void main(String[] args) {

        boolean isTodayHoliday;
        String day = "FRIDAY";

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isTodayHoliday = false;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isTodayHoliday = true;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }

        System.out.println("Today's day ("+day+") is holiday: "+isTodayHoliday);


        //Now from 14

        boolean isTodayAHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };


        System.out.println("Today's day ("+day+") is holiday: "+isTodayAHoliday);


    }
}
