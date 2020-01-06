public class KataPractice {
    public String getInput(String inputStartTime, String inputEndTime, String inputFamily) {
        String payStr;
        if (!isInteger(inputStartTime)) return "Invalid Start Time";
        if (!isInteger(inputEndTime)) return "Invalid End Time";
        Integer startTimeInt = Integer.parseInt(inputStartTime);
        Integer endTimeInt = Integer.parseInt(inputEndTime);
        if (!isTimeValid(startTimeInt, 1700, 400)) return "Start Time must be between 1700 and 0400";
        if (!isTimeValid(endTimeInt,1700,400)) return "End Time must be between 1700 and 0400";
        if (startTimeInt <= 400) startTimeInt = startTimeInt + 2400;
        if (endTimeInt <= 400) endTimeInt = endTimeInt + 2400;
        if (startTimeInt >= endTimeInt) return "Start Time must be before End Time";
        Integer payInt;
        switch (inputFamily) {
            case "A":
            case "a":
                if (startTimeInt < 2300) {
                    if (endTimeInt < 2300 ) {
                        payInt = (endTimeInt - startTimeInt)/100 * 15;
                    } else {
                        payInt = ((2300 - startTimeInt)/100 * 15) + ((endTimeInt - 2300)/100 * 20);
                    }
                } else {
                    payInt = (endTimeInt - startTimeInt)/100 * 20;
                }
                payStr = Integer.toString(payInt);
                break;
            case "B":
            case "b":
                if (startTimeInt < 2200) {
                    if (endTimeInt < 2200) {
                        payInt = (endTimeInt - startTimeInt)/100 * 12;
                    } else if (endTimeInt <= 2400) {
                        payInt = ((2200 - startTimeInt)/100 * 12) + ((endTimeInt - 2200)/100 * 8);
                    } else {
                        payInt = ((2200 - startTimeInt)/100 * 12) + 16 + ((endTimeInt - 2400)/100 * 16);
                    }
                } else if (startTimeInt <= 2400) {
                    if (endTimeInt <= 2400) {
                        payInt = (endTimeInt - startTimeInt)/100 * 8;
                    } else {
                        payInt = ((2400 - startTimeInt)/100 * 8) + ((endTimeInt - 2400)/100 * 16);
                    }
                } else {
                    payInt = (endTimeInt - startTimeInt)/100 * 16;
                }
                payStr = Integer.toString(payInt);
                break;
            case "C":
            case "c":
                if (startTimeInt < 2100) {
                    if (endTimeInt < 2100 ) {
                        payInt = (endTimeInt - startTimeInt)/100 * 21;
                    }
                    else {
                        payInt = ((2100 - startTimeInt)/100 * 21) + ((endTimeInt - 2100)/100 * 15);
                    }
                } else {
                    payInt = (endTimeInt - startTimeInt)/100 * 15;
                }
                payStr = Integer.toString(payInt);
                break;
            default:
                payStr = "Family must be A, B, or C";
        }
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
