import java.util.Scanner;

class Circle{
    float radius;

    void areaOfCircle(){
        double area = (3.14)*radius*radius;
        System.out.println("area = "+area);
    }  
}

public class J51{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius OF Circle");
        Circle r1 = new Circle();
        r1.radius = sc.nextFloat();
        r1.areaOfCircle();

        sc.close();


    }

}
