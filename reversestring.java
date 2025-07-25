import java.util.*;
public class reversestring {
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
       String s=obj.next();
     /*   for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }*/


    /*    if(s.matches("[a-zA-Z_0-9]+")){
            System.out.print("No");

        }
        else{
            System.out.print("Yes");
        }
*/

       /* String result="";
        char[] c= s.toCharArray();
        for(int i=0;i<c.length;i++){
            char check=c[i];
            if(i==0) {
                if (check >= 'A' && check <= 'Z') {
                    check = (char) (check + 32);
                }
            }
            else {
                if (check >= 'a' && check <= 'z') {
                    check = (char) (check - 32);
                }
                result = result + check;
            }
        }

    System.out.print(result);*/


                String result = s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase();
                System.out.println(result);  // Output: hELLO



    }
}
