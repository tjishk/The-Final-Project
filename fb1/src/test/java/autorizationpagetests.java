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

public class autorizationpagetests extends chromrunner {
    @Test
    public  void tests4(){
        autorizationsteps steps = new autorizationsteps();
        steps
                .Isvizible()
                .isdizableavtorn()
                .chekinsornid()
                .setvalueid("12345678910")
                .chekinsornpass()
                .setvalupassword("123123")
                .clickautorizacionbat();
    }
    @Test
    public  void tests5(){
        autorizationsteps steps = new autorizationsteps();
        steps
                .Isvizible()
                .isdizableavtorn()
                .chekinsornid()
                .Passrecbut()
                .Passrectext()
                .Idinpassrecpage()
                .Passrecidnumb("12345678910")
                .Emailradiobut();
    }
}
