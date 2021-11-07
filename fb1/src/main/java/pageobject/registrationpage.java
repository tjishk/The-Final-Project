package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class registrationpage {
    protected SelenideElement
            createnewaccount =$(byText("რეგისტრაცია")),
            personalID = $(byId("personalNumber")),
            emailaddress = $(byName("email")),
            passentinp = $(byId("password")),
            pressreginp = $(byText("რეგისტრაცია"));
}
