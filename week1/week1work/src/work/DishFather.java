package work;

public class DishFather {
     private String Name;
    public void setName(String name){
        this.Name=name;
    }
    public void getName(){
        System.out.println("菜名:"+this.Name);
    }
    private String Pei;

    public void getPei() {
        System.out.println("配料:"+this.Pei);
    }

    public void setPei(String pei) {
        this.Pei = pei;
    }

    private String CookTime;

    public void getCookTime() {
        System.out.println("烹饪时间"+this.CookTime);
    }

    public void setCookTime(String cookTime) {
        this.CookTime = cookTime;
    }

}
