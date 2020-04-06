 


public class Point extends GrObject implements ColorAble
{
    // instance variables - replace the example below with your own
    private int thickness;

    /**
     * Constructor for objects of class Point
     */
    public Point(int thickness)
    {
       this.thickness=thickness;
    }

    abstract void printToConsole();
    
}
