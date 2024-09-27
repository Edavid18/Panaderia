/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panaderia;

import javax.swing.JOptionPane;

/**
 *
 * @author camilo
 */
public class Dessert extends Product implements  CalculatePrice {

    private String flavor;
    private double price;
    private int amount;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
        
        switch(this.flavor) {
            case "Chocolate":
                price = 17500;
                break;

            case "Vanilla":
                price = 14000;
                break;

            case "Custom Flavor":
                price = 2300;
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public int getBacth() {
        return bacth;
    }

    public void setBacth(int bacth) {
        this.bacth = bacth;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public double CalcPrice() {
        return amount * price;
        
    }

    @Override
    public double Iva() {

        double getIva = CalcPrice() * 0.15;

        return getIva;

    }

    @Override
    public double priceTotal() {
        return CalcPrice() - Iva();
    }

}
