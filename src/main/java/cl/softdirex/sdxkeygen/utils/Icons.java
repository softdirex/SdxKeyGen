/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.softdirex.sdxkeygen.utils;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author sdx
 */
public class Icons {
    /* Joption Pane del sistema */
    public static String PANELTITLE ="";
    public static int MSG_STATUS=JOptionPane.ABORT;
    public static final String ICON_INFO = "/icons/info_50px.png";
    public static final String ICON_WARN = "/icons/alert_50px.png";
    public static final String ICON_ERROR = "/icons/error_50px.png";
    public static final String ICON_LOGO = "/images/icon.png";
    
    public static String getEnteredIcon(String stIcon) {
        stIcon = stIcon.substring(stIcon.indexOf("/icons"));
        return stIcon.replaceAll(".png", "_1.png");
    }

    public static String getEnteredIconIfActive(String stIcon) {
        stIcon = stIcon.substring(stIcon.indexOf("/icons"));
        return stIcon.replaceAll(".png", "_1.png");//borrar
    }

    public static String getExitedIcon(String img) {
        img = img.substring(img.indexOf("/icons"));
        return img.replaceAll("_1.png", ".png").replaceAll("_2.png", ".png");
    }
//
//    public static String getEnteredIconIfConnected(String stIcon) {
//        stIcon = stIcon.substring(stIcon.indexOf("/icons"));
//        if(WebUtils.isOnline())
//            return stIcon.replaceAll(".png", "_1.png");
//        else
//            return stIcon.replaceAll(".png", "_2.png");
//    }
    
    public static int getMsgStatus(){
        return MSG_STATUS;
    }
    
    public static String iconInfo(){
        return ICON_INFO;
    }
    
    public static String iconWarn(){
        return ICON_WARN;
    }
    
    public static String iconError(){
        return ICON_ERROR;
    }
    
    public static void setMsgStatus(int statusMsg){
        switch(statusMsg){
            case 1:
                MSG_STATUS = (MSG_STATUS!=JOptionPane.WARNING_MESSAGE && MSG_STATUS!=JOptionPane.ERROR_MESSAGE)?JOptionPane.INFORMATION_MESSAGE:MSG_STATUS;
                break;
            case 2: 
                MSG_STATUS = (MSG_STATUS!=JOptionPane.ERROR_MESSAGE)?JOptionPane.WARNING_MESSAGE:MSG_STATUS;
                break;
            case 3:
                MSG_STATUS = JOptionPane.ERROR_MESSAGE;
                break;
            default:
                MSG_STATUS = JOptionPane.ABORT;
                break;
        }
    }
}
