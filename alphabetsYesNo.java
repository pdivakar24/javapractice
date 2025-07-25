import java.util.*;
public class alphabetsYesNo {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                if (input.matches("[a-zA-Z]+")) {
                    System.out.println(" alphabets are there");
                } else {
                    System.out.println(" no-alphabet ");
                }

        }

    }

