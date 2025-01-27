package com.telepathicgrunt.repurposedstructures.configs;


import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;

import java.util.Map;


public class RSAllowDisallowOmegaConfig implements Config {

    @Override
    public String getName() {
        return "repurposed_structures-fabric/biome_dimension_allow_disallow_configs";
    }

    @Override
    public String getExtension() {
        return "json5";
    }

    @Override
    public void save() {

        if(configVersion == 1){
            addEntries(disallowedBiomes, "repurposed_structures:dungeons_neutral_ocean", "terrestria:lush_desert");
            addEntries(disallowedBiomes, "repurposed_structures:dungeons_lukewarm_ocean", "terrestria:lush_desert");
            addEntries(disallowedBiomes, "repurposed_structures:dungeons_frozen_ocean", "terrestria:lush_desert");
            addEntries(disallowedBiomes, "repurposed_structures:dungeons_cold_ocean", "terrestria:lush_desert");
            addEntries(disallowedBiomes, "repurposed_structures:dungeons_warm_ocean", "terrestria:lush_desert");
        }

        configVersion = 2;
        Config.super.save();
    }

    private void addEntries(Map<String, String> map, String key, String entry){
        // assign entry
        if(map.putIfAbsent(key, entry) != null && !map.get(key).contains(entry)){
            map.put(key, map.get(key) + ", " + entry); // append entry
        }
    }

    private void removeEntries(Map<String, String> map, String key, String entry){
        if(map.containsKey(key) && map.get(key).contains(entry)){
            String newEntry = map.get(key)
                    .replace(entry+", ", "")
                    .replace(entry+",", "")
                    .replace(entry, "");

            if(newEntry.isEmpty()){
                map.remove(key);
            }
            else{
                map.put(key, newEntry);
            }
        }
    }



    @Comment("""





            // In the key part, specify the name of the structures or configuredfeatures from
            // Repurposed Structures that you want to affect. Then in the value part, add the identifiers
            // or regex for the dimension that you want Repurposed Structures stuff to NOT spawn in.
            
            // Separate multiple entries with a comma.
            // Example usage (the actual config entry to edit are the lines not starting with // further down):
            //  "disallowedDimensions": {
            //    "repurposed_structures:village_birch": "minecraft:overworld, awesome_mod:.+"
            //  }
            
            // In this example, no Birch village will spawn in the overworld because we specified that dimension's identifier.
            // Then the village will not spawn in any of awesome_mod's dimension because "awesome_mod:.+" is regex that will
            // match all dimensions that starts with "awesome_mod:" in their identifier. Powerful stuff!
            
            // Use "all" as the key to affect all of RS's structures and configuredfeatures.
            // You can find dimension identifiers by doing "/execute in" command in game.
            // All of RS's structure identifiers can be found by doing "/locate" command in game.
            // RS's dungeons and wells identifiers can be found here on GitHub:
            //  https://github.com/TelepathicGrunt/RepurposedStructures-Fabric/blob/7f8021cbc073c9919fa0b08dc3b746f9a0e854af/src/main/java/com/telepathicgrunt/repurposedstructures/modinit/RSConfiguredFeatures.java#L268-L290
            """)
    public final Map<String, String> disallowedDimensions = Map.of(
            "all", "the_bumblezone:the_bumblezone, the_aether:the_aether, agape:.+"
    );

    @Comment("""





            // RS's Structures and ConfiguredFeatures has default settings of what dimensions they are added to.
            // This allowedDimensions config is for adding them to more dimension or for overriding disallowedDimensions config.
            // NOTE: A Structure or ConfiguredFeature must be added to both the dimension and to the biomes in the dimension to spawn.
            
            // In the key part, specify the name of the structures or configuredfeatures from
            // Repurposed Structures that you want to affect. Then in the value part, add the identifiers
            // or regex for the dimension that you want Repurposed Structures stuff to ALWAYS spawn in.
            
            // Separate multiple entries with a comma.
            // Example usage (the actual config entry to edit are the lines not starting with // further down):
            //  "allowedDimensions": {
            //    "repurposed_structures:stronghold_nether": "minecraft:overworld, firey_realms:.+"
            //  },
             
            // In this example, Nether Strongholds will spawn in the overworld because we specified that dimension's identifier.
            // Then the Nether Strongholds will also spawn in any of awesome_mod's dimension because "firey_realms:.+" is regex that will
            // match all dimensions that starts with "firey_realms:" in their identifier. Powerful stuff!
            
            // Use "all" as the key to affect all of RS's structures and configuredfeatures.
            // You can find dimension identifiers by doing "/execute in" command in game.
            // All of RS's structure identifiers can be found by doing "/locate" command in game.
            // RS's dungeons and wells identifiers can be found here on GitHub:
            //  https://github.com/TelepathicGrunt/RepurposedStructures-Fabric/blob/7f8021cbc073c9919fa0b08dc3b746f9a0e854af/src/main/java/com/telepathicgrunt/repurposedstructures/modinit/RSConfiguredFeatures.java#L268-L290
            """)
    public final Map<String, String> allowedDimensions = Map.of();

    @Comment("""





            // RS's Structures and ConfiguredFeatures has default settings of what biomes they are added to.
            // This disallowedBiomes config is for overriding that internal default setting.
            
            // In the key part, specify the name of the structures or configuredfeatures from
            // Repurposed Structures that you want to affect. Then in the value part, add the identifiers
            // or regex for the biomes that you want Repurposed Structures stuff to NOT spawn in.
            // You can also do biome categories as well by doing #swamp to remove from all swamp category biomes.
            
            // Separate multiple entries with a comma.
            // Example usage (the actual config entry to edit are the lines not starting with // further down):
            //  "disallowedBiomes": {
            //    "repurposed_structures:bastion_underground": "minecraft:flower_forest, peaceful_lands:.+, #mushroom"
            //  }
            
            // In this example, Underground Bastions are remvoed from Flower Forest biome because we specified that biomes's identifier.
            // Then the Underground Bastions will also be removed from all of peaceful_lands's biomes because "peaceful_lands:.+" is regex
            // that will match all biomes that starts with "peaceful_lands:" in their identifier. Powerful stuff!
            // Then it will remove the Underground Bastions from all mushroom category biomes including both modded and vanilla's.
            
            // Use "all" as the key to affect all of RS's structures and configuredfeatures.
            // You can find biome identifiers by doing "/locatebiome" command in game.
            // All of RS's structure identifiers can be found by doing "/locate" command in game.
            // RS's dungeons and wells identifiers can be found here on GitHub:
            //  https://github.com/TelepathicGrunt/RepurposedStructures-Fabric/blob/7f8021cbc073c9919fa0b08dc3b746f9a0e854af/src/main/java/com/telepathicgrunt/repurposedstructures/modinit/RSConfiguredFeatures.java#L268-L290
            """)
    public final Map<String, String> disallowedBiomes = Map.of();

    @Comment("""





            // RS's Structures and ConfiguredFeatures has default settings of what biomes they are added to.
            // This allowedBiomes config is for adding them to more biomes or for overriding disallowedBiomes config.
            // NOTE: A Structure or ConfiguredFeature must be added to both the dimension and to the biomes in the dimension to spawn.
            
            // In the key part, specify the name of the structures or configuredfeatures from
            // Repurposed Structures that you want to affect. Then in the value part, add the identifiers
            // or regex for the biomes that you want Repurposed Structures stuff to ALWAYS spawn in.
            // You can also do biome categories as well by doing #forest to add to all forest category biomes.
            
            // Separate multiple entries with a comma.
            // Example usage (the actual config entry to edit are the lines not starting with // further down):
            //  "allowedBiomes": {
            //    "repurposed_structures:mansion_taiga": "minecraft:badlands, fantasy_overworld:.+, #desert"
            //  }
            
            // In this example, Taiga Mansions will spawn in the one Badlands biome because we specified that biomes's identifier.
            // Then the Taiga Mansions will also spawn in all of fantasy_overworld's biomes because "fantasy_overworld:.+" is regex
            // that will match all biomes that starts with "fantasy_overworld:" in their identifier. Powerful stuff!
            // Then it will add the Taiga Mansion to all Desert category biomes including both modded and vanilla's.
            
            // Use "all" as the key to affect all of RS's structures and configuredfeatures.
            // You can find biome identifiers by doing "/locatebiome" command in game.
            // All of RS's structure identifiers can be found by doing "/locate" command in game.
            // RS's dungeons and wells identifiers can be found here on GitHub:
            //  https://github.com/TelepathicGrunt/RepurposedStructures-Fabric/blob/7f8021cbc073c9919fa0b08dc3b746f9a0e854af/src/main/java/com/telepathicgrunt/repurposedstructures/modinit/RSConfiguredFeatures.java#L268-L290
            """)
    public final Map<String, String> allowedBiomes = Map.of();


    @Comment("""







            // for internal use only. Do not change this."""
    )
    public int configVersion = 2;
}
