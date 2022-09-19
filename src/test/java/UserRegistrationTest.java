import com.UserRegistration.BridgeLabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void ValidFirstname() {
        boolean result = userRegistration.firstName("Snehal");
        Assertions.assertTrue(result);
    }

    @Test
    public void ValidLastname() {

        boolean result = userRegistration.lastName("Nanavare");
        Assertions.assertTrue(result);
    }
    @Test
    public void ValidEmailId() {

        boolean result = userRegistration.email_ID("Snehal12@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void ValidMobileNumber() {

        boolean result = userRegistration.mobileNum("7757825585");
        Assertions.assertTrue(result);
    }

    @Test
    public void ValidPassword() {

        boolean result = userRegistration.password("Snehal@123");
        Assertions.assertTrue(result);
    }


}