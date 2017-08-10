/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autolovers;

/**
 *
 * @author Nalaranga
 */
public class CheckUser {
    public static String loggedUsername;
    public static String loggedPerson;
    
    private static CheckUser uniqueInstatnce;

    public static CheckUser getInstance() {
        if (uniqueInstatnce == null) {
            uniqueInstatnce = new CheckUser();
        }
        return uniqueInstatnce;
    }

    /**
     * @return the loggedUsername
     */
    public String getLoggedUsername() {
        return loggedUsername;
    }

    /**
     * @param loggedUsername the loggedUsername to set
     */
    public void setLoggedUsername(String loggedUsername) {
        this.loggedUsername = loggedUsername;
    }

    /**
     * @return the loggedPerson
     */
    public String getLoggedPerson() {
        return loggedPerson;
    }

    /**
     * @param loggedPerson the loggedPerson to set
     */
    public void setLoggedPerson(String loggedPerson) {
        this.loggedPerson = loggedPerson;
    }
}
