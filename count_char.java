import java.util.*;
public class count_char {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.next();

        int len = str.length();
        boolean[] visited = new boolean[len]; // to mark checked characters

        System.out.println("Repeated characters are:");
        for (int i = 0; i < len; i++) {
            if (visited[i]) {
                continue; // skip if already processed
            }

            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }

            if (count > 1) {
                System.out.println(str.charAt(i) + " → " + count + " times");
            }
                }
            }
        }

