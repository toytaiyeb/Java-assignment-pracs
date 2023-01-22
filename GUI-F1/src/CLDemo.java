import java.awt.*;
import java.awt.event.*;

public class CLDemo extends Frame implements ActionListener {
    Panel deck;
    Button next, prev;
    CardLayout cl;
    CLDemo(){
        super("CardLayout Demo");

        cl = new CardLayout();

        deck = new Panel();
        deck.setLayout( cl );

        deck.add(new Card1(), "King");
        deck.add(new Card2(), "Queen");
        deck.add(new Card3(), "Jack");
        deck.add(new Card4(), "Ace");

        add(deck);

        next = new Button("NEXT >> ");
        prev = new Button(" << PREVIOUS");
        add(next, BorderLayout.EAST);
        add(prev , BorderLayout.WEST);

        next.addActionListener(this);
        prev.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next) cl.next(deck);
        else cl.previous(deck);
    }

    public static void main(String args[]){
        new CLDemo();
    }
}
