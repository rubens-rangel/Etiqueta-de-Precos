/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Entidades;

import java.util.Date;

public class UsedProducts extends Product{

    private Date manufactureDate;

    public UsedProducts(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufacteDate() {
        return manufactureDate;
    }

    public void setManufacteDate(Date manufacteDate) {
        this.manufactureDate = manufacteDate;
    }

    @Override
    public String toString() {
        return super.getName() + " " + pricetag() + " Manufacture Date: " + manufactureDate;
    }
}
