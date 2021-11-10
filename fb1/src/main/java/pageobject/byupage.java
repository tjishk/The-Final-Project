package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class byupage {
    protected SelenideElement

        ckliktexbauton=$(by("class","categoryListItemDetails catalogListItemHighlight")),
        cklikbuy=$(by("class","buyItem")),
        setname=$(by("name","PetFirstName")),
        continp=$(by("class","Icon IconWhite IconExtraSmall")),
        cklikagebuton=$(by("name","PetAgeID")),
        setpetage=$(by("name","PetAgeID")),
        setpetcolor=$(by("name","PetColor")),
        setpetvar=$(by("name","PetBreedID")),
        change=$(by("name","PetBreedID")),
        ckliccomtiniue=$(byXpath("/html/body/app-root/app-main-layout/app-pet/app-tell-about-your-pet/form/div/app-navigation-button/div/button[2]/span"));






}
