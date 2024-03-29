package net.arsenalnetwork;

import net.arsenalnetwork.files.LauncherFiles;
import net.arsenalnetwork.frame.MainFrame;
import net.arsenalnetwork.mojang.MojangProfile;
import net.arsenalnetwork.technic.GetModpack;
import net.arsenalnetwork.technic.ModpackDownload;
import net.arsenalnetwork.utilities.Constants;
import net.arsenalnetwork.utilities.LauncherLogger;
import net.arsenalnetwork.utilities.OSChecker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

/**
 * Created by MaxIsH0t
 */
public class LauncherMain {

    public static void main(String[] args) {
        getFrame();
        OSChecker.checkOS();

        try {
            GetModpack.getPack("wizardz-conquest-tech-magic");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ModpackDownload.getMods();
        } catch (IOException e) {
            e.printStackTrace();
        }

        MojangProfile.getAuthentication("test", "test");

        LauncherFiles.downloadLauncherFiles();
    }

    /**
     * Gets the main frame screen.
     */
    private static void getFrame() {
        MainFrame mainPingPongGUI = new MainFrame();
        JFrame frm = new JFrame();
        frm.setTitle("WCTM Launcher - " + Constants.VERSION);
        frm.setContentPane(mainPingPongGUI);
        frm.setSize(Constants.displayWidth, Constants.displayHeight);
        frm.setResizable(false);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);

        // Sets the Icon from the resources
        URL res = LauncherMain.class.getClassLoader().getResource("icon.png");
        File file = null;
        try {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String absolutePath = file.getAbsolutePath();
        BufferedImage myImg = null;
        try {
            myImg = ImageIO.read(new File(absolutePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frm.setIconImage(myImg);
        LauncherLogger.setInfoMessage("Main Frame has been loaded successfully!");
    }

}
