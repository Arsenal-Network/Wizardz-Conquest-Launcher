package net.arsenalnetwork.technic;

import java.io.IOException;
import net.arsenalnetwork.utilities.JSONUtils;
import org.json.JSONObject;

public class GetModpack {

    private static String packURL;

    public static void getPack(String packName) throws IOException {
        JSONObject json = JSONUtils.readJsonFromUrl(packURL + packName);
        System.out.println(json.toString());
    }

    static {
        packURL = "https://solder.arsenalnetwork.net/api/modpack/";
    }

}
