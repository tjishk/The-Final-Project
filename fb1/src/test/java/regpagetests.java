import chrome.chromrunner1;

import org.testng.annotations.Test;
import stepobjects.registrationsteps;


import static com.codeborne.selenide.Selenide.$;

public class regpagetests extends chromrunner1.chromrunner {

    @Test
    public void test2(){
        registrationsteps steps = new registrationsteps();
        steps

                .clickregbuton()
                .inregpage()
                .Isemptyperidvalue()
                .setidnumber("33001066142")
                .Isemptyemailvalue()
                .setemailaddress("tinatinjishkariani88@gmail.com")
                .Isemptypassvalue()
                .setpassword("123456")
                .clickregiostratiobbut();
    }
    @Test
    public void test7(){
        registrationsteps steps = new registrationsteps();
        steps
                .clickregbuton()
                .inregpage()
                .seenornottextargakvspolisi()
                .Seenornottextsheidzineonlain()
                .Seenornottextregistracia()
                .Seenornottextid()
                .Seenornottextmail()
                .Seenornotpasstext()
                .Languagechangebutclick()
                .Seenornottextengbybuy()
                .Seenornottextbuyonline()
                .Seenornottextpersonalnumber()
                .Seenornottextemlaileng()
                .SeenornotPasswordeng();


}
}
