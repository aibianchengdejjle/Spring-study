import com.jjl.pojo.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        //获取Spring得上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //我们得对象现在都在Spring中管理
        Object hello = (HelloSpring)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
