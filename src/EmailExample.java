import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern ;
    private Matcher matcher;
    private static final String EMAIL_ADDRESS="^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    //private static final String EMAIL_ADDRESS =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailExample(){
        pattern =Pattern.compile(EMAIL_ADDRESS);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
