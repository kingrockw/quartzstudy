package cn.rock.spring;

import org.springframework.stereotype.Component;

/**
 * Created by wjl48511 on 2017/9/24
 */
@Component
public class AnotherBean {

    public void printAnotherMessage() {
         System.out.println(AnotherBean.class.getName());
    }
}
