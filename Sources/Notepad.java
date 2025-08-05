package Sources;


import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

public class Notepad {


    public static void main(String[] args) {


        DecimalFormat formatter = new DecimalFormat("#,##0");

        int data = 1000000;
        String ret = formatter.format(data);

        System.out.println(ret);

    }

}
