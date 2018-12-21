package com.liuyanzhao.blog.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @author liuyanzhao
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 6687286913317513141L;

    private Long categoryId;

    private Integer categoryPid;

    private String categoryName;

    private String categoryDescription;

    private Long categoryOrder;

    private String categoryIcon;

    /**
     * 文章数量(非数据库字段)
     */
    private Integer articleCount;

    public Category(Long categoryId, Integer categoryPid, String categoryName, String categoryDescription, Long categoryOrder, String categoryIcon,Integer articleCount) {
        this.categoryId = categoryId;
        this.categoryPid = categoryPid;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryOrder = categoryOrder;
        this.categoryIcon = categoryIcon;
        this.articleCount = articleCount;
    }

//    category_id,
//    category_pid,
//    category_name,
//    category_description,
//    category_order,
//    category_icon 
    
    // category.category_id, category.category_pid, category.category_name
    
    public Category(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 未分类
     *
     * @return 分类
     */
    public static Category Default() {
        return new Category(100000000l, "未分类");
    }

	public Category(Long categoryId, Integer categoryPid,String categoryName, String categoryDescription,
			Long categoryOrder, String categoryIcon) {
		this.categoryId = categoryId;
		this.categoryPid = categoryPid;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryOrder = categoryOrder;
		this.categoryIcon = categoryIcon;
	}

	public Category(Long categoryId, Integer categoryPid, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryPid = categoryPid;
		this.categoryName = categoryName;
	}


}