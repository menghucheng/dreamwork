/**
 * @author ：tigermeng.
 * @date ：15:32 2020/1/9
 */
package com.tiger.demofeign.factorybean;

import com.tiger.demofeign.dto.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 *
 * @author     ：tigermeng.
 * @date       ：15:32 2020/1/9
 *
 */
@Component
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User.Builder().name("mhc"+System.currentTimeMillis()).build();
    }

    @Override
    public Class<?> getObjectType() {
        Type genericSuperclass = this.getClass().getGenericInterfaces()[0];
        return (Class<?>) ((ParameterizedType)genericSuperclass).getActualTypeArguments()[0];
    }


    public static void main(String[] args) throws Exception{
        MyFactoryBean myFactoryBean = new MyFactoryBean();
        System.out.println(myFactoryBean.getObjectType());


    }





}
