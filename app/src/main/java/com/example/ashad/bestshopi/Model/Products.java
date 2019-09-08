package com.example.ashad.bestshopi.Model;

public class Products
{
    private String pname, description, price, category, image, pid, date, time,brand,color,mall, size;

    public Products()
    {

    }

    public Products(String pname, String description, String price, String category, String image, String pid, String date, String time, String brand, String color, String mall, String size) {
        this.pname = pname;
        this.description = description;
        this.price = price;
        this.category = category;
        this.image = image;
        this.pid = pid;
        this.date = date;
        this.time = time;
        this.brand = brand;
        this.color = color;
        this.mall = mall;
        this.size = size;

    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
