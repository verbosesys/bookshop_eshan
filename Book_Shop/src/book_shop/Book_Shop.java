/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_shop;

import UIClasses.Invoice;
import UIClasses.Login_SC;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Nalaranga
 */
public class Book_Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
            new Login_SC().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //new Invoice().setVisible(true);
    }

}
