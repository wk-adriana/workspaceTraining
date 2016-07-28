import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommentWebServiceClientImpl implements CommentWebServiceClient {

    private static final String BASE_API_URL = "http://localhost:8080/api/";

    private ObjectMapper objectMapper;

    public CommentWebServiceClientImpl() {
        objectMapper = new ObjectMapper();
    }

    public Comment save(Comment comment) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(BASE_API_URL + "comment");
        try {
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setEntity(new ByteArrayEntity(objectMapper.writeValueAsString(comment).getBytes()));
            httpClient.execute(httpPost);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return comment;
    }

    public Comment update(Comment comment) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPut httpPut = new HttpPut(BASE_API_URL + "comment/" + comment.getId());
        try {
            httpPut.setHeader("Content-Type", "application/json");
            httpPut.setEntity(new ByteArrayEntity(objectMapper.writeValueAsString(comment).getBytes()));
            httpClient.execute(httpPut);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return comment;
    }

    public Comment findById(Long commentId) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(BASE_API_URL + "comment/" + commentId);
        Comment comment = null;
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            comment = objectMapper.readValue(httpResponse.getEntity().getContent(), Comment.class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return comment;
    }

    public List<Comment> findAll() {
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(BASE_API_URL + "comment");
        httpGet.setHeader("content-type", "application/json");
        List<Comment> commentList = new ArrayList<Comment>();
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            CommentWrapper commentWrapper = objectMapper.readValue(httpResponse.getEntity().getContent(), CommentWrapper.class);
            commentList = commentWrapper.get_embedded().get("comment");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return commentList;
    }

    public void delete(Long commentId) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpDelete httpDelete = new HttpDelete(BASE_API_URL + "comment/" + commentId);
        try {
            httpClient.execute(httpDelete);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
