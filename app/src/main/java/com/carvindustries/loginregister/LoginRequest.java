package com.carvindustries.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 6/16/17.
 */

public class LoginRequest extends StringRequest{
    //allows us to make a request to the register.php file on the server and get a response as a string

    //specify url of where register.php located
    private static final String LOGIN_REQUEST_URL = "http://carv.x10host.com/test/Login.php";

    private Map<String, String> params;

    //constructor
    public LoginRequest(String username, String password, Response.Listener<String> listener){
        //passing data to volley to process our request
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        //Param comments: we will send data to Register.php and Register.php will respond with data, URL, listener (once volley is done with request, it will inform this listener, but also needs error listener--for now null

        //to make volley pass the data (name, username, age, password) to the request, utilize params
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }


    //when the request is executed Volley will call getParams, and getParams will return params (filled with data)
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
