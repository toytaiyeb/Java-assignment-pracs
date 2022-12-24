import java.util.Date;
public class Driver {

    public static void main(String [] args){

        Wall wall = new Wall();

        Tweet myfirsttweet = new Tweet(100);
        myfirsttweet.setContent("Hello Twitter !!!");
        Tweet t2 = new Tweet(101);

        wall.addTweet(myfirsttweet);
        wall.addTweet(t2);
        wall.display();

        Comment c1 = new Comment(91, "Asif", "Nice",
                                    new Date());
        Comment c2 = new Comment(91, "Rahul", "Shameless",
                new Date());
        t2.addComment(c1);
        t2.addComment(c2);

        wall.display();




    }
}
