public class Point3D {
    //data
    private int x;
    private int y;
    private int z;
    private static int w;
    //constracters
    public Point3D(int px,int py,int pz){
        x=px;
        y=py;
        z=pz;
    }
    public Point3D(int in){
        this(in,in,in);
    }
    public Point3D(){
        this(1,1,1);
    }
    //method
    public void move(int inX,int inY,int inZ){
        x=inX;
        y=inY;
        z=inZ;
    }

    public static void undateStaticMember(int in){
        w=in;
    }
    public String toString(){
        return "Point3D[x="+x+",y="+y+",z="+z+","+w+"]";
    }
}
