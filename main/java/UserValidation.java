import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public boolean firstName(String firstName) {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
    public boolean lastName(String lastName) {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }
    public boolean email(String email) {
        String emailPattern = "[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        return result;
    }
}
