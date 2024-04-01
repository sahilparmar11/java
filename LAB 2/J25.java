import java.util.Scanner;

public class J25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in m Fahrenheit :");
        float F = sc.nextFloat();
        float C = F-32*5/9f;
        System.out.println(C);
        sc.close();;
        
    }
    
}
