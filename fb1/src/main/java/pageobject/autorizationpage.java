package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class autorizationpage {
    protected SelenideElement
            personalNumber = $(by("name","personalNumber")),
            password = $(by("id","password")),
            autenterinp = $(byCssSelector("ავტორიზაცია"));


}
