import com.jjl.ProxyInvocationHandler;
import com.jjl.pojo.Host;
import com.jjl.pojo.People;
import com.jjl.pojo.Rent;

public class test {
    public static void main(String[] args) {
        //创建一个真实的对象
        Host host=new Host();
        //创建一个代理的对象
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        pih.setTarget(host);
        //动态生成代理类
        Rent pxoxy = (Rent) pih.getProxy();
        pxoxy.rent();
    }
}
