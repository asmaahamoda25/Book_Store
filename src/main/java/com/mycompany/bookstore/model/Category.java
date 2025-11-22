package com.mycompany.bookstore.model;
import java.util.List;
import java.util.ArrayList;


public class Category {
    private int categoryId;
    private String categoryName; 

    private List<SubCategory> subcategories; 
    
    public Category(String categoryName) {
        this();
        this.categoryName = categoryName;
    }

    public Category()
    {
        this.subcategories = new ArrayList<>(); 
    }
    
    public List<SubCategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubCategory> subcategories) {
        this.subcategories = subcategories;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
}