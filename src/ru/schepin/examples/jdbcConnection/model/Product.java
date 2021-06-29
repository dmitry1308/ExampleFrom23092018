package ru.schepin.examples.jdbcConnection.model;

import java.sql.Date;

public class Product {
    private int id;
    private String name;
    private int price;
    private int productÑategoriesId;
    private Date date;

    public Product(int id, String name, int price, int productÑategoriesId, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productÑategoriesId = productÑategoriesId;
        this.date = date;
    }

    public Product(String name, int price, int productÑategoriesId, Date date) {
        this.name = name;
        this.price = price;
        this.productÑategoriesId = productÑategoriesId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getProductCategoriesId() {
        return productÑategoriesId;
    }

    public void setProductCategoriesId(int productCategoriesId) {
        this.productÑategoriesId = productCategoriesId;
    }

    public int getProductÑategoriesId() {
        return productÑategoriesId;
    }

    public void setProductÑategoriesId(int productÑategoriesId) {
        this.productÑategoriesId = productÑategoriesId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategoriesId=" + productÑategoriesId +
                ", date=" + date +
                '}';
    }


}
