package com.ShoppingCart.DreamBD.model;

import java.time.LocalDateTime;
import com.ShoppingCart.DreamBD.model.Product;

import java.util.List;

public class ProductCategory {
    private Long id;
    private String categoryName;
    private String description;
    private String comment;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime modified;
    private String modifiedBy;

    private List<Product> products;

    // Getters and Setters
        public List<Product> getProducts() { return products; }
        public void setProducts(List<Product> products) { this.products = products; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public LocalDateTime getCreated() { return created; }
    public void setCreated(LocalDateTime created) { this.created = created; }
    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
    public LocalDateTime getModified() { return modified; }
    public void setModified(LocalDateTime modified) { this.modified = modified; }
    public String getModifiedBy() { return modifiedBy; }
    public void setModifiedBy(String modifiedBy) { this.modifiedBy = modifiedBy; }
}
