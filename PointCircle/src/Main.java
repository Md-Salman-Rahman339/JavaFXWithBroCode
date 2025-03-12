
class Point{
    int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Circle{
    Point center;
    double radius;
    public Circle(Point center,double radius){
        this.center=center;
        this.radius=radius;
    }

    public boolean CIC(Circle ci){
        int a=this.center.x;
        int b=this.center.y;
        int c=ci.center.x;
        int d=ci.center.y;
        double distance=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        if(distance+ci.radius<=this.radius){
            return true;
        }
        else return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Point center1=new Point(0,0);
        double radius1=10;
        Circle c1=new Circle(center1,radius1);
        Point center2=new Point(4,1);
        double radius2=4;
        Circle c2=new Circle(center2,radius2);
        if(c1.CIC(c1)){
            System.out.println("inside");
        }
        else{
            System.out.println("outside");
        }

        }
    }
