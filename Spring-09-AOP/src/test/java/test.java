import com.jjl.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //注意要使用接口来接受对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
