package com.yizhifu.springboot.config;

import com.yizhifu.springboot.entity.Student;
import com.yizhifu.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Component <bean>
//@Controller @Service @Repository
//这四个注解的作用是一样的，下边三个不一样主要是为了要区分不同的层


@Configuration
//@Configuration 用于定义配置类，可以替换xml配置文件
//加了这个注解的类的内部包含一个或多个被@Bean注解的方法
//用来完成拦截器配置等代码配置
public class WebConfigurer implements WebMvcConfigurer {
    //这个方法用来配置拦截器，写的拦截器需要在这里配置才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login", "/user/getLoginPage", "/user/logout","/static/**");
        // ddPathPatterns /**表示拦截所有的请求   excludePathPatterns 代表排除哪些请求不能被拦截
        // /user/getLoginPge 表示通过转发访问登录界面  static文件夹下的静态资源也不应该被拦截
    }

    /*@Bean
    public LoginInterceptor getLoginInterceptor(){
        return new LoginInterceptor();
    }*/

    @Bean
    public Student createStudent(){
        Student student = new Student(1,"zhangsna",22,"nv");
        return  student;
    }
    //等价于<bean name="student" class="com.yizhifu.springboot.entity.Student"/>
}
