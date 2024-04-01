import java.util.Scanner;

class Complex{
    float real;
    float imaginary;

    Complex(){
        real = 0;
        imaginary = 0.0f;
    }

    Complex(float a,float b){
        real = a;
        imaginary = b;
    }

    public Complex addNumbers(Complex c1){
        Complex c3 = new Complex(0,0f);
        c3.real = this.real + c1.real;
        c3.imaginary = this.imaginary + c1.imaginary;

        return c3;
    }
}

public class J55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real And Imaginary Part Of Number1 :");
        Complex c1 = new Complex(sc.nextFloat(),sc.nextFloat());

        System.out.println("Enter Real And Imaginary Part Of Number2 :");
        Complex c2 = new Complex(sc.nextFloat(),sc.nextFloat());

        Complex c3 = new Complex();
        c3 = c2.addNumbers(c1); // call by c2 and pass c1 to constructor

        System.out.println("addition =" +c3.real + "+i* "+ c3.imaginary);
        sc.close();  
    }
}
