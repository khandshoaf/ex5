package idk;

public class TitleBot extends Basebot {

    public TitleBot(String baseUrl) {
        super(baseUrl);
    }

    @Override
    protected void crawl(String url) {
        super.crawl(url); // Call the base method to perform the deep crawling
        display(url, "title");
    }
}
