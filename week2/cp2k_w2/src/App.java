import java.awt.Point;

public class App {
    public static void main(String[] args) throws Exception {
        Point p1= new Point();
        Point p2= new Point(3,4);
        Point3D p3= new Point3D();
        p3.move(7,8,9);
        p1.move(1, 2);
        Point3D p4 =new Point3D(4,5,6);
        //System.out.println(p1);
        //System.out.println(p2);
        Point3D.undateStaticMember(11);
        System.out.println(p3);
        System.out.println(p4);
        Point3D p5=new Point3D(5);
        System.out.println(p5);
        int a=5;
        int b=0;
        //int c=a/b;
        //System.out.println(Point3D.w);
        
    }
}
