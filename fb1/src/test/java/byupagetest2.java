import chrome.Retry;
import chrome.chromrunner1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import stepobjects.buysteps;


import static com.codeborne.selenide.Selenide.$;
@Listeners(chrome.TestLister.class)
public class byupagetest2 extends chromrunner1 {
    @Test(retryAnalyzer= Retry.class)

    public void test6() {
        buysteps steps = new buysteps();
        steps
                .clickbuy()
                .Cklikbuy()
                .Chekfirtssteppage()
                .Continp()
                .Chekerormesfirstst()
                .setname("MIU")
                .Continp()
                .setcoloringclick()
                .setpetage("1 თვე")
                .TextcollisNecessary();

    }
}

