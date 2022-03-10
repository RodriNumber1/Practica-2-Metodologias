import java.util.regex.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        String text = "En 1993 habia 21 barcos en la bahía del puerto a9200a de Barcelona.";
        Pattern p = Pattern.compile("\\b[\\d]{4}\\b");
        Matcher m = p.matcher((text));
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
