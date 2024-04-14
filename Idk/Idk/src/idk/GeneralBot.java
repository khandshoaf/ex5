/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idk;

/**
 *
 * @author M7510
 */
public class GeneralBot{

    //control the run and stop of bot
    String baseUrl;

    TitleBot titleBot;
    ImageBot imageBot;
    ContentBot contentBot;
    HeaderBot headerBot;
    FooterBot footerBot;
    
    private volatile boolean running = true;

    public GeneralBot(String baseUrl) {
        this.baseUrl = baseUrl;
        titleBot = new TitleBot(baseUrl);
//        imageBot = new ImageBot(baseUrl);
      contentBot = new ContentBot(baseUrl);
//        headerBot = new HeaderBot(baseUrl);
//        footerBot = new FooterBot(baseUrl);
    }

    public void run() {
        titleBot.start();
//        imageBot.start();
        contentBot.start();
//        headerBot.start();
//        footerBot.start();
    }
    
    public void stop(){
        titleBot.interrupt();
//        imageBot.interrupt();
//        contentBot.interrupt();
//        headerBot.interrupt();
//        footerBot.interrupt();
    }
}
