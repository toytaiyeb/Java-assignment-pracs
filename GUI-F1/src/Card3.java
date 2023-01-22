import java.awt.*;

public class Card3 extends Panel {
    Card3(){
        setBackground(Color.yellow);
        CheckboxGroup cbg = new CheckboxGroup();
        add(new Checkbox("India",cbg, true));
        add(new Checkbox("USA",cbg, true));
    }
}
