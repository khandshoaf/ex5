package idk;

public class ContentBot extends Basebot {

    public ContentBot(String baseUrl) {
        super(baseUrl);
    }

    @Override
    protected void crawl(String url) {
        super.crawl(url); // Call the base method to perform the deep crawling
        display(url, "#wrapper");
//        display(url, "\"p[class=\\\"sapo\\\"]\"");
    }
}
