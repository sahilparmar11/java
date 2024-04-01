import java.util.Scanner;

public class J21
{

    public static void main(String[] args){
        System.out.println("Taking Numbers From User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int a = sc.nextInt();
        System.out.print("Enter Number 2 :");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum Of Entered Numbers is :");
        System.out.print(sum);
        sc.close();
        

        
}
}
