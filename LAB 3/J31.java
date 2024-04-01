import java.util.Scanner;

public class J31 {
    public static void main(String[] args) {
        System.out.println("Enter Marks Of Five Subjects :");
        Scanner sc = new Scanner(System.in);
        float C = sc.nextFloat();
        float M = sc.nextFloat();
        float P = sc.nextFloat();
        float CS = sc.nextFloat();
        float E = sc.nextFloat();
        sc.close();

        double Per = (C+M+P+CS+E)/(500)*100;
        System.out.println(Per);
        System.out.println();
        System.out.print("Student Gets :");

        if(Per>=60){
            System.out.println("First division");
        }
        else if(Per>=50){
            System.out.println("Second division");
        }
        else if(Per>=40){
            System.out.println("Third division");
        }
        else if(Per<40){
            System.out.println("Fail");
        }
                


                



    }
    
}
