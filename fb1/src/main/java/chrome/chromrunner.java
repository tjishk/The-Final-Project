package chrome;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class chromrunner {

    @BeforeTest
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://online.irao.ge/ka/login");
    }
 @AfterTest
    public static void clear(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
 }

 }

