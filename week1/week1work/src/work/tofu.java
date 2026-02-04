package work;

public class tofu extends DishFather implements Dish {

    String Hot;
    public tofu(){
        this.Hot="微辣";
        this.setName("葱煎豆腐");
        this.setPei("盐,油,葱,豆腐");
        this.setCookTime("15分钟");
    }


    public void cook() {
        System.out.println("葱煎豆腐正在烹饪中...");
    }


    public void serve() {
        System.out.println("上葱煎豆腐!");
    }
}
