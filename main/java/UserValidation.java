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
    public boolean mobileNumber(String phoneNumber) {
        String MobileNumberPattern = "(91-){1}[0-9]{10}";
        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        Boolean result = matcher.matches();
        return result;
    }
    public boolean password(String passWord) {
        String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&])[a-zA-Z0-9@#$%^&]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    public static void main(String[] args) {
        /*UserValidationCustomException userValidationCustomException=new UserValidationCustomException();
        try {
            userValidationCustomException.firstName();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.lastName();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.email();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.mobileNumber();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.password();
        } catch (CustomException e) {
            System.out.println(e);
        }*/
        LabdaFunctionInterface firstName=(fname)->{
            Pattern pattern=Pattern.compile("[A-Z]{1}[a-z]{2,}");
            Matcher matcher=pattern.matcher(fname);
            boolean result=matcher.matches();
            return result;
        };
        boolean validResult=firstName.isValidUserEntry("Swapnil");
        System.out.println("Firstname match="+validResult);

        LabdaFunctionInterface lastName=(lname)->{
            Pattern pattern=Pattern.compile("[A-Z]{1}[a-z]{2,}");
            Matcher matcher=pattern.matcher(lname);
            boolean result=matcher.matches();
            return result;
        };
        boolean validResult1=lastName.isValidUserEntry("Waghmare");
        System.out.println("Lastname match="+validResult1);

        LabdaFunctionInterface email=(mail)->{
            Pattern pattern=Pattern.compile("[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*");
            Matcher matcher=pattern.matcher(mail);
            boolean result=matcher.matches();
            return result;
        };
        boolean validResult2=email.isValidUserEntry("swapnil@gmail.com");
        System.out.println("Email match="+validResult2);

        LabdaFunctionInterface mobileNumber=(mnumber)->{
            Pattern pattern=Pattern.compile("(91-){1}[0-9]{10}");
            Matcher matcher=pattern.matcher(mnumber);
            boolean result=matcher.matches();
            return result;
        };
        boolean validResult3=mobileNumber.isValidUserEntry("91-3344556677");
        System.out.println("Mobile number match="+validResult3);

        LabdaFunctionInterface password=(pword)->{
            Pattern pattern=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&])[a-zA-Z0-9@#$%^&]{8,}$");
            Matcher matcher=pattern.matcher(pword);
            boolean result=matcher.matches();
            return result;
        };
        boolean validResult4=password.isValidUserEntry("Abcdef@rhn5");
        System.out.println("Password match="+validResult4);
    }
}

