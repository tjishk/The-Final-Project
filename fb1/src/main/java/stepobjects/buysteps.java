package stepobjects;

import pageobject.byupage;

public class buysteps extends byupage {


    public buysteps clickbuy(){
        ckliktexbauton.click();
        return this;
    }
    public buysteps Cklikbuy(){
        cklikbuy.click();
        return this;
    }
    public buysteps setname(String name){
        setname.setValue(name);
        return this;
    }
    public buysteps Continp(){
        continp.click();
        return this;
    }
    public buysteps Cklikbutage(){
        cklikagebuton.click();
        return this;
    }
    public buysteps setpetage(String age){
        setpetage.selectOption(age);
        return this;
    }
    public buysteps setcolor(String color){
        setpetcolor.setValue(color);
        return this;
    }


    public buysteps Setpetvar (){
        setpetvar.click();
        return this;
    }
    public buysteps Chang(String brand){
        change.selectOption(brand);
        return this;
    }
    public buysteps clickcomtiniue (){
        ckliccomtiniue.click();
        return this;
   }


}
