import java.util.Scanner;

public class J47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "stream";
        sc.close();

        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    
}
