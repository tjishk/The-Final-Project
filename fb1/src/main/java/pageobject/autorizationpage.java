package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class autorizationpage {
    protected SelenideElement
            getinp = $(by("class","btn sm_profile")),
            personalNumber = $(by("name","personalNumber")),
            password = $(by("id","password")),
            autenterinp = $(byCssSelector("ავტორიზაცია"));


}
