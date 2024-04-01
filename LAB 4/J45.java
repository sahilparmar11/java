import java.util.Scanner;

public class J45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();
        System.out.println( "Length of string :"+str.length());
        sc.close();

        for (int i = str.length()/2; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

    }
}
