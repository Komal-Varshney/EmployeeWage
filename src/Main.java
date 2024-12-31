//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Komal", 125);
        Random r = new Random();
        int i = (r.nextInt(1000))%3;
        switch(i){
            case 1 -> e1.attendance(true);
            case 2 ->
            {
                e1.attendance(true);
                System.out.println("Part time");
                e1.normalWorkday = 4;
            }
            default -> e1.attendance(false);
        }
        e1.calculateWage();
    }

}