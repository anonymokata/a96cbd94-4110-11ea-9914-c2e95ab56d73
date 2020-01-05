public class KataPractice {
    public String getInput(String inputStartTime, String inputEndTime, String inputFamily) {
        String payStr = "0";
        if (isInteger(inputStartTime) && isInteger(inputEndTime)) {
            Integer startTimeInt = Integer.parseInt(inputStartTime);
            Integer endTimeInt = Integer.parseInt(inputEndTime);
            if (isTimeValid(startTimeInt, 1700, 400)) {
                if (isTimeValid(endTimeInt,1700,400)) {
                    if (startTimeInt <= 400) startTimeInt = startTimeInt + 2400;
                    if (endTimeInt <= 400) endTimeInt = endTimeInt + 2400;
                    if (startTimeInt < endTimeInt) {
                        Integer payInt;
                        switch (inputFamily) {
                            case "A":
                                if (startTimeInt < 2300) {
                                    if (endTimeInt < 2300 ) {
                                        payInt = (endTimeInt - startTimeInt)/100 * 15;
                                    }
                                    else {
                                        payInt = ((2300 - startTimeInt)/100 * 15) + ((endTimeInt - 2300)/100 * 20);
                                    }
                                } else {
                                    payInt = (endTimeInt - startTimeInt)/100 * 20;
                                }
                                payStr = Integer.toString(payInt);
                                break;
                            case "B":
                                break;
                            case "C":
                                break;
                            default:
                                payStr = "-1";
                        }
                    } else payStr = "-1";
                } else payStr = "-1";
            } else payStr = "-1";

        } else payStr = "-1";

        return payStr;
    }
    public static boolean isTimeValid(Integer i, Integer rangeStart, Integer rangeEnd) {
        boolean isValidTime = false;
        if (((i >= 1700) && (i <= 2400)) || ((i >= 0) && (i <= 400))) isValidTime = true;
        return isValidTime;
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
