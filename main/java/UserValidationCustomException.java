import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationCustomException {
    public void firstName() throws CustomException {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result == false)
            throw new CustomException("Invalid first name");
         else
            System.out.println("First Name is valid");
    }

    public void lastName() throws CustomException {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if (result == false)
            throw new CustomException("Invalid last name");
        else
            System.out.println("last Name is valid");
    }

    public void email() throws CustomException {
        String emailPattern = "[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();

        if (result == false)
            throw new CustomException("Invalid Email");
        else
            System.out.println("Email is valid");
    }

    public void mobileNumber() throws CustomException {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-){1}[0-9]{10}";
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.next();
        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        Boolean result = matcher.matches();

        if (result == false)
            throw new CustomException("Invalid mobile number");
        else
            System.out.println("mobile number is valid");
    }

    public void password() throws CustomException{
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&])[a-zA-Z0-9@#$%^&+=]{8,}$";
        System.out.println("Enter Password");
        String passWord = scanner.next();
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();

        if (result == false)
            throw new CustomException("Invalid Password");
        else
            System.out.println("Password is valid");
    }
}






