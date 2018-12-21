package com.liuyanzhao.blog.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 言曌
 * @date 2018/11/25 下午3:56
 */
@Data
public class ArticleParam {

    private Long articleId;

    private String articleTitle;

    private String articleContent;

    private Long articleParentCategoryId;

    private Long articleChildCategoryId;

    private Integer articleOrder;

    private Integer articleStatus;

    private List<Integer> articleTagIds;

}
