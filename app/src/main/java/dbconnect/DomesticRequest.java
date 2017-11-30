package dbconnect;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee on 2017-12-01.
 */

public class DomesticRequest extends StringRequest {

    final static private String URL = "http://10.0.2.2/domestic_travel.php";
    private Map<String, String> parameters;

    public DomesticRequest(String province, String domestic_city, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("province", province);
        parameters.put("domestic_city", domestic_city);
    }
    @Override
    public  Map<String, String> getParams() { return parameters;}
}
