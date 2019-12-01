package First;

import First.Skill;

/**
 * 狂风绝息斩技能修饰器
 */
public class YsSkillDecorator extends SkillDecorator{
    public YsSkillDecorator(Skill decoratorSkill) {
        super(decoratorSkill);
    }

    @Override
    public void skill() {
        decoratorSkill.skill();
        effect();
    }

    public void effect(){
        System.out.println("他使出了狂风绝息斩。");
    }
}
