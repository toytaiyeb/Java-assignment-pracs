import java.util.Date;

public class Driver {

    public static void main(String args[]){
        Feed wall = new Feed();

        Tweet myfirsttweet = new Tweet();
        myfirsttweet.setContent("Hello Twitter World!!! ");

        Tweet t2 = new Tweet();
        t2.setContent("Asif Here");

        wall.addTweet(myfirsttweet);
        wall.addTweet(t2);
        wall.display();

        System.out.println("Adding Comment ");
        Comment c1 = new Comment("Welcome","ASIF",
                                    new Date());
        Comment c2 = new Comment("Thanks for joining","Annon",
                new Date());
        myfirsttweet.addComment(c1);
        c1.addComment(c2);
        wall.display();

    }

}
