package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class byupage {
    protected SelenideElement
        getpage=$(by("class","btn btn-danger buyOnline")),
        ckliktexbauton=$(by("xmlns","http://www.w3.org/2000/svg")),
        setname=$(by("name","PetFirstName")),
        setpetage=$(by("name","PetAgeID")),
        setpetcolor=$(by("name","PetColor")),
        setpetsex=$(by("class","mb-0")),
        setpetvar=$(by("name","PetBreedID")),
        ckliccomtiniue=$(byXpath("/html/body/app-root/app-main-layout/app-pet/app-tell-about-your-pet/form/div/app-navigation-button/div/button[2]/span")),
        namegeorgia=$(by("name","model.nameGeo")),
        fmgeorg=$(by("name","model.surnameGeo")),
        ownerid=$(by("name","model.personalNumber"));





}
