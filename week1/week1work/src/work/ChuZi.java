package work;

public class ChuZi {
        public void ChaoCai(Dish Cai){
            Cai.cook();
            Cai.serve();
        }
        public void Menu(DishFather cai){
            cai.getName();
            cai.getPei();
            cai.getCookTime();
        }

}
