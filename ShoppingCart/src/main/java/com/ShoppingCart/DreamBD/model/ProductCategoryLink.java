package com.ShoppingCart.DreamBD.model;

public class ProductCategoryLink {
    private Long id;
    private Long productId;
    private Long productCategoryId;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }
    public Long getProductCategoryId() { return productCategoryId; }
    public void setProductCategoryId(Long productCategoryId) { this.productCategoryId = productCategoryId; }
}
