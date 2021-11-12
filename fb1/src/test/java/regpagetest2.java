
import chrome.Retry;
import chrome.chromrunner1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import stepobjects.registrationsteps;


import static com.codeborne.selenide.Selenide.$;
@Listeners(chrome.TestLister.class)
public class regpagetest2 extends chromrunner1.chromrunner {
    @Test(retryAnalyzer= Retry.class)
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