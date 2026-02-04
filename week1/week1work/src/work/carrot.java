package work;

public class carrot extends DishFather implements Dish{
    double Cost;
    public carrot(){
        this.Cost=0.4;
        this.setName("爆炒胡萝卜");
        this.setPei("胡萝卜,盐,油");
        this.setCookTime("25分钟");
    }

    public void cook() {
        System.out.println("爆炒胡萝卜正在烹饪中...");
    }

    public void serve(){
        System.out.println("上爆炒胡萝卜!");
    }
}
