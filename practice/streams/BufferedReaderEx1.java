package practice.streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {

    public static void main(String[] args) {


        try {
            FileReader fr = new FileReader("/Users/jako/private/git-repo/study-repo/study-java-src/practice/streams/BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                if (line.indexOf(";") != -1) {
                    System.out.println(i + ":" + line);
                }
            }
            br.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
