package idk;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImageBot extends Basebot {

    public ImageBot(String baseUrl) {
        super(baseUrl);
    }

    @Override
    protected void crawl(String url) {
        super.crawl(url); // Call the base method to perform the deep crawling
        display(url, "img[src]");       
    }
}