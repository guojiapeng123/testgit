package First;


import First.Compoent;
import First.Skill;

/**
 * 创建实现skill接口的抽象装饰类
 */
public abstract class SkillDecorator implements Skill, Compoent {
    protected Skill decoratorSkill;

    public SkillDecorator() {
    }

    public SkillDecorator(Skill decoratorSkill) {
        this.decoratorSkill = decoratorSkill;
    }

    public void skill(){
        decoratorSkill.skill();
    }}