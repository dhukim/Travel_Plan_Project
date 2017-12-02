package dbconnect;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee on 2017-12-02.
 */

public class ViewRequest extends StringRequest {

    final static private String URL = "http://10.0.2.2/View.php";
    private Map<String, String> parameters;

    public ViewRequest(String userid, String start, String destination, String start_date, String finish_date,
                       String rooms, String course, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userid", userid);
        parameters.put("start", start);
    }
    @Override
    public  Map<String, String> getParams() { return parameters;}
}