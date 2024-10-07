import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int []arr=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(int i=0;i<=3;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<=2;j++){
            sum+=10*arr[j]+arr[j+1];
        }
        System.out.print("The sum of numbers formed by consecutive digits is:"+sum);

    }
}

