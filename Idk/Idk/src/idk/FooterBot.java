/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idk;

/**
 *
 * @author M7510
 */
public class FooterBot extends Basebot {

    public FooterBot(String baseUrl) {
        super(baseUrl);
    }

    @Override
    protected void crawl(String url) {
        super.crawl(url); // Call the base method to perform the deep crawling
        display(url, "title");
    }
}
