package com.aking.learn.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author yangkang
 */
@Target({ElementType.FIELD}) //声明应用在属性上
@Retention(RetentionPolicy.RUNTIME) //运行期生效
@Documented //Java Doc
@Component
public @interface Boy {
    String value() default "";
}
