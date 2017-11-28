package dbconnect;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee on 2017-11-28.
 */

public class RegisterRequest extends StringRequest{

    final static private String URL = "http://10.0.2.2/Register.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userid, String passwd, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userid", userid);
        parameters.put("passwd", passwd);
    }
    @Override
    public  Map<String, String> getParams() { return parameters;}
}
