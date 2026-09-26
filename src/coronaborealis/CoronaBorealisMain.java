package coronaborealis;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import coronaborealis.content.*;

public class CoronaBorealisMain extends Mod{

    public CoronaBorealisMain(){
        Log.info("Loaded CoronaBorealisMain constructor.");
    }

    @Override
    public void loadContent(){
        Log.info("[Corona Borealis] Loading content...");
        CoronaBorealisItemsLiquids.LoadItems();
    }

}
