import java.util.Date;

public class Comment {
    int id;
    String user;
    String content;
    Date timestamp;

    public Comment(int id, String user, String content, Date timestamp) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "user=" + user +
                ", content='" + content  +
                ", timestamp=" + timestamp +
                '}';
    }


}
