/**
 * Created by IntelliJ IDEA.
 * User: 殷俊
 * Date: 2024/4/22
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
package com.hznu.pojo;

public class User {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
}
