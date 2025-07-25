public class strreverse {
    public static void main(String[] args) {
        String word = "Divakar";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i); // or use StringBuilder for better performance
        }

        System.out.println("Reversed word: " + reversed);
    }
}
