import java.awt.*;

public class FLDemo extends Frame {
    Button b1,b2,b3,b4;

    FLDemo(){
        super("FlowLayout Demo");
        setLayout(new FlowLayout());

        b1 = new Button("INDIA");
        b2 = new Button("Pakistan");
        b3 = new Button("Bangladesh");
        b4 = new Button("Srilanka");

        add(b1); add(b2); add(b3); add(b4);

        setSize(400,400);
        setVisible(true);

    }

    public static void main(String args[]){
        new FLDemo();
    }
}
