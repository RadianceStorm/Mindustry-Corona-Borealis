package corona_borealis.content;

import arc.graphics.color;
import arc.struct.Seq;
import mindustry.content.*;
import mindustry.type.*;

import static mindustry.Vars.content;
import static mindustry.content.Items.*;

public class CoronaBorealisItemsLiquids {

    public static Item quartz;
    
    public static void LoadItems() {
        quartz = new Item("quartz", Color.valueOf("e0d7cc")) {{
            hardness = 1f;
            
            alwaysUnlocked = true;
        }};

        coronaborealisOnlyItems.addAll(quartz);
        coronaborealisItems.add(conoraborealisOnlyItems);
    }

}
