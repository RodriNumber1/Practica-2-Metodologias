import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern p = Pattern.compile("\\b[\\d]{4}\\b");
        Matcher m = p.matcher((text));
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
