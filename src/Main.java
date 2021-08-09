import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
        Main window=new Main();
        
        
    }
    public class Canvas extends JPanel{
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
        Grid gr=new Grid();

        @Override
        public void paint(Graphics g){
            gr.drawGrid(g);
        }
    }
    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas= new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}

