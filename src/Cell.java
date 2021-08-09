import java.awt.Graphics;
public class Cell {
    public int height;
    public int width;
    public static int s=35;

    public Cell(int h,int w){
        height=h;
        width=w;
    }
    public void drawCell(Graphics g){
        g.drawRect(height, width, s, s);
    }
}
