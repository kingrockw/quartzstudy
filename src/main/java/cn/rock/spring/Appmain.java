package cn.rock.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wjl48511 on 2017/9/24
 */
public class Appmain {
    public static void main(String []args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    }

}
