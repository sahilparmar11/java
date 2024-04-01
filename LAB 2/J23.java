import java.util.Scanner;

public class J23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String :");
        char op = (sc.nextLine()).charAt(0);
        
        System.out.println("Enter Number 1 :");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 :");
        int b = sc.nextInt();
        
        
        if(op == '+'){
            System.out.println("Addition:"+(a+b));
        }
        else if(op == '-'){
            System.out.println("Subtraction:"+(a-b));
        }
        else if(op == '*'){
            System.out.println("Multiplication:"+(a*b));
        }
        else if(op == '/'){
            while(b==0){
                System.out.print("Enter Valid b(expect 0) :");
                b = sc.nextInt();
            }
            System.out.println("Division:"+(a/b));
        }
        else if(op == '%'){
            System.out.println("Modulous Devision:"+(a-b));
        }
        sc.close();
    }
    
}
