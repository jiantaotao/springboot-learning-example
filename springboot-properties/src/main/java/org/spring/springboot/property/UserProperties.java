package org.spring.springboot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by bysocket on 20/04/2017.
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    /**
     * 用户 ID
     */
    private int id;

    /**
     * 年龄
     */
    private int age;

    /**
     * 用户名称
     */
    private String work;

    /**
     * 用户 UUID
     */
    private String uuid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    @Override
    public String toString() {
        return "UserProperties{" +
                "id=" + id +
                ", age=" + age +
                ", desc='" + work + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
