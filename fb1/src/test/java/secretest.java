import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class secretest {
    @Test
    public  void tests4(){

     WebDriverManager.chromedriver().setup();
     Selenide.open("https://online.irao.ge/ka/login");
        $(byId("submitBtn")).shouldBe(Condition.disabled);
     $(by("name","personalNumber")).setValue("33001066142");
        $(by("id","password")).setValue("123123");
         $(byId("submitBtn")).shouldBe(Condition.enabled);
         sleep(5000);

    }
}
