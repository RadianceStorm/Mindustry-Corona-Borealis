package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class CoronaBorealisMod extends Mod{

    public CoronaBorealisMod(){
        Log.info("Loaded CoronaBorealisMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Corona Borealis Mod import successful!");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'corona-borealis' in its config)
                dialog.cont.image(Core.atlas.find("corona-borealis-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some Corona Borealis content.");
    }

}
