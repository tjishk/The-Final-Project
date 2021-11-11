import chrome.chromrunner1;

import org.testng.annotations.Test;
import stepobjects.buysteps;


import static com.codeborne.selenide.Selenide.$;

public class buypagetests extends chromrunner1 {
    @Test

    public void test1() {
        buysteps steps = new buysteps();
        steps
                .clickbuy()
                .Cklikbuy()
                .Chekfirtssteppage()
                .setname("MIU")
                .Continp()
                .Cklikbutage()
                .setpetage("1 თვე")
                .setcolor("white")
                .Setpetvar()
                .Chang("ბიგლი")
                .clickcomtiniue();
    }
    @Test

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
