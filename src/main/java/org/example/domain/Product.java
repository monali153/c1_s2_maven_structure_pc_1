package org.example.domain;

public class Product {

    private int id;
    private String name;
    private int unit;
    private int rating;


    public Product(int id, String name, int unit, int rating) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit=" + unit +
                ", rating=" + rating +
                '}';
    }
}
