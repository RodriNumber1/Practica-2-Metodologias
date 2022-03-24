import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("\\w\\.(\\w{2,})\\.(\\d{4})@alumnos\\.urjc\\.es|(\\w+)\\.(\\w+)@urjc\\.es");
        Matcher m = p.matcher((text));
        while(m.find()){
            if (!(m.group(1) == null && m.group(2) == null)){
                System.out.println("alumno "+ m.group(1) + " matriculado en " + m.group(2));
            } else {
                System.out.println("profesor " + m.group(3) + " apellido " + m.group(4));
            }
        }
    }
}
