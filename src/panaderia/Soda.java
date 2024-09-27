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
public class Soda extends Product implements CalculatePrice {

    private String size;
    private double price;
    private int amount;
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        
        switch(this.size) {
            case "Personal":
                price = 1800;
            
            break;
            case "Pet":
                price = 4000;
                
            break;

            case "Familiar":
                price = 6500;
            break;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Precio) {
        this.price = Precio;
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

        double iva = CalcPrice()*0.19;
        
        return iva;
    }

    @Override
    public double priceTotal() {
        return CalcPrice() - Iva();
    }
    
    

}
