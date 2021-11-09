package stepobjects;

import pageobject.registrationpage;

public class registrationsteps extends registrationpage {
    public registrationsteps getpage(){
        getpersonalpage.click();
        return this;
    }
    public registrationsteps clickregbuton () {
        createnewaccount.click();
        return this;
    }

    public registrationsteps setidnumber (String PersonalID) {
        personalID.setValue(PersonalID);
        return this;
    }

    public registrationsteps setemailaddress(String Loginemail) {

        emailaddress.setValue(Loginemail);
        return this;
    }

    public registrationsteps setpassword(String password) {
        passentinp.setValue(password);
        return this;
    }

    public registrationsteps clickregiostratiobbut() {
        pressreginp.click();
        return this;

    }
}
