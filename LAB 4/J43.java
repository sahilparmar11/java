import java.util.Scanner;

public class J43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        int sum = 0;
        float avg = 0f;

        for(int i=0;i<4;i++){

            System.out.print("enter arr["+i+"]:");
            arr[i] = sc.nextInt();
            sum+=arr[i];
            avg=(sum)/4;

        }
        System.out.println("Sum OF Elements:"+sum);
        System.out.print("Averege of Array element :"+avg);
        
        sc.close();
    }

}

