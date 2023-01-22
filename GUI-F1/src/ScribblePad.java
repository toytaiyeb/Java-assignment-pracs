import java.awt.*;
import java.awt.event.*;

public class ScribblePad extends Frame {
    Label status;
    int x,y;
    ScribblePad(){
        super("Scribble Pad v0.1 ");
        status = new Label("Scribble Pad started...");
        add(status,BorderLayout.SOUTH);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y= e.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //super.mouseDragged(e);
                Graphics g = getGraphics();
                g.drawLine(x,y,e.getX(),e.getY());
                x=e.getX();  y = e.getY();
            }
        });

        setSize(400,400);
        setVisible(true);
    }



    public static void main(String args[]){
        new ScribblePad();
    }
}
