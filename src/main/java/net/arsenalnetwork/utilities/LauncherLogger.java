package net.arsenalnetwork.utilities;

import net.arsenalnetwork.LauncherMain;

import java.util.logging.Logger;

public class LauncherLogger {

    private static final Logger LOGGER = Logger.getLogger(LauncherMain.class.getName());

    public static void setInfoMessage(String message) {
        LOGGER.info(message);
    }

    public static void setWarningMessage(String warningMessage) {
        LOGGER.warning(warningMessage);
    }

}
