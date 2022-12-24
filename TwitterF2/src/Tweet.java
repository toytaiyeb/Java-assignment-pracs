import java.util.*;

public class Tweet {

    private String user;
    private String content;
    private int id;
    private Date timestamp;
    private ArrayList<Comment> comments;

    public Tweet(int id) {
        System.out.println("Tweet() is called");
        user = "<Anonymous>";
        content = "...";
        this.id = id ;
        timestamp = new Date();
        comments = new ArrayList<Comment>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        modifyTimestamp();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    private void modifyTimestamp() {
        timestamp = new Date();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addComment( Comment x  )
    {
        comments.add(x);
    }
    public void showComments(){
        for( Comment c : comments){
            System.out.println("\t" + c);
        }
    }

    public String toString() {
        return "Tweet{" +
                "user=" + user +
                ", content=" + getContent() +
                ", id=" + id +
                ", timestamp=" + timestamp +
                '}';
    }
}
