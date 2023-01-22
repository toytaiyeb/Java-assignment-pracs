import java.awt.*;

public class Card2 extends Panel {
    Card2(){
        setBackground(Color.pink);
        add(new Checkbox("India", true));
        add(new Checkbox("USA",true));
    }
}
