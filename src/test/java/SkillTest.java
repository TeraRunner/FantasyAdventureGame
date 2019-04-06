import Characters.Skills.Skill;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkillTest {

    Skill skill;

    @Before
    public void setup() {
        skill = new Skill("Double Edge");
    }

    @Test
    public void getSkillTest() {
        assertEquals("Double Edge", skill.getSkillName());
    }

    @Test
    public void setSkillTest() {
        skill.setSkillName("Triple Edge");
        assertEquals("Triple Edge", skill.getSkillName());
    }

}

