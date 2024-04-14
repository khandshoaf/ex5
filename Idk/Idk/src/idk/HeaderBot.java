package idk;

import idk.Basebot;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HeaderBot extends Basebot {

    public HeaderBot(String baseUrl) {
        super(baseUrl);
    }

    @Override
    protected void crawl(String url) {
        super.crawl(url); // Call the base method to perform the deep crawling
        display(url, "#header");
    }
}