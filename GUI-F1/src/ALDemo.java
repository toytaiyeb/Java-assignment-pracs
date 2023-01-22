import java.awt.*;
import java.awt.event.*;

public class ALDemo extends Frame implements ActionListener {
    Label l1,l2,l3;
    TextField un, pw;
    Button b1,b2;
    ALDemo(){
        super("Login Screen");
        setLayout(new FlowLayout());

        l1= new Label("Username:");
        l2= new Label("Password:");
        l3= new Label("Enter username & password");
        un = new TextField(20);
        pw = new TextField(20);
        pw.setEchoChar('*');
        b1 = new Button("Login");
        b2 = new Button("Reset");

        add(l1); add(un);
        add(l2); add(pw);
        add(b1); add(b2); add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(450,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            un.setText("");     pw.setText("");
            l3.setText("Enter username & password");
        }
        else {
            if (un.getText().equals("Asif") && pw.getText().equals("Vsit"))
                l3.setText("Login successful...");
            else
                l3.setText("Login error...");
        }
    }

    public static void main(String args[]){
        new ALDemo();
    }

}
