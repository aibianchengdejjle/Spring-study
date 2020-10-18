import com.jjl.pojo.Address;
import com.jjl.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //Student student = (Student) context.getBean("student");
       /* System.out.println(student.getName());
        String[] book = student.getBook();
        for (String s:book
             ) {
            System.out.println(s);
        }
        //map 遍历方式
        Map<String, String> card = student.getCard();
        String s = card.get("1");
        System.out.println(s);*/
        Address address = (Address) context.getBean("address");
        System.out.println(address.getAddress());
      // System.out.println(student.toString());
    }
}
