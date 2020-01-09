/**
 * @author ：tigermeng.
 * @date ：15:32 2020/1/9
 */
package com.tiger.demofeign.dto;

/**
 * @author ：tigermeng.
 * @date ：15:32 2020/1/9
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class Builder{
        User user;

        public Builder(){
            user = new User();
        }
        public Builder name(String name){
            user.name = name;
            return this;
        }

        public User build(){
            return user;
        }
    }
}
