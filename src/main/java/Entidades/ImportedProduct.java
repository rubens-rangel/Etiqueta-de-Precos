/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Entidades;

public class ImportedProduct extends Product{

    private double customsfee;

    public ImportedProduct(String name, double price, double customsfee) {
        super(name, price);
        this.customsfee = customsfee;
    }

    public double getCustomsfee() {
        return customsfee;
    }

    public void setCustomsfee(double custmsfee) {
        this.customsfee = custmsfee;
    }

    @Override
    public String pricetag() {
        return "R$" + (super.getPrice() + customsfee);
    }

    @Override
    public String toString() {
        return super.getName() + " " + pricetag() + " customsfee: " + customsfee;
    }
}
