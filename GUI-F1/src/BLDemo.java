import java.awt.*;

public class BLDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    TextArea ta;

    BLDemo(){
        super("BorderLayout Demo");
        setLayout(new BorderLayout());
        setBackground(Color.yellow);

        b1 = new Button("INDIA");
        b2 = new Button("Pakistan");
        b3 = new Button("Bangladesh");
        b4 = new Button("Srilanka");
        b5 = new Button("Nepal");
        ta = new TextArea();

        Panel p = new Panel();
        p.setBackground(Color.darkGray);
        p.add(b1); p.add(b5);

        add(p, BorderLayout.NORTH);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.SOUTH);
        add(ta);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){
        new BLDemo();
    }
}
