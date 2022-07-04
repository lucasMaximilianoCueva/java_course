package main.entities;

import java.util.Objects;

public class Sales {
    private int id;
    private int code;
    private int quantity;
    private int price;
    private String description;

    public Sales(int id, int code, int quantity, int price, String description) {
        this.id = id;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales = (Sales) o;
        return id == sales.id && code == sales.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }
}
