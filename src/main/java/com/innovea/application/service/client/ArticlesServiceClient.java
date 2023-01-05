package com.innovea.application.service.client;

import com.innovea.application.dto.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "newApiClient", url = "{newapi.endpoint}")
public interface ArticlesServiceClient {
        @RequestMapping("")
        List<Article> getArticles();
}
