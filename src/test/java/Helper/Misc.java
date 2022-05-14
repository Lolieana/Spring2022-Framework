package Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Misc {


    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getCurrentDateAsInt() {
        Date currDate = new Date();
        SimpleDateFormat onlyDate = new SimpleDateFormat("d");
        return Integer.parseInt(onlyDate.format(currDate));
    }

    /*
        remove degreeSign and fetch tempValue as int
     */
    public static int removeDegreeAndGetTempAsInt(String tempText) {
        tempText = tempText.split("˚")[0];
        // tempText = tempText.substring(0, tempText.length()-1);
        return Integer.valueOf(tempText);
    }

    /*
        convert fTemp into cTemp
     */
    public static int convertFTempIntoCTemp(int fTemp) {
        /**
         * Convert deg-Fahrenheit into Deg-Celsius (F -> C)
         */
        double cTempUsingFTemp = (fTemp - 32.0) * 5/9;
        return (int) Math.round(cTempUsingFTemp);
    }


}
