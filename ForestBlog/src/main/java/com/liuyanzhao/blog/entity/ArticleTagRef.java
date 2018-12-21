package com.liuyanzhao.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章和标签关联
 *
 * @author 言曌
 * @date 2018/11/17 下午5:20
 */
@Data
public class ArticleTagRef implements Serializable {
    private static final long serialVersionUID = -5816783232020910492L;

    private Long articleId;

    private Integer tagId;

    public ArticleTagRef() {
    }

    public ArticleTagRef(Long articleId, Integer tagId) {
        this.articleId = articleId;
        this.tagId = tagId;
    }
}
