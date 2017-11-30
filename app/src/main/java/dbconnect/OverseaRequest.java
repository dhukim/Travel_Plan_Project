package dbconnect;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee on 2017-12-01.
 */

public class OverseaRequest extends StringRequest {

    final static private String URL = "http://10.0.2.2/oversea_travel.php";
    private Map<String, String> parameters;

    public OverseaRequest(String country, String oversea_city, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("country", country);
        parameters.put("oversea_city", oversea_city);
    }
    @Override
    public  Map<String, String> getParams() { return parameters;}
}
