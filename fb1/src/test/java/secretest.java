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


       // $(byId("submitBtn")).shouldBe(Condition.disabled);
       // $(by("name","personalNumber")).setValue("33001066142");
        //$(by("id","password")).setValue("123123");
        // $(byId("submitBtn")).shouldBe(Condition.enabled);
         //sleep(5000);
         //Selenide.open("https://online.irao.ge/ka/login");
        // sleep(3000);
      //  $(byText("რეგისტრაცია")).click();
        //sleep(5000);
       // $(byId("personalNumber")).setValue("33001066142");
        //$(byName("email")).setValue("tjishk@gmail.com");
        //$(byId("password")).setValue("paroli");
       // $(byText("რეგისტრაცია"));
       // sleep(677);


}}
