package com.mytest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@Component
@ConfigurationProperties(prefix = "yaml.level")
public class YamlModel {
    private String str;
    private int num;
    private double Dnum;
    private Date birth;
    private String specialStr;
    private List<String> list=new ArrayList<>();
    private Set<Integer> set=new HashSet<>();
    private Map<String,String> map=new HashMap<>();
    private int[] arr=new int[]{};
    private List<User> users=new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getSpecialStr() {
        return specialStr;
    }

    public void setSpecialStr(String specialStr) {
        this.specialStr = specialStr;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getDnum() {
        return Dnum;
    }

    public void setDnum(double dnum) {
        Dnum = dnum;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "YamlModel{" +
                "str='" + str + '\'' +
                ", num=" + num +
                ", Dnum=" + Dnum +
                ", birth=" + birth +
                ", specialStr='" + specialStr + '\'' +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", arr=" + Arrays.toString(arr) +
                ", users=" + users +
                '}';
    }
}
