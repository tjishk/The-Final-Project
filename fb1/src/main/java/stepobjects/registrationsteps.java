package stepobjects;

import dataobject.registrationdata;
import pageobject.registrationpage;

public class registrationsteps extends registrationpage {
    public registrationsteps clickregbuton () {
        createnewaccount.click();
        return this;
    }

    public registrationsteps setID(String PersonalID) {
        personalID.setValue(PersonalID);
        return this;
    }

    public registrationsteps setemailaddress(String emailaddress) {
        registrationdata.mail.setValue(emailaddress);
        return this;
    }

    public registrationsteps setpassword(String password) {
        password.setValue(password);
        return this;
    }

    public autorizationsteps clickregiostratiobbut() {
        autenterinp.click();
        return this;

    }
}
