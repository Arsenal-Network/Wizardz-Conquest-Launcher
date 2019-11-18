package net.arsenalnetwork.files;

import net.arsenalnetwork.utilities.LauncherLogger;
import net.arsenalnetwork.utilities.OSChecker;

import java.io.File;

public class LauncherFiles {

    private static String fileFolder = System.getenv("APPDATA") + "\\" + "Launcher";

    public static void downloadLauncherFiles() {

        LauncherLogger.setInfoMessage("Currently preparing the launcher files download check.");

        if (OSChecker.isWindows()) {
            fileFolder = System.getenv("APPDATA") + "\\" + "Launcher";
            LauncherLogger.setInfoMessage("Found windows");
        } else if (OSChecker.isMac()) {
            fileFolder = System.getProperty("user.home") + "/Library/Application " + "Support" + "Launcher";
            LauncherLogger.setInfoMessage("Found mac");
        }

        LauncherLogger.setInfoMessage("Searching for resource folder");
        File directory = new File(fileFolder);

        if (directory.exists()) {
            LauncherLogger.setInfoMessage("Found folder");
        }

        if (directory.exists() == false) {
            directory.mkdir();
            LauncherLogger.setInfoMessage("Could not find folder so created it");
        }
    }

}
