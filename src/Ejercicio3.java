import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("\\b\\w.(\\w{2,}).(\\d{4})@alumnos.urjc.es\\b|\\b(\\w+).(\\w+)@urjc.es\\b");
        Matcher m = p.matcher((text));
        while(m.find()){
            if (!(m.group(1).isEmpty() && m.group(2).isEmpty())){
                System.out.println("alumno "+ m.group(1) + " matriculado en " + m.group(2));
            } else if (!(m.group(3).isEmpty() && m.group(4).isEmpty())){
                System.out.println("profesor " + m.group(3) + " " + m.group(4));
            }
        }
    }
}
