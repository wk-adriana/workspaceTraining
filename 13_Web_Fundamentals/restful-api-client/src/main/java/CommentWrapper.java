import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentWrapper {
    private LinkedHashMap<String, ArrayList<Comment>> _embedded;

    public LinkedHashMap<String, ArrayList<Comment>> get_embedded() {
        return _embedded;
    }

    public void set_embedded(LinkedHashMap<String, ArrayList<Comment>> _embedded) {
        this._embedded = _embedded;
    }
}
