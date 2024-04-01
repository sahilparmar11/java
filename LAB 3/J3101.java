import java.util.Scanner;

public class J3101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();
        sc.close();
        
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1)){
                System.out.println("String is not palindrome");
            }
            else{
                System.out.println("String is Palindrome");
            }
        }
    }
    
}
