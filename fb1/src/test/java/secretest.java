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

public class secretest extends chromrunner {

    @Test
    public  void tests4(){
        autorizationsteps steps = new autorizationsteps();
        steps
                .getpage()
                .setvalueid(personalNumber)
                .setvalupassword(Password)
                .clickautorizacionbat();
}
    @Test
    public void test2(){
        registrationsteps steps = new registrationsteps();
        steps
                        .getpage()
                         .clickregbuton()
                        .setidnumber("33001066142")
                        .setemailaddress("tinatin.jishkariani@irao.ge")
                        .setpassword("123456")
                        .clickregiostratiobbut();
    }
    @Test

      public void test1(){
        buysteps steps = new buysteps();
        steps
                .Getpage()
                .clickbuy()
                .setname("MIU")
                .setpetage('1')
                .setcolor("white")
                .clicksex()
                .clickcomtiniue()
                .namegeorgia("თინათინ")
                .fmgeorg("ჯიშკარიანი")
                .ownerid("12345678910");



    }

}
