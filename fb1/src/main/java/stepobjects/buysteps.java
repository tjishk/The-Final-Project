package stepobjects;

import pageobject.byupage;

public class buysteps extends byupage {
    public buysteps Getpage(){
        getpage.click();
        return this;
    }
    public buysteps clickbuy(){
        ckliktexbauton.click();
        return this;
    }
    public buysteps setname(String name){
        setname.setValue(name);
        return this;
    }
    public buysteps setpetage(int age){
        setpetage.selectOption(age);
        return this;
    }
    public buysteps setcolor(String color){
        setpetcolor.setValue(color);
        return this;
    }
    public buysteps clicksex (){
        setpetsex.click();
        return this;
    }
    public buysteps setpetvar (String petvar){
        setpetvar.selectOption(petvar);
        return this;
    }
    public buysteps clickcomtiniue (){
        ckliccomtiniue.click();
        return this;
   }
    public buysteps namegeorgia (String Namegeorgia){
        namegeorgia.setValue(Namegeorgia);
        return this;
    }
    public buysteps fmgeorg (String Fmgeorg){
        fmgeorg.setValue(Fmgeorg);
        return this;
    }
    public buysteps ownerid (String Ownerid){
        ownerid.setValue(Ownerid);
        return this;
    }

}
