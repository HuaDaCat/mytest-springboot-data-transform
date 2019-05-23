package com.example.demo;

import com.example.demo.model.Info;
import com.example.demo.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    /**
     * Gson生成解析
     */
    @Test
    public void contextLoads() {
        User user = new User(1, "dog", "man", "11@163.com");
        Date date = new Date();
        Info info = new Info(1, "odog", date, "南京", user);
        //System.out.println(info.toString());
        Gson gson = new Gson();

        /**
         * 生成JSON
         */
        String jsonString = gson.toJson(info);
        //System.out.println(jsonString);

        /**
         * 解析JSON
         */
        String str = "{\"id\":2,\"name\":\"cat\",\"sex\":\"man\",\"email\":\"22@163.com\"}";
        User user1 = gson.fromJson(str, User.class);
        //System.out.println(user1.toString());
        String str1 = "{\"oid\":2,\"oname\":\"ocat\",\"otime\":\"May 23, 2019 10:53:33 AM\",\"oaddress\":\"南京\",\"user\":{\"id\":1,\"name\":\"dog\",\"sex\":\"man\",\"email\":\"11@163.com\"}}";
        Info info1 = gson.fromJson(str1, Info.class);
        //System.out.println(info1.toString());

    }

    /**
     * 泛型使用
     */
    @Test
    public void contextLoads1() {
        Gson gson1 = new Gson();
        String str2 = "{\"id\":3,\"name\":\"pig\",\"sex\":\"man\",\"email\":\"33@163.com\"}";
        String[] strings = gson1.fromJson(str2, String[].class);
//        List<String> stringList = gson.fromJson(str, new TypeToken<List<String>>() {
//        }.getType());
        //异常为解决
    }

    /**
     * 流式序列化
     */
    @Test
    public void contextLoads2() {
        Gson gson2 = new Gson();
        User user2 = new User(1, "dog", "man", "11@163.com");
        gson2.toJson(user2, System.out);
    }

    /**
     * 使用GsonBuilder
     */
    @Test
    public void contextLoads3() {
        Gson gson3 = new GsonBuilder().serializeNulls().create();
        //序列化null
        User user = new User(1, "dog", "man", "11@163.com");
        System.out.println(gson3.toJson(user));
    }
}

