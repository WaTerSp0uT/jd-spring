import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {
        //FullTimeMentor fullTime = new FullTimeMentor();
        //MentorAccount mentor = new MentorAccount(fullTime);
        //mentor.manageAccount();
        PartTimeMentor parTime = new PartTimeMentor();
        MentorAccount mentor = new MentorAccount(parTime);
        mentor.manageAccount();
    }
}
