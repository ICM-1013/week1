package work;

public class Run {
    public static void main(String[] args) {
        Dish tf = new tofu();
        Dish hlb =new carrot();
        ChuZi c = new ChuZi();
        c.ChaoCai(tf);
        c.ChaoCai(hlb);
        tofu TF =(tofu)tf;
        carrot HLB=(carrot)hlb;
        c.Menu(TF);
        System.out.println("辣度:"+TF.Hot);
        c.Menu(HLB);
        System.out.println("成本:"+HLB.Cost+'元');
    }
}
