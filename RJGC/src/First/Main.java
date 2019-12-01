package First;


import First.YsSkillDecorator;
import First.Yasuo;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------原始-------------");

        Yasuo yasuo = new Yasuo("疾风剑豪",100,100);
        System.out.println(yasuo);
        System.out.println("---------不加修饰-------------");

        yasuo.skill();
        System.out.println(yasuo);
        System.out.println("----------修饰------------");

        YsSkillDecorator ysSkillDecorator = new YsSkillDecorator(yasuo);

        ysSkillDecorator.skill();
        System.out.println(yasuo);
    }
}
