class Rectangle
{
    int length;
    int breadth;
}
public class shape extends Rectangle
{
    int area;
    public void calcualteArea()
    {
        area = length*breadth;
    }
    public static void main(String args[])
    {
        shape r = new shape();
        r.length = 10;
        r.breadth = 20;
        r.calcualteArea();
        System.out.println("The Area of rectangle of length "+r.length+" and breadth "+r.breadth+" is "+r.area);
    }
}
