package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class registrationpage {
    protected SelenideElement
            getpersonalpage = $(by("class","btn sm_profile")),
            createnewaccount =$(byText("რეგისტრაცია")),
            personalID = $(byId("personalNumber")),
            emailaddress = $(byName("email")),
            passentinp = $(byId("password")),
            pressreginp = $(byText("რეგისტრაცია")),
            seenornottextargakvspolisi=$(byText("არ გაქვს აქტიური პოლისი?")),
            seenornottextsheidzineonlain=$(byText("შეიძინე ონლაინ")),
            seenornottext=$(byText("რეგისტრაცია")),
            seenornottextid=$(byText("პირადი ნომერი")),
            seenornottextmail=$(byText("ელ.ფოსტა")),
            seenornotpasstext=$(byText("პაროლი")),
            languagechangebut=$(by("class","switcher eng round")),
            seenornottextengbybuy=$(byText("Do not have an active policy?")),
            seenornottextbuyonline=$(byText("Buy Online")),
            seenornottextpersonalnumber=$(byText("Personal number")),
            seenornottextemlaileng=$(byText("Email")),
            seenornotPasswordeng=$(byText("Password"));


}
