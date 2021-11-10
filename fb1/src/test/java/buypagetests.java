import chrome.chromrunner1;
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

public class buypagetests extends chromrunner1 {
    @Test

    public void test1(){
        buysteps steps = new buysteps();
        steps
                .clickbuy()
                .Cklikbuy()
                .setname("MIU")
                .Continp()
                .Cklikbutage()
                .setpetage("1 თვე")
                .setcolor("white")
                .Setpetvar()
                .Chang("ბიგლი")
                .clickcomtiniue();
            }

}
