package net.arsenalnetwork.technic;

import net.arsenalnetwork.utilities.JSONUtils;
import org.json.JSONObject;

import java.io.IOException;

public class ModpackDownload {

    private static String downloadURL;
    private static String version; // TODO create a git repo with a txt file that has the version displayed

    public static void getMods() throws IOException {
        JSONObject json = JSONUtils.readJsonFromUrl(downloadURL);
        System.out.println(json.get("mods"));
        //System.out.println(json.getJSONArray("link"));
    }

    static {
        version = "1.1.3";
        downloadURL = "https://solder.arsenalnetwork.net/api/modpack/wizardz-conquest-tech-magic/" + version + "?include=mods";
    }

}
