import iterfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
//        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");
//        mentor.createAccount();
//
//        Mentor mentor1 = (Mentor) container.getBean("partTimeMentor");
//        mentor1.createAccount();

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor1 = container.getBean("partTimeMentor", Mentor.class);
        mentor1.createAccount();

        //Test Case # 1
    }
}
