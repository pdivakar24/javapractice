import java.util.*;
import java.time.*;
public class yearcalculator {
    public static void main(String[] args){
        int a =Year.now().getValue();
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter birth year:");
        int b=obj.nextInt();

        System.out.print("Age "+ (a-b));

    }
}
