import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WebServiceTester {

    public static void main(String[] args) {
        CommentWebServiceClientImpl commentWebServiceClient = new CommentWebServiceClientImpl();

        // Test find method
        Comment comment = commentWebServiceClient.findById(2L);
        System.out.println(comment);

        // Test findAll method
        List<Comment> commentList = commentWebServiceClient.findAll();
        Iterator<Comment> iterator = commentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Test delete method
        commentWebServiceClient.delete(3L);

        // Test save method
        commentWebServiceClient.save(new Comment("b", "b@email.com", "text", Calendar.getInstance().getTime()));

        // Test update method
        comment.setId(2);
        comment.setName("Adriana");
        commentWebServiceClient.update(comment);
    }
}
