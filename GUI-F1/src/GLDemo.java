import java.awt.*;

public class GLDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    TextArea ta;

    GLDemo(){
        super("GridLayout Demo");
        setLayout(new GridLayout(3,2,30,20));
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

        add(p);
        add(b2);
        add(b3);
        add(b4);
        add(ta);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){
        new GLDemo();
    }
}
