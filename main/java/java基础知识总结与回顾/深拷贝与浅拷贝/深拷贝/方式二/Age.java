package java基础知识总结与回顾.深拷贝与浅拷贝.深拷贝.方式二;

import java.io.Serializable;

/*
 * 创建年龄类
 */
class Age implements Serializable {
    //年龄类的成员变量（属性）
    private int age;
    //构造方法
    public Age(int age) {
        this.age=age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        return this.age+"";
    }
}