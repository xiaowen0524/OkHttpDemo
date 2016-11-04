package com.bawei.asus.okhttpdemo;

import java.util.List;

/**
 * Created by asus on 2016/11/4.
 */
public class Bean {
    private List<Tugou> tugou;

    public List<Tugou> getTugou() {
        return tugou;
    }

    public void setTugou(List<Tugou> tugou) {
        this.tugou = tugou;
    }

    public Bean(List<Tugou> tugou) {
        this.tugou = tugou;
    }

    public Bean() {
        super();
    }

    @Override
    public String toString() {
        return "Bean{" +
                "tugou=" + tugou +
                '}';
    }
}
