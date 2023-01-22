import java.awt.*;

public class MyFirstWindow extends Frame {

    Label lbl1;
    Button b1;
    MyFirstWindow(){
        setLayout(new FlowLayout(FlowLayout.RIGHT));
       // setBackground(Color.yellow);

        lbl1 = new Label("Hello World of GUI !!!");
        lbl1.setAlignment(Label.CENTER);
      //  lbl1.setBackground(Color.blue);

        b1 = new Button("OK");

        add(lbl1);
        add(b1);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){
        new MyFirstWindow();
    }
}
