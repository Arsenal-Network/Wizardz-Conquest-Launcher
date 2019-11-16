package net.arsenalnetwork.mojang;

import net.arsenalnetwork.utilities.LauncherLogger;
import net.chris54721.openmcauthenticator.OpenMCAuthenticator;
import net.chris54721.openmcauthenticator.exceptions.AuthenticationUnavailableException;
import net.chris54721.openmcauthenticator.exceptions.RequestException;
import net.chris54721.openmcauthenticator.responses.AuthenticationResponse;

public class MojangProfile {

    private String name;
    private String email;
    private String password;

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
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
