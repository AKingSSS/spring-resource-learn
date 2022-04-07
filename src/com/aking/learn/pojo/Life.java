package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class Life {
    public Life() {
        System.out.println("第一步：执行无参构造函数");
    }

    private Long timeStamp;

    public void setTimeStamp(Long timeStamp) {
        System.out.println("第二步：执行set函数");
        this.timeStamp = timeStamp;
    }

    public void initMethod() {
        System.out.println("第三步：执行init方法");
    }

    public void destroyMethod() {
        System.out.println("第五步：执行destroy方法");
    }

    @Override
    public String toString() {
        return "Life{" + "timeStamp=" + timeStamp + '}';
    }
}
