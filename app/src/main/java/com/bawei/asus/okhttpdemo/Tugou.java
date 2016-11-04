package com.bawei.asus.okhttpdemo;

/**
 * Created by asus on 2016/11/4.
 */
public class Tugou {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tugou(String description) {
        this.description = description;
    }

    public Tugou() {
        super();
    }

    @Override
    public String toString() {
        return "Tugou{" +
                "description='" + description + '\'' +
                '}';
    }
}
