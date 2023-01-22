import java.awt.*;
public class Card4 extends Panel {
    Card4(){
        setBackground(Color.lightGray);
        Choice ch = new Choice();
        ch.addItem("Jan");ch.addItem("Feb");ch.addItem("Mar");
        add(ch);
    }
}
