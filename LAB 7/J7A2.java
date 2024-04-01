// Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2. Interface A12 inherits from both 
// A1 and A2.Each interface declares one constant and one method. Class B implements A12.Instantiate B and invoke each of 
// its methods. Each method displays one of the constants

interface A{
    int a = 11;
    void display_A();

}
interface A1 extends A{
    int b = 22;
    void display_A1();
}
interface A2 extends A{
    int c = 33;
    void display_A2();
}

interface A12 extends A1,A2{
    int d = 44;
    void display_A();
}

class B implements A12{

    public void display_A(){
        System.out.println("Integer of Interface A: "+a);
    }
    public void display_A1(){
        System.out.println("Integer of Interface A1: "+b);
    }
    public void display_A2(){
        System.out.println("Integer of Interface A2: "+c);
    }
    public void display_A12(){
        System.out.println("Integer of Interface: "+d);
    }
}

public class J7A2 {
    public static void main(String[] args) {

        B b1 = new B();
        b1.display_A();        
        b1.display_A1();        
        b1.display_A2();        
        b1.display_A12();        



    }
    
}
