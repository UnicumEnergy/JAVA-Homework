
 
import java.awt.*; 


/**
 * Abstract class GrObject - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class GrObject
{
    // instance variables - replace the example below with your own
    int     x,y,id;
    boolean visibility;
    Color color;
    
    ///////////////
    //constructors
    ///////////////
    
    public GrObject(int id){
        this.id=id;
        x=0;
        y=0;
        visibility=false;
    }
    
    public GrObject(int id,int x,int y, boolean visibility){
        this.id=id;
        this.x=x;
        this.y=y;
        this.visibility=visibility;
    }
    
    ///////////////
    //getters
    ///////////////
    
    public int getID(){
        return id;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public boolean getVisible(){
        return visibility;
    }
        
    abstract void printToConsole();
    
    /////////////////
    //settters
    /////////////////
    
    public void setID(int ID){
        this.id=id;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public void isVisible(boolean visibility){
        this.visibility=visibility;
    }
    
    public void move(int dx,int dy){
        this.x+=dx;
        this.y+=dy;
    }
         
    
}
