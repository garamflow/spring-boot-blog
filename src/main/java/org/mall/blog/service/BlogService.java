package org.mall.blog.service;

import lombok.RequiredArgsConstructor;
import org.mall.blog.domain.Article;
import org.mall.blog.dto.AddArticleRequest;
import org.mall.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
