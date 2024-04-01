import java.util.Scanner;

public class J44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();

        int [] arr = new int [n];
        
        System.out.println("Array in order :");
        for(int i=0;i<arr.length;i++){
        
            arr[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order :");

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        sc.close();

    }
    
}
