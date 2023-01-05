package com.innovea.application.controller;

import com.innovea.application.dto.SuccessDetails;
import com.innovea.application.service.ArticlesService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("api/articles")
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ArtclesController {

    private final ArticlesService articlesService;

    @GetMapping(value="/list", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SuccessDetails> listArticles() {
        SuccessDetails successDetails = articlesService.getListArticle();

        return ResponseEntity.ok().body(successDetails);
    }
}
