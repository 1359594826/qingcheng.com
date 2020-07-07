package com.ckdl.entity;
/*
*   前台控制台查询
* */
public class ifaddgoods {
    private Integer states;   //0 表示添加失败  1 表示添加成功
    private String messige;   //
    public ifaddgoods() {
        System.out.println("添加成功");
    }

    public ifaddgoods(Integer states) {
        this.states = 1;
        System.out.println("添加失败");
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getMessige() {
        return messige;
    }

    public void setMessige(String messige) {
        this.messige = messige;
    }
}
