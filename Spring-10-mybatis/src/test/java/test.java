import com.jjl.Dao.UserDaoMapper;
import com.jjl.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public  void  test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //用接口来接受 体现了动态代理的思想
        UserDaoMapper userDaoMapper = context.getBean("userDaoMapper2", UserDaoMapper.class);
        User userById = userDaoMapper.getUserById(1);
        System.out.println(userById);
    }
}
