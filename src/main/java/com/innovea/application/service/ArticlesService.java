package com.innovea.application.service;

import com.innovea.application.dto.Article;
import com.innovea.application.dto.SuccessDetails;
import com.innovea.application.service.client.ArticlesServiceClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Service
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ArticlesService {
    private final ArticlesServiceClient articlesServiceClient;

    public SuccessDetails getListArticle() {
        List<Article> articleResponseList = articlesServiceClient.getArticles();

        return SuccessDetails.builder().articles(articleResponseList).build();
    }
}
