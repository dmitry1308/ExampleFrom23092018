package ru.schepin.examples.jdbcConnection.model;

import java.sql.Date;

public class Product {
    private int id;
    private String name;
    private int price;
    private int product�ategoriesId;
    private Date date;

    public Product(int id, String name, int price, int product�ategoriesId, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.product�ategoriesId = product�ategoriesId;
        this.date = date;
    }

    public Product(String name, int price, int product�ategoriesId, Date date) {
        this.name = name;
        this.price = price;
        this.product�ategoriesId = product�ategoriesId;
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
        return product�ategoriesId;
    }

    public void setProductCategoriesId(int productCategoriesId) {
        this.product�ategoriesId = productCategoriesId;
    }

    public int getProduct�ategoriesId() {
        return product�ategoriesId;
    }

    public void setProduct�ategoriesId(int product�ategoriesId) {
        this.product�ategoriesId = product�ategoriesId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategoriesId=" + product�ategoriesId +
                ", date=" + date +
                '}';
    }


}
