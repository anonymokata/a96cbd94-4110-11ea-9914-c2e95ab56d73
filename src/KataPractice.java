public class KataPractice {
    public String getInput(String inputStartTime, String inputEndTime, String inputFamily) {
        if (isInteger(inputStartTime)) {
            Integer startTimeInt = Integer.parseInt(inputStartTime);
            if (startTimeInt < 1700) {
                return "-1";
            }
        } else {
            return "-1";
        }

        return "0";
    }
    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);
            // s is a valid integer
            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            // s is not an integer
        }
        return isValidInteger;
    }
}
