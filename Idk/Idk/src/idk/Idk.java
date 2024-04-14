/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idk;
/**
 *
 * @author M7510
 */
public class Idk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String baseUrl = "https://cotich.net/"; // Base URL for both crawlers

        // Create instances of each bot
        GeneralBot general = new GeneralBot(baseUrl);
        general.run();
    }
    
}
