package idk;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Basebot extends Thread {

    private final String baseUrl;
    private final Set<String> visitedUrls = Collections.newSetFromMap(new ConcurrentHashMap<>());

    public Basebot(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void run() {
        crawl(baseUrl);
    }
    
    public Elements display(String url, String type){
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println("Crawling URL: " + url); // Print the URL being crawled
            Elements datas = doc.select(type);
            if (datas.isEmpty()) {
                System.out.println("Không tìm thấy dữ liệu nào : " + url); // Print a message if no images are found
            } else {
                for (Element data : datas) {
                    System.out.println("Dữ liệu được tìm thấy : " + (type == "img[src]" ? data.absUrl("src") : data.text()));
                }
                return datas;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void crawl(String url) {
        if (!visitedUrls.contains(url)) {
            try {
                Document doc = Jsoup.connect(url).get();
                visitedUrls.add(url);
                Elements links = doc.select("a[href]");
                for (Element link : links) {
                    String nextUrl = link.absUrl("href");
                    if (new URL(nextUrl).getHost().equals(new URL(baseUrl).getHost()) && !visitedUrls.contains(nextUrl)) {
                        crawl(nextUrl); // Recursive call to crawl the next URL
                    }
                }
            } catch (IOException e) {
                System.err.println(" crawling thất bại. " + url + ": " + e.getMessage());
            }
        }
    }
}
