package Sources;


import org.apache.commons.lang3.StringUtils;

public class Notepad {


    public static void main(String[] args) {


        // blank String
        String blankString = "";
        if (StringUtils.isBlank(blankString)) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }

        System.out.println("========================");

        // Trim String
        String trimStirng = " a ";
        System.out.println(trimStirng);
        System.out.println(StringUtils.trim(trimStirng));

        //  Compare String
        String compareString = "notnull";
        System.out.println(StringUtils.compare(compareString, "notnull"));

        // Equals ?
        String compareString2 = "notnull";
        System.out.println(StringUtils.equals(compareString2, "notnull")); // true
        System.out.println(StringUtils.equals(compareString2, "notnul2")); // false

    }

}
