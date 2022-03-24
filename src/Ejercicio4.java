import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern p = Pattern.compile("\\b(?:(?:Calle)|(?:C\\/)) ([A-ZÁÉÍÓÚÑ][a-zñáéíóú]+),? +(?:[Nn]º? ?)?((?:\\d)+), *(\\d{5})\\b");
        Matcher m = p.matcher((text));
        while(m.find()){
            System.out.println(m.group(3) + "-" + m.group(1) + "-" + m.group(2));
        }
    }
}
