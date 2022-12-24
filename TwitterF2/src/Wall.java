import java.util.ArrayList;
public class Wall {
    ArrayList<Tweet> tweets;
    Wall(){
        tweets = new ArrayList<Tweet>();
    }
    public void addTweet(Tweet t1){
        tweets.add(t1);
    }

    public void deleteTweet( int id ){
        for( Tweet x : tweets) {
            if (x.getId() == id) {
                tweets.remove(x);
                break;
            }
        }
    }
    public void display() {
        for( Tweet x : tweets){
             System.out.println("\n"+x);
             x.showComments();

        }
    }
}
