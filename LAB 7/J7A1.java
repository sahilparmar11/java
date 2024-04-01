// The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that 
// demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a 
// vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the 
// name of vegetable and its color.

abstract class Vegetable{
    String name_of_vegetable;
    String color_of_vegetable;

    abstract public String toString();
}

class Potato extends Vegetable{

    public String toString(){
        name_of_vegetable = "Potato";
        color_of_vegetable = "yellow";
        return "Name: "+ name_of_vegetable + " color: " + color_of_vegetable;
    }
}

class Brinjal extends Vegetable{

    public String toString(){
        name_of_vegetable = "Brinjal";
        color_of_vegetable = "Purple";
        return "Name: "+ name_of_vegetable + " color: " + color_of_vegetable;
    }
}

class Tomato extends Vegetable{

    public String toString(){
        name_of_vegetable = "Tomato";
        color_of_vegetable = "Red";
        return "Name: "+ name_of_vegetable + " color: " + color_of_vegetable;
    }
}

public class J7A1 {
    public static void main(String[] args) {

        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();

        System.out.println(p.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());

        


        
    }
    
}
