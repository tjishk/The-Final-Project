import chrome.chromrunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import stepobjects.autorizationsteps;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static dataobject.autorizationdata.Password;
import static dataobject.autorizationdata.personalNumber;

public class secretest extends chromrunner {
    @Test
    public  void tests4(){
        autorizationsteps steps = new autorizationsteps();
        steps
                .setvalueid(personalNumber)
                .setvalupassword(Password)
                .clickautorizacionbat();

}

}
