package net.arsenalnetwork.utilities;

public class OSChecker {

    private static String OS = System.getProperty("os.name").toLowerCase();

    /**
     * Checks if the OS Windows or Mac is being used when running the jar.
     */
    public static void checkOS() {
        if (isWindows()) {
            System.out.println("You are currently running the launcher on windows.");
        } else if (isMac()) {
            System.out.println("You are currently running the launcher on mac.");
        } else if (isUnix()) {
            System.out.println("You are currently running the launcher on a non supported OS system. Program Exiting...");
            System.exit(5);
        } else if (isSolaris()) {
            System.out.println("You are currently running the launcher on a non supported OS system. Program Exiting...");
            System.exit(5);
        }
    }

    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);

    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);

    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );

    }

    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }

}
