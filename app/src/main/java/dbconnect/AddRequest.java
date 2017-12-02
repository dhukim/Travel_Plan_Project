package dbconnect;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee on 2017-12-02.
 */

public class AddRequest extends StringRequest {

    final static private String URL = "http://10.0.2.2/Add.php";
    private Map<String, String> parameters;

    public AddRequest(String userid, String start, String destination, String start_date, String finish_date, String rooms, String course, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userid", userid);
        parameters.put("start", start);
        parameters.put("destination", destination);
        parameters.put("start_date", start_date);
        parameters.put("finish_date", finish_date);
        parameters.put("rooms", rooms);
        parameters.put("course", course);
    }
    @Override
    public  Map<String, String> getParams() { return parameters;}
}
