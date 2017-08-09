package com.cc.json;

import com.cc.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */
public class GsonUtils {

    private final static Type type = new TypeToken<ArrayList<User>>(){}.getType();
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String string = "[{'name':'cc','age':'20'},{'name':'dd','age':'30'}]";
        List<User> users = gson.fromJson(string, type);

        for (User u:users){
            System.out.println(u.getName()+" "+u.getAge());
        }
    }
}
