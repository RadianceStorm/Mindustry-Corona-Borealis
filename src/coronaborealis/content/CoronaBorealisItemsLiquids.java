package coronaborealis.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.content.*;
import mindustry.type.*;

import static mindustry.Vars.content;
import static mindustry.content.Items.*;

public class CoronaBorealisItemsLiquids {

    public static Item coronite, quartz, basalt, citrine, azurite;
    // public static Seq<Item> coronaborealisOnlyItems = new Seq<>(), coronaborealisItems = new Seq<>();
    public static Liquid starblood, vesper;
    
    public static void LoadItems() {
        coronite = new Item("coronite", Color.valueOf("907196")) {{
            hardness = 1;
            
            alwaysUnlocked = true;
        }};
        quartz = new Item("quartz", Color.valueOf("e0d7cc")) {{
            hardness = 1;
            
        }};
        basalt = new Item("basalt", Color.valueOf("282937")) {{
            hardness = 1;
            
        }};
        citrine = new Item("citrine", Color.valueOf("e38d34")) {{
            hardness = 2;
            
        }};
        azurite = new Item("azurite", Color.valueOf("2525ee")) {{
            hardness = 2;
            
        }};


        //coronaborealisOnlyItems.addAll(quartz);
        //coronaborealisItems.add(conoraborealisOnlyItems);
    }

    public static void LoadLiquids() {
        starblood = new Liquid("starblood", Color.valueOf("ff0000")) {{
            viscosity = 0.65f;
            temperature = 0.6f;
            explosiveness = 0f;
            flammability = 0f;
            heatCapacity = 0.4f;
        }};
        vesper = new Liquid("vesper", Color.valueOf("0000ff")) {{
            viscosity = 0.4f;
            temperature = 0.35f;
            explosiveness = 1f;
            flammability = 1f;
            heatCapacity = 0f;
            //effect = CoronaBorealisStatusEffects.flammable;
            //canStayOn.addAll(Liquids.water, Liquids.arkycite, starblood);
        }};
    }

}
