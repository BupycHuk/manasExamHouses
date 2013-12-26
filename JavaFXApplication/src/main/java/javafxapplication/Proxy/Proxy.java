package javafxapplication.Proxy;

import javafxapplication.Tools.RestTemplateFactory;
import javafxapplication.Tools.UrlService;
import org.springframework.web.client.RestTemplate;


public class Proxy {

    protected RestTemplate restTemplate = RestTemplateFactory.Build();
    protected UrlService urlService = new UrlService();
}
