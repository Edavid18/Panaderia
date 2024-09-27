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
public class Bread extends Product implements CalculatePrice{

    private int type;
    private double price;
    private int amount;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        
        switch(this.type) {
            case 1:
                price = 1200;
            
            break;
            case 2:
                price = 4500;
                
            break;

            case 3:
                price = 8900;
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
        double getIva = CalcPrice()*0.9;
        
        return getIva;
    }

    @Override
    public double priceTotal() {
        return CalcPrice() - Iva();
    }

    

}
