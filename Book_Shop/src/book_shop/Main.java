/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_shop;

/**
 *
 * @author Nalaranga
 */
public class Main {

    public static void main(String[] args) {

        PrinterService printerService = new PrinterService();

        System.out.println(printerService.getPrinters());

        //print some stuff
        printerService.printString("Zonerich AB-88H (Copy 1)", "\n testing testing 1 2 3eeeee \nkkkkkkkkkkkkkkkkk\njjjjjjjjjjj\nhhhhhhhh");

        // cut that paper!
        //byte[] cutP = new byte[]{0x1d, 'V', 1};
        byte[] c = new byte[]{0x1d};
        printerService.printBytes("Zonerich AB-88H (Copy 1)",c);
        byte[] c1 = new byte[]{86};
        printerService.printBytes("Zonerich AB-88H (Copy 1)",c1);
        byte[] c2 = new byte[]{48};
        printerService.printBytes("Zonerich AB-88H (Copy 1)",c2);
        byte[] c3 = new byte[]{100};
        printerService.printBytes("Zonerich AB-88H (Copy 1)",c3);

    }

}
