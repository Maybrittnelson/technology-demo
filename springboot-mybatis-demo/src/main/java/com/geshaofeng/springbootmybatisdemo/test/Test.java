package com.geshaofeng.springbootmybatisdemo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        //事实证明null也能向下转型
        MyTypeHandler cast = MyTypeHandler.class.cast(null);

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add(null);
   /*     List<String> collect = list.stream()
                .map(e -> e)
                .filter(e -> e != null && !e.isEmpty())
                .collect(Collectors.toList());
        System.out.print(collect);*/

        list.stream()
                .forEach(e -> {if(e != null){

                }});
        System.out.print(list);

        list.removeAll(Collections.singleton(null));

/*        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("dddd");
        //只留下长度等于3的，也就是ccc，其他都过滤掉，不要
        List<String> stream=list.stream().filter(action->{
            if(action.length()==3){
                return true;
            }else{
                return false;
            }
        }).collect(Collectors.toList());*/
        //stream中只有一个ccc
        System.out.println(list);


    }




}
