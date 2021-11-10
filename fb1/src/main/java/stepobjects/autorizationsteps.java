package stepobjects;

import com.codeborne.selenide.Condition;
import pageobject.autorizationpage;

public class autorizationsteps extends autorizationpage {
    public autorizationsteps Isvizible(){
        isvisible.shouldBe(Condition.visible);
        return this;
    }
    public autorizationsteps Isnotvizible(){
        isnotvisible.shouldBe(Condition.disabled);
        return this;
    }
    public autorizationsteps setvalueid(String personalnumber){
        personalNumber.setValue(personalnumber);
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

}
