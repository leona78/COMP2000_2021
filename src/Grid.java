import java.awt.Graphics;

public class Grid {
    Cell[][]c=new Cell[20][20];

    public Grid(){
        creatCell();
    }

    public void creatCell(){
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=new Cell(10+i*35, 10+j*35);
            }
        }
    }

    public void drawGrid(Graphics g){
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j].drawCell(g);
            }
        }
   }
}
