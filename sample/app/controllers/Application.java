package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void add(String message,String name){
        String msg = "データを入力下さい。";
        if (request.method.equals("POST")) {
                MsgData data = new MsgData(message,name);
                data.save();
                msg = "データを保存しました。";
        }
        render(msg);
    }
    
}