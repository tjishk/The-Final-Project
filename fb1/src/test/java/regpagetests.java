import chrome.chromrunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import stepobjects.autorizationsteps;
import stepobjects.buysteps;
import stepobjects.registrationsteps;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static dataobject.autorizationdata.Password;
import static dataobject.autorizationdata.personalNumber;

public class regpagetests extends chromrunner {

    @Test
    public void test2(){
        registrationsteps steps = new registrationsteps();
        steps

                .clickregbuton()
                .setidnumber("33001066142")
                .setemailaddress("tinatinjishkariani88@gmail.com")
                .setpassword("123456")
                .clickregiostratiobbut();
    }
}