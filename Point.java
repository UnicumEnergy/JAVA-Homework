 import java.awt.*; 


public class Point extends GrObject implements ColorAble
{
   private int thickness;

    /**
     * Constructor for objects of class Point
     */
    
    public Point(int thickness){
        super ( id);
        x=0;
        y=0;
        visibility=false;
    }   
  

    public void setColor(Color c){
        this.color = c;
    }
    
    public Color getColor(){
        return this.color;
        
    }
    
    void printToConsole(){
        System.out.println("blab bla");
        
    }
    
}
