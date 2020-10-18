import com.jjl.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
  @Test
    public  void test(){
      ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
      User user = (User) context.getBean("user");

      System.out.println( user.getName());
  }
}
