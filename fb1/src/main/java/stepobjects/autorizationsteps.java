package stepobjects;

import com.codeborne.selenide.Condition;
import pageobject.autorizationpage;

public class autorizationsteps extends autorizationpage {
    public autorizationsteps Isvizible(){
        isvisible.shouldBe(Condition.visible);
        return this;
    }
    public autorizationsteps isdizableavtorn(){
        autenterinp.shouldBe(Condition.enabled);
        return this;
    }
    public autorizationsteps chekinsornid(){
        personalNumber.shouldBe(Condition.empty);
        return this;
    }
    public autorizationsteps setvalueid(String personalnumber){
        personalNumber.setValue(personalnumber);
        return this;
    }
    public autorizationsteps chekinsornpass(){
        password.shouldBe(Condition.empty);
        return this;
    }

    public autorizationsteps setvalupassword(String Password){
        password.setValue(Password);
        return this;
    }
    public autorizationsteps clickautorizacionbat(){
        autenterinp.click();
        return this;
    }
    public autorizationsteps Passrecbut(){
        passrecbut.click();
        return this;
    }
    public autorizationsteps Passrectext(){
        passrectext.shouldBe(Condition.visible);
        return this;
}
    public autorizationsteps Idinpassrecpage(){
        idinpassrecpage.shouldBe(Condition.empty);
        return this;
    }
    public autorizationsteps Passrecidnumb(String personalnumber){
        idinpassrecpage.setValue(personalnumber);
        return this;
    }
    public autorizationsteps Emailradiobut(){
        emailradiobut.click();
        return this;
    }
}
