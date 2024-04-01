// Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener along with 
// mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), 
// mouseDragged() methods. Also create KeyListener interface which 
// inherits EventListener along with keyPressed(), keyReleased() 
// methods. WAP to create EventDemo class which implements 
// MouseListener and KeyListener and demonstrate all the methods of 
// the interfaces.

interface EventListener{
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
     public void keyPressed();
     public void keyReleased();
}

class EventDemo implements MouseListener, KeyListener{

    public void performEvent(){
    System.out.println("performEvent method is called");        
    }
    public void mouseClicked(){
        System.out.println("mouseClicked method is called");
    }
    public void mousePressed(){
        System.out.println("mousePressed method is called");
    }
    public void mouseReleased(){
        System.out.println("mouseReleased method is called");
    }
    public void mouseMoved(){
        System.out.println("mouseMoved method is called");
    }
    public void mouseDragged(){
        System.out.println("mouseDragged method is called");
    }
    public void keyPressed(){
        System.out.println("keyPressed method is called");
    }
    public void keyReleased(){
        System.out.println("keyReleased method is called");
    }
}


public class J7B4 {
    public static void main(String[] args) {
        EventDemo E = new EventDemo();
        E.performEvent();
        E.mouseClicked();
        E.mousePressed();
        E.mouseMoved();
        E.mouseDragged();
        E.keyPressed();
        E.keyReleased();
    }
    
}
