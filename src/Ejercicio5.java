import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern p = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2} +[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3} +([A-ZÑ]+) +[0-9]{7} +--- +\\[([a-zA-Z0-9]+)\\]" +
                " +(?:[a-z]+\\.)*([A-Za-z]+) +: +(.+)");
        Matcher m = p.matcher((text));
        while(m.find()){
            System.out.println("\"" +m.group(1)+ "\",\"" +m.group(2)+ "\",\"" +m.group(3)+ "\",\"" +m.group(4)+ "\"");
        }
    }
}
