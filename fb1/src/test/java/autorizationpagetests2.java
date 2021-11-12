import chrome.Retry;


import chrome.chromrunner1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import stepobjects.autorizationsteps;
@Listeners(chrome.TestLister.class)
public class autorizationpagetests2 extends chromrunner1.chromrunner {
    @Test(retryAnalyzer= Retry.class)
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

