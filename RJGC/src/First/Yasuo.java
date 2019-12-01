package First;


/**
 * 疾风剑豪
 */
public class Yasuo implements Skill{
    private String name;
    private double attack;
    private double defence;

    public Yasuo() {
    }

    public Yasuo(String name, double attack, double defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Yasuo{" +
                "name=" + name +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }

    @Override
    public void skill() {
        this.attack += 100;
        this.defence += 100;
        System.out.println("死亡如风，常伴吾身");
    }
}
