package com.example.productApp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue
    private int prodcode;

    private String prodname;

    private String mandate;

    private  String expdate;

    private String brand;

    private int price;

    private String seller;

    private String distributor;

    public ProductModel() {
    }

    public ProductModel(int prodcode, String prodname, String mandate, String expdate, String brand, int price, String seller, String distributor) {
        this.prodcode = prodcode;
        this.prodname = prodname;
        this.mandate = mandate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.seller = seller;
        this.distributor = distributor;
    }

    public int getProdcode() {
        return prodcode;
    }

    public void setProdcode(int prodcode) {
        this.prodcode = prodcode;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
