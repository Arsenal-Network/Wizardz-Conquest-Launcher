package net.arsenalnetwork.mojang;

import net.arsenalnetwork.utilities.LauncherLogger;
import net.chris54721.openmcauthenticator.OpenMCAuthenticator;
import net.chris54721.openmcauthenticator.exceptions.AuthenticationUnavailableException;
import net.chris54721.openmcauthenticator.exceptions.RequestException;
import net.chris54721.openmcauthenticator.responses.AuthenticationResponse;

public class MojangProfile {

    /**
     * Allows the user to log in threw their username and password and this method checks if the account exists.
     * @param username Mojang Account Username/Email
     * @param password Mojang Account Password
     */
    public static void getAuthentication(String username, String password) {
        try {
            AuthenticationResponse authResponse = OpenMCAuthenticator.authenticate(username, password);
            String authToken = authResponse.getAccessToken();
        } catch (RequestException e) {
            LauncherLogger.setWarningMessage("Incorrect Username/Email or Password!");
        } catch (AuthenticationUnavailableException e) {
            LauncherLogger.setWarningMessage("Incorrect Username/Email or Password!");
        }
    }

    public String getName() {
        return null; // TODO If the user has passed getAuthentication then display a name on the frame
    }

}
