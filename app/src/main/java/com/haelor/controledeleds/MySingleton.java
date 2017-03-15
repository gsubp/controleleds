package com.haelor.controledeleds;

/**
 * Created by dgssa on 15/12/2016.
 */

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class MySingleton {

    private static MySingleton mInstanse;
    private RequestQueue requestQueue;
    private static Context context;

    private MySingleton(Context context){
        this.context = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if (requestQueue==null){
            requestQueue = Volley.newRequestQueue(this.context.getApplicationContext());
        }
        return requestQueue;
    }


    public static synchronized MySingleton getInstanse(Context context){

        if(mInstanse==null){
            mInstanse = new MySingleton(context);
        }
        return mInstanse;
    }

    public <T>void addToRequestque(Request<T> request){
        requestQueue.add(request);
    }


}

