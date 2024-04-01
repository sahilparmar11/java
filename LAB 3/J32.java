import java.util.Scanner;

public class J32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();
        System.out.println("Enter Number 3:");
        int c = sc.nextInt();
        sc.close();

        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }

        
    }
    
}
