package stepobjects;

import pageobject.autorizationpage;

public class autorizationsteps extends autorizationpage {
    public autorizationsteps setvalueid(String personalnumber){
        personalNumber.setValue(personalnumber);
        return this;
    }
    public autorizationsteps setvalupassword(String Password){
        Password.value(Password);
        return this;
    }
    public autorizationsteps clickautorizacionbat(){
        autenterinp.click();
        return this;
    }

}
