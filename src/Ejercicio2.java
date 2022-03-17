import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern p = Pattern.compile("\\b(E[- ]?)?([\\d]{4}[- ]?[A-Z]{3})\\b");
        Matcher m = p.matcher(text);
        while(m.find()){
            if (m.group(1) != null){
                System.out.println(m.group(1) + m.group(2));
            } else {
                System.out.println(m.group(2));
            }
        }
    }
}
