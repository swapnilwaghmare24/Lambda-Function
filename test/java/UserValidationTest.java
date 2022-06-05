import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_Matches_ShouldReturnTrue() {
        UserValidation uservalidation=new UserValidation();
        boolean result=uservalidation.firstName("Swapnil");
        Assert.assertEquals("Firstname",true,result);
    }
    @Test
    public void givenLastName_Matches_ShouldReturnTrue() {
        UserValidation uservalidation=new UserValidation();
        boolean result=uservalidation.lastName("Waghmare");
        Assert.assertEquals("Lastname",true,result);
    }
    @Test
    public void givenEmail_Matches_ShouldReturnTrue() {
        UserValidation uservalidation=new UserValidation();
        boolean result=uservalidation.email("swapnil@gmail.com");
        Assert.assertEquals("Email",true,result);

    }
    @Test
    public void givenPhoneNumber_Matches_ShouldReturnTrue() {
        UserValidation uservalidation=new UserValidation();
        boolean result=uservalidation.mobileNumber("91-8977654786");
        Assert.assertEquals("Phone Number",true,result);
    }
    @Test
    public void givenPassword_Matches_ShouldReturnTrue() {
        UserValidation uservalidation=new UserValidation();
        boolean result=uservalidation.password("Kj@5jh0o");
        Assert.assertEquals("Password",true,result);
    }
}
