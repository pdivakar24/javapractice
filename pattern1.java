public class pattern1 {
    public static void main(String[] args){
        int n = 6;  // Use number of rows instead of fixed 12

        for(int i = 1; i <= n; i++){
            // Print spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print("  "); // 2 spaces
            }

            // Print increasing numbers from 1 to i
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            // Print decreasing numbers from i-1 to 1
            for(int j = i - 1; j >= 1; j--){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}