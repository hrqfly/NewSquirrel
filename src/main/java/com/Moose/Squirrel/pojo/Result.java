package com.Moose.squirrel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Integer status; //200，400，404...
    private String msg;
    private Object data;

    public static Result ok(){
        return new Result(200,null,null);
    }

    public static Result ok(Object data){
        return new Result(200,null,data);
    }

    public static Result ok(String msg){
        return new Result(200,msg,null);
    }

    public static Result error(String msg){
        return new Result(400,msg,null);
    }
}
