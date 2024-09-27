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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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

    @Override
    public double CalcPrice() {
        switch (getFlavor()) {
            case "Chocolate":
                return 17500;

            case "Vanilla":
                return 14000;

            case "Custom Falvor":
                return 2300;

            default:
                JOptionPane.showInputDialog(null, "Error");
                return 0;
        }

    }

    @Override
    public double Iva() {

        double getIva = CalcPrice() * 0.15;

        return getIva;

    }

}
