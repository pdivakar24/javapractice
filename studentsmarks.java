import java.util.*;
public class studentsmarks {
    public static void main(String[] args){
        Scanner obj =new Scanner (System.in);
        System.out.print("Enter how many subjects:");
        int n=obj.nextInt();
        int sum=0,avg=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int num :arr){
            sum=sum+num;
        }
        System.out.println("Total marks : "+sum);
        System.out.println("Avg marks : "+((float)sum/n));
        if(avg >50){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
