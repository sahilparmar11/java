import java.util.Scanner;

public class J33 {
    public static void main(String[] args) {
        System.out.print("Enter A Integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=2,count=0;
        sc.close();

        while(i<=n/2){
            if(n % i ==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
