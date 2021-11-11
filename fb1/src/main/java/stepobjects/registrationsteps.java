package stepobjects;

import com.codeborne.selenide.Condition;
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

    public registrationsteps Isemptyperidvalue () {
        personalID.shouldBe(Condition.empty);
        return this;
    }

    public registrationsteps setidnumber (String PersonalID) {
        personalID.setValue(PersonalID);
        return this;
    }
    public registrationsteps Isemptyemailvalue () {
        emailaddress.shouldBe(Condition.empty);
        return this;
    }
    public registrationsteps setemailaddress(String Loginemail) {

        emailaddress.setValue(Loginemail);
        return this;
    }
    public registrationsteps Isemptypassvalue () {
        passentinp.shouldBe(Condition.empty);
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
    public registrationsteps inregpage(){
        pressreginp.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps seenornottextargakvspolisi(){
        seenornottextargakvspolisi.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextsheidzineonlain(){
        seenornottextsheidzineonlain.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextregistracia(){
        seenornottext.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextid(){
        seenornottextid.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextmail(){
        seenornottextmail.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornotpasstext(){
        seenornotpasstext.shouldBe(Condition.visible);
        return this;
}
    public registrationsteps Languagechangebutclick(){
        languagechangebut.click();
        return this;
    }
    public registrationsteps Seenornottextengbybuy(){
        seenornottextengbybuy.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextbuyonline(){
        seenornottextbuyonline.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextpersonalnumber(){
        seenornottextpersonalnumber.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps Seenornottextemlaileng(){
        seenornottextemlaileng.shouldBe(Condition.visible);
        return this;
    }
    public registrationsteps SeenornotPasswordeng(){
        seenornotPasswordeng.shouldBe(Condition.visible);
        return this;

    }
}
