import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
       int X,M,N,n,num,num1;
       int[] m=new int[]{0,0,0,0,0,0};
       X=15;
       M=5;
       N=6;
       n=0;
        List<Food> list =new ArrayList<Food>();
        Food food =new Food("杀猪粉",14);
        list.add(food);
        Food food1 =new Food("关东煮",16);
        list.add(food1);
        Food food2 =new Food("鸡腿饭",14);
        list.add(food2);
        Food food3 =new Food("牛肉面",15);
        list.add(food3);
        Food food4 =new Food("麻辣烫",19);
        list.add(food4);
        Food food5 =new Food("塔斯汀",16);
        list.add(food5);
        for (int i=1;i<=7;i++) {
         do {
          num = (int) (Math.random() * (6));
          num1 = (int) (Math.random() * (6));
          Food f = list.get(num);
          Food f1 = list.get(num1);
          if (m[num] < M && m[num1] < M && (n+(f.price-1)/X+(f1.price-1)/X)<=N && num!=num1) {
           n+=(f.price-1)/X+(f1.price-1)/X;
           m[num]++;
           m[num1]++;
           System.out.println("day"+i+':'+ f.Name+' '+f.price+'元'+' '+f1.Name+' '+f1.price+'元');
           break;
          } else continue;
         }while (true) ;


        }
    }
}
