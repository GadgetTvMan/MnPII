package gadgettvman.github.io.MnPII;

import java.util.Random;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.meta.FireworkMeta;


class MnPIIBlockBreakListener implements Listener {
    private final MnPII plugin;
    public MnPIIBlockBreakListener(MnPII instance) {
        this.plugin = instance;
    }
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) throws Exception{
        Player player = event.getPlayer();
        Random generator = new Random();
        if (player.hasPermission("MnPII.FUN")){
            if(event.getBlock().getType() == Material.MELON_BLOCK || event.getBlock().getType() == Material.PUMPKIN){
                int randInt = generator.nextInt(18) + 1;
                if(randInt == 1){
                    //Spawn the Firework, get the FireworkMeta.
                FireworkExplosionEffect fplayer = new FireworkExplosionEffect();
            
           
                //Our random generator
                Random r = new Random();   
 
                //Get the type
                int rt = r.nextInt(5) + 1;
                Type type = Type.BALL;       
                if (rt == 1) type = Type.BALL;
                if (rt == 2) type = Type.BALL_LARGE;
                if (rt == 3) type = Type.BURST;
                if (rt == 4) type = Type.CREEPER;
                if (rt == 5) type = Type.STAR;
           
                //Get our random colours   
                int rc1 = r.nextInt(17) + 1;
                int rc2 = r.nextInt(17) + 1;
                Color c1 = null;
                Color c2 = null;

                switch(rc1){
                    case(1):
                        c1=Color.AQUA;
                        break;
                    case(2):
                        c1=Color.BLACK;
                        break;
                    case(3):
                        c1=Color.BLUE;
                        break;
                    case(4):
                        c1=Color.FUCHSIA;
                        break;
                    case(5):
                        c1=Color.GRAY;
                        break;
                    case(6):
                        c1=Color.GREEN;
                        break;
                    case(7):
                        c1=Color.LIME;
                        break;
                    case(8):
                        c1=Color.MAROON;
                        break;
                    case(9):
                        c1=Color.NAVY;
                        break;
                    case(10):
                        c1=Color.OLIVE;
                        break;
                    case(11):
                        c1=Color.ORANGE;
                        break;
                    case(12):
                        c1=Color.PURPLE;
                        break;
                    case(13):
                        c1=Color.RED;
                        break;
                    case(14):
                        c1=Color.SILVER;
                        break;
                    case(15):
                        c1=Color.TEAL;
                        break;
                    case(16):
                        c1=Color.WHITE;
                        break;
                    case(17):
                        c1=Color.YELLOW;
                        break;
                }
                switch(rc2){
                    case(1):
                        c2=Color.AQUA;
                        break;
                    case(2):
                        c2=Color.BLACK;
                        break;
                    case(3):
                        c2=Color.BLUE;
                        break;
                    case(4):
                        c2=Color.FUCHSIA;
                        break;
                    case(5):
                        c2=Color.GRAY;
                        break;
                    case(6):
                        c2=Color.GREEN;
                        break;
                    case(7):
                        c2=Color.LIME;
                        break;
                    case(8):
                        c2=Color.MAROON;
                        break;
                    case(9):
                        c2=Color.NAVY;
                        break;
                    case(10):
                        c2=Color.OLIVE;
                        break;
                    case(11):
                        c2=Color.ORANGE;
                        break;
                    case(12):
                        c2=Color.PURPLE;
                        break;
                    case(13):
                        c2=Color.RED;
                        break;
                    case(14):
                        c2=Color.SILVER;
                        break;
                    case(15):
                        c2=Color.TEAL;
                        break;
                    case(16):
                        c2=Color.WHITE;
                        break;
                    case(17):
                        c2=Color.YELLOW;
                        break;
                }
           
                //Create our effect with this
                FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withFade(c2).with(type).trail(r.nextBoolean()).build();

                fplayer.playFirework(event.getBlock().getWorld(), event.getBlock().getLocation(), effect);
                }
            }
        }
    }
}