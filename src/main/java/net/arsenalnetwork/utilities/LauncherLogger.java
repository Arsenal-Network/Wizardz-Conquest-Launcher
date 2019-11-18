package net.arsenalnetwork.utilities;

import java.util.logging.Logger;

public class LauncherLogger {

    private static final Logger LOGGER = Logger.getLogger("WCLauncher");

    public static void setInfoMessage(String message) {
        LOGGER.info(message);
    }

    public static void setWarningMessage(String warningMessage) {
        LOGGER.warning(warningMessage);
    }

}
