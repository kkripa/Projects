/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.Serializable;

/**
 *
 * @author Apurva
 */
public class Product implements Serializable{
    
    private String ProductCode;
    private String ProductName;
    private String CatalogCategory;
    private String Description;
    private String ImageURL1;
    private String ImageURL2;
    private String ImageURL3;
    private String ImageURL4;
    private Double Price;

    public Product() {
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setCatalogCategory(String CatalogCategory) {
        this.CatalogCategory = CatalogCategory;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setImageURL1(String ImageURL1) {
        this.ImageURL1 = ImageURL1;
    }

    public void setImageURL2(String ImageURL2) {
        this.ImageURL2 = ImageURL2;
    }

    public void setImageURL3(String ImageURL3) {
        this.ImageURL3 = ImageURL3;
    }

    public void setImageURL4(String ImageURL4) {
        this.ImageURL4 = ImageURL4;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getCatalogCategory() {
        return CatalogCategory;
    }

    public String getDescription() {
        return Description;
    }

    public String getImageURL1() {
        return ImageURL1;
    }

    public String getImageURL2() {
        return ImageURL2;
    }

    public String getImageURL3() {
        return ImageURL3;
    }

    public String getImageURL4() {
        return ImageURL4;
    }

    public Double getPrice() {
        return Price;
    }

    
}